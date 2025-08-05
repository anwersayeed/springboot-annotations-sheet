
## 🔧 Core Configuration
| Annotation                 | Description                                                                 |
| -------------------------- | --------------------------------------------------------------------------- |
| `@SpringBootApplication`   | Combines `@Configuration`, `@EnableAutoConfiguration`, and `@ComponentScan` |
| `@EnableAutoConfiguration` | Enables Spring Boot’s auto-configuration mechanism                          |
| `@Configuration`           | Declares a class as a configuration class                                   |
| `@ComponentScan`           | Scans for components in specified packages                                  |
| `@Bean`                    | Declares a bean-producing method                                            |
| `@Value`                   | Injects values from properties or other sources                             |
| `@PropertySource`          | Loads property files into Spring Environment                                |
| `@Conditional`             | Loads beans conditionally                                                   |
| `@Profile`                 | Specifies bean registration for specific environments                       |
| `@Lazy`                    | Delays bean initialization                                                  |
| `@Primary`                 | Gives preference to a bean during autowiring                                |

## 🧩 Component Types
| Annotation        | Description                                         |
| ----------------- | --------------------------------------------------- |
| `@Component`      | Generic stereotype for any Spring-managed component |
| `@Service`        | Marks a business service layer component            |
| `@Repository`     | Marks a data access object (DAO)                    |
| `@Controller`     | Marks a class as a Spring MVC controller            |
| `@RestController` | Combines `@Controller` and `@ResponseBody`          |
| `@Autowired`      | Automatically wires dependencies into beans         |

## 🌐 Web Annotations
| Annotation           | Description                                     |
| -------------------- | ----------------------------------------------- |
| `@RequestMapping`    | Maps web requests to handler methods            |
| `@GetMapping`        | Shortcut for `@RequestMapping(method = GET)`    |
| `@PostMapping`       | Shortcut for `@RequestMapping(method = POST)`   |
| `@PutMapping`        | Shortcut for `@RequestMapping(method = PUT)`    |
| `@DeleteMapping`     | Shortcut for `@RequestMapping(method = DELETE)` |
| `@PatchMapping`      | Shortcut for `@RequestMapping(method = PATCH)`  |
| `@RequestBody`       | Binds request body to a method parameter        |
| `@ResponseBody`      | Returns method value directly as HTTP response  |
| `@PathVariable`      | Extracts URI template variable                  |
| `@RequestParam`      | Binds method parameter to query string          |
| `@RequestHeader`     | Access specific request headers                 |
| `@CookieValue`       | Binds method parameter to cookie value          |
| `@ModelAttribute`    | Binds form data to model object                 |
| `@SessionAttributes` | Stores model attributes in session              |
| `@CrossOrigin`       | Enables CORS for method/class                   |

## ⚠️ Exception Handling
| Annotation          | Description                                     |
| ------------------- | ----------------------------------------------- |
| `@ExceptionHandler` | Handles exceptions at the method level          |
| `@ControllerAdvice` | Global exception handler across all controllers |

## ⏱ Scheduling & Async
| Annotation          | Description                                   |
| ------------------- | --------------------------------------------- |
| `@Async`            | Runs methods asynchronously                   |
| `@Scheduled`        | Schedules method execution at fixed intervals |
| `@EnableScheduling` | Enables scheduling support                    |

## 🔐 Transactions
| Annotation                     | Description                                         |
| ------------------------------ | --------------------------------------------------- |
| `@Transactional`               | Declares a method/class to run within a transaction |
| `@EnableTransactionManagement` | Enables annotation-driven transaction management    |

## 🗃 Persistence (JPA/Hibernate)
| Annotation                                             | Description                                        |
| ------------------------------------------------------ | -------------------------------------------------- |
| `@Entity`                                              | Marks a class as a JPA entity                      |
| `@Table`                                               | Specifies DB table for the entity                  |
| `@Id`                                                  | Marks the primary key field                        |
| `@GeneratedValue`                                      | Specifies the primary key generation strategy      |
| `@Column`                                              | Maps field to a DB column                          |
| `@OneToOne`, `@OneToMany`, `@ManyToOne`, `@ManyToMany` | Entity relationships                               |
| `@JoinColumn`                                          | Configures the foreign key column in relationships |


## 📦 JSON Serialization (Jackson)
| Annotation              | Description                                         |
| ----------------------- | --------------------------------------------------- |
| `@JsonIgnoreProperties` | Ignores specified properties during JSON processing |
| `@JsonProperty`         | Maps JSON property to Java field or vice versa      |

## 🧪 Testing
| Annotation        | Description                                     |
| ----------------- | ----------------------------------------------- |
| `@SpringBootTest` | Boots full Spring context for integration tests |
| `@Test`           | Marks a test method in JUnit                    |

## ✨ Lombok Utility
| Annotation | Description                                  |
| ---------- | -------------------------------------------- |
| `@Builder` | Auto-generates a builder for object creation |



