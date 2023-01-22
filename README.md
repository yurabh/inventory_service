                                            inventory_service
                                   
1)About the project.

This project is an inverter microservice that sends messages using bus-amqp.

Spring Cloud Client, Spring Cloud Config, Spring Cloud Evreka Client are also used.

2)Start the project locally.

2.1 Required to install the project.

Java 11
MySql 8.0.18

2.2 How to run project.

You should create environmental variables that are defined in the resources package like:

application.properties.

2.2.1 For application.properties you should set the value like:

* spring.cloud.config.uri=${Value}
* management.endpoints.web.exposure.include=${Value}
* eureka.instance-id=${Value}
* spring.application.name=${Value}
* server.port=${Value}
* spring.cloud.loadbalancer.ribbon.enabled=${Value}
