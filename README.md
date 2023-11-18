# Dodo

A Simple Todo CRUD application built with Spring, Thymeleaf templating and h2 local database

### What I learned

---

-   models package
    -   JPA @entity annotation
    -   @Table annotation
    -   Lombok @Getters and @Setters
    -   models implement Serializable
    -   @Id annotation generated with @GeneratedValue
    -   @Override the toString() method when implementing Serializable
-   repositories package
    -   @Repository annotation
    -   `extends JpaRepository<Task, Long>` , because id is a long
-   services package
    -   @Service annotation
    -   injecting the repository into service with @Autowired
    -   Optional wrapper class
    -   Basic CRUD repository methods
-   controllers package
    -   @Controller annotation
    -   @GetMapping annotation to define routes
    -   @PostMapping annotation to create objects
    -   @Valid annotation for helper validation
    -   ModelAndView object from spring ui
    -   Pass ModelAndView to template
    -   Query parameters with @PathVariable annotation
    -   orElseThrow on Optional objects
-   templates
    -   dynamic data with thymeleaf
    -   posting to an endpoint with thymeleaf
