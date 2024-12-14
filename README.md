
**This project is a RESTful web service designed for a rental agency that manages properties near MTU's Bishopstown campus, which are rented to students.** The service tracks properties, tenants, and users, providing full CRUD functionality via RESTful and GraphQL services. Each property and tenant has unique identifiers, and the system enforces strict validation rules for user authentication and authorization.

Key features include listing properties, managing tenants within capacity constraints, calculating total rental income, and ensuring secure access with different roles (office staff and managers). The project utilizes **Spring Boot, Spring Data JPA, Spring Web MVC, Spring Security, and Spring GraphQL**, along with **H2 for the embedded database**. AOP (
Abstract Oriented Programming) is implemented for logging at method and class levels, and unit tests are included for key endpoints to ensure robust functionality.
