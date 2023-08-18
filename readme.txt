===========steps to create eureka client============

1. create the spring project and add these below dependency

    a. add the netflix eureka client dependency
    b. add org.springframework.cloud dependency in dependency-management

2. Add @EnableEurekaClient annotations in main class.

3. Add these below properties in application.properties which will register microservices project as client in eureka server
    eureka.client.register-with-eureka = true
    eureka.client.fetch-registry = true
    eureka.client.service-url.defaultZone = http://localhost:8761/eureka
