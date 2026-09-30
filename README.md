# Notes App (Spring Boot MVC)

A simple beginner project: add, view and delete notes.

## Tech stack
- Java 17
- Spring Boot 3 (Spring MVC, Spring Data JPA)
- Thymeleaf (frontend)
- H2 database (in-memory)
- Maven

## Project structure (MVC)
- `model/Note.java` - data (Model)
- `repository/NoteRepository.java` - database access
- `controller/NoteController.java` - request handling (Controller)
- `templates/index.html` - page (View)

## Run
```
mvn spring-boot:run
```
Then open http://localhost:8080

H2 console: http://localhost:8080/h2-console (JDBC URL: `jdbc:h2:mem:notesdb`, user: `sa`, no password)

## Switch to MySQL (optional)
1. Replace the H2 dependency in `pom.xml` with `mysql-connector-j`.
2. Update the `spring.datasource.*` lines in `application.properties`.
