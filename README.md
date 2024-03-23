# Getting Started

### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/3.2.4/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/3.2.4/maven-plugin/reference/html/#build-image)
* [Spring Web](https://docs.spring.io/spring-boot/docs/3.2.4/reference/htmlsingle/index.html#web)
* [OAuth2 Resource Server](https://docs.spring.io/spring-boot/docs/3.2.4/reference/htmlsingle/index.html#web.security.oauth2.server)
* [Spring Data JPA](https://docs.spring.io/spring-boot/docs/3.2.4/reference/htmlsingle/index.html#data.sql.jpa-and-spring-data)
* [Spring Data JDBC](https://docs.spring.io/spring-boot/docs/3.2.4/reference/htmlsingle/index.html#data.sql.jdbc)

### Guides
The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/rest/)
* [Accessing Data with JPA](https://spring.io/guides/gs/accessing-data-jpa/)
* [Using Spring Data JDBC](https://github.com/spring-projects/spring-data-examples/tree/master/jdbc/basics)


## README STARTS HERE
So we are going to start connecting the data base, for that you have to go to *applicatio.properties*

## What I did after
What I did was starting the models packages, I named it Model

in that you will create you models with the next JPA annotations.

At the start of the class you will start with @Entity and @Table(name = "$NAMEOFTHETABLE")

- @Entity: This annotation is used to mark a class as an entity, an entity is JPA represents a table in a relational database.
- @Table:  This annotation is used to specify the dtails of the databse table

Afterwards I wrote the id as a private and a Long
The annotations for the id are @Id and @GeneratedValue
- @Id: This annotations is used to mark a property of an entity as its PK
- @GenerateValie: This annotation works to specify how the PK value should be geenrated for new entity instance

And to end end the Team Model and added the final fields, those fields had the @Column annotation
- @Column: Is used to specify the mapping of the property to a column on the DB

@Service
@RestController
JPARepository
@RequestMapping 
@GetMapping


