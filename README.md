# Springboot-Microservice-With-Docker
Spring Boot Microservice with Docker containerization. Microservice uses the Database MySQL

In all applications run in docker unsing linux and Access the all url:http://192.168.99.100/

OpenJdk:https://hub.docker.com/_/openjdk
Mysql: https://hub.docker.com/_/mysql

In this application URLS:

Eureka Server: http://192.168.99.100:7001/

Zuul Server: http://192.168.99.100:7005/

Microservice 1 Zuul url: http://192.168.99.100:7005/servone/test

Microservice 2 Zuul with mysql DB url:http://192.168.99.100:9008/getData



Reference:

https://dzone.com/articles/build-package-and-run-spring-boot-apps-with-docker

https://mkyong.com/docker/docker-spring-boot-examples/

https://developer.okta.com/blog/2019/12/27/spring-boot-deploy-docker

https://www.callicoder.com/spring-boot-docker-example/

https://www.tutorialspoint.com/spring_boot/spring_boot_creating_docker_image.htm
