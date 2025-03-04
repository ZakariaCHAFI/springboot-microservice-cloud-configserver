# Spring Boot Microservices - Spring Cloud Config Server

Spring Cloud Config Server which provides the configuration values for all of our microservices.

add dependency : 

    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-actuator</artifactId>
    </dependency>

    <dependency>
        <groupId>org.springframework.cloud</groupId>
        <artifactId>spring-cloud-config-server</artifactId>
    </dependency>

Next, enable Config Server using `@EnableConfigServer` Annotation  to the main entry point class

## Refactor department-service to use Config Server
Our department-service will become a client for Config Server. 
So, let us add Config Client starter dependency to the department-service:

    <dependency>
        <groupId>org.springframework.cloud</groupId>
        <artifactId>spring-cloud-starter-config</artifactId>
    </dependency>

    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-actuator</artifactId>
    </dependency>