# E-Commerce Backend

### Getting Started

#### Requirements
* docker installed
* java 21
* Maven installed
* IDEA (optional)

---

Open Terminal

```bash
git clone https://github.com/deeqma/ecommerce.git
```
change directory

```bash
cd ecommerce
```

Create a `.env` file in the project root:

```env
DB_PASSWORD=your_password
```


Start PostgreSQL

```bash
docker compose up -d --build
```

In `application-dev.properties`:

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/ecommerce
spring.datasource.username=admin
spring.datasource.password=${DB_PASSWORD}

spring.jpa.hibernate.ddl-auto=create-drop
spring.jpa.show-sql=true
```
> **Note:** Set the `DB_PASSWORD` environment variable before running the application. Spring Boot uses it in `application-dev.properties` through `${DB_PASSWORD}`.

#### Run Backend

```bash
mvn spring-boot:run -Dspring-boot.run.profiles=dev
```

## Tech Stack

* Java 21
* Spring Boot 4.1.1
* Docker
* PostgreSQL + Spring JPA
* Maven