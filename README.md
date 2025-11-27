Project name: Ecommerce
Purpose: Portfolio Project
Tech stack: Java, Spring Boot, PostgreSQL, Docker
Features to be built -
Setup instructions -


# E-Commerce Product API (Learning Project – Iteration 1)

A beginner-friendly Spring Boot REST API that supports basic CRUD operations for managing products.
This first iteration uses an in-memory `ArrayList` instead of a database to focus on core Spring concepts.

---

## ✨ Features (Iteration 1 Scope)

- RESTful CRUD endpoints for `Product`
- Validation using `jakarta.validation`
- Global exception handling (Status codes still need work)
- Clean Controller → Service → Entity layering
- JSON request/response using Spring Web

---

## 🧱 Tech Stack

| Layer         | Technology             |
|---------------|------------------------|
| Runtime       | Java 17                |
| Framework     | Spring Boot            |
| Dependencies  | Spring Web, Validation |
| Storage       | In-memory ArrayList    |
| Build Tool    | Maven                  |

---

## 🚀 Running the Project

### Prerequisites
- Java 17 installed
- Maven installed

### Run the app
```sh
mvn spring-boot:run