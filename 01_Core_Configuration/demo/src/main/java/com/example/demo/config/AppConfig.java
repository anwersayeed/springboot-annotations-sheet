package com.example.demo.config;

import com.example.demo.service.EmailService;
import com.example.demo.service.MessageService;
import com.example.demo.service.SMSService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;

@Configuration  // Declares this class as configuration source
@PropertySource("classpath:custom.properties") // Loads additional properties
public class AppConfig {

    @Value("${service.message}") // Inject value from custom.properties
    private String message;

    @Bean
    @Primary // This will be the default MessageService when multiple exist
    public MessageService emailService() {
        return new EmailService(message);
    }

    @Bean
    @Lazy // SMSService bean will not be created unless requested
    public MessageService smsService() {
        return new SMSService("Lazy loaded SMS Service");
    }

    @Bean
    @Conditional(ProductionCondition.class) // Loads bean only if profile is 'prod'
    public String prodOnlyBean() {
        return "This bean is only loaded in production!";
    }
}
