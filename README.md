# SpringSecurity-6 with JWT
### This is a sample project demonstrating the usage of Spring Security Version 6. It provides an example configuration for securing a Spring Boot application using Spring Security.
## Testing Trial
Video Link:
https://drive.google.com/file/d/1oUEOLleirHsNJey3_Q1A0_vw8w4rQm0B/view?usp=sharing

Youtube Link: 
https://youtu.be/5EzRV8KclFA

## Prerequisites =>
To run this project, you need to have the following installed on your machine:

-    Java Development Kit (JDK) 8 or higher
-    Maven build tool
-    Spring Boot
## Getting Started =>
Follow these steps to get started with the project:

1. Clone the repository:
### Copy code
<> git clone https://github.com/your-username/spring-security-6.git </>

2. Navigate to the project directory:
<> cd spring-security-v6-sample </>

3. Build the project using Maven:
<>mvn clean install</>
4. Run the application:
   <> mvn spring-boot:run </>

## Configuration =>
The project includes a basic configuration for Spring Security in the application.yml file. You can customize the security configuration by modifying this file according to your requirements.

## Features =>
This sample project demonstrates the following features of Spring Security Version 6:

-    Authentication using various authentication mechanisms of JWT.
-    Authorization using role-based or permission-based access control.
-    Password hashing and encryption.
-    Session management and CSRF protection.
-    Customizing authentication and authorization logic.

## Resources =>
For more information about Spring Security Version 6 and its features, refer to the official documentation:
<a href="https://spring.io/projects/spring-security/">Spring Security Help</a>

## Contributing =>
Contributions are welcome! If you find any issues or have suggestions for improvements, please feel free to open an issue or submit a pull request.

## Installation and Run =>
-  You can clone this repo and start the serve on localhost
-   Before running the API server, we should update the database config inside the application.properties file.
-   Update the port number, username and password as per our local database config.
    -   server.port=8888
    -   spring.datasource.url=jdbc:mysql://localhost:3306/demo-controller OR,
    -   spring.datasource.url=jdbc:h2:mem:testdb
    -   spring.h2.console.path=/h2-console
    -   spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver //OR 
    -   spring.datasource.username=**Your UserName**
    -   spring.datasource.password=**YourPassword**
    -   spring.jpa.hibernate.ddl-auto=update
    -   spring.jpa.show-sql=true
    -   spring.mvc.pathmatch.matching-strategy = ANT_PATH_MATCHER

## Contact =>
For any questions or inquiries, please contact sgrprmnk@gmail.com
