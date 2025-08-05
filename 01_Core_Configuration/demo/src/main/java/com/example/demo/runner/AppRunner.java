package com.example.demo.runner;

import com.example.demo.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class AppRunner implements CommandLineRunner {

    @Autowired
    private MessageService messageService; // Primary bean will be injected

    @Autowired
    private ApplicationContext context;

    @Override
    public void run(String... args) {
        System.out.println("Running Application...");

        messageService.sendMessage(); // Uses @Primary EmailService

        // Lazy bean will initialize only now
        MessageService smsService = context.getBean("smsService", MessageService.class);
        smsService.sendMessage();

        // Conditional bean (prodOnlyBean) will only be loaded in 'prod' profile
        if (context.containsBean("prodOnlyBean")) {
            String prodMessage = (String) context.getBean("prodOnlyBean");
            System.out.println(prodMessage);
        }
    }
}
