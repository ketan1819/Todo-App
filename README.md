# 📝 Todo Management System

A Spring Boot–based Todo Management System built using RESTful APIs, Aspect-Oriented Programming (AOP), and a clean layered architecture.  
This project demonstrates enterprise-level backend development practices suitable for real-world applications and technical interviews.

---

## 🚀 Features

- Create, update, delete, and retrieve todo items
- RESTful API design
- Layered architecture (Controller, Service, Repository)
- Aspect-Oriented Programming (AOP)
- Centralized exception handling
- Request validation using annotations
- Logging and performance monitoring
- Clean, maintainable, and scalable codebase

---

## 🛠 Tech Stack

- Java  
- Spring Boot  
- Spring Web (REST APIs)  
- Spring AOP  
- Postman  


---

## 🔗 REST API Endpoints

| HTTP Method | Endpoint | Description |
|------------|----------|-------------|
| POST | `/api/todos` | Create a new todo |
| GET | `/api/todos` | Get all todos |
| GET | `/api/todos/{id}` | Get todo by ID |
| PUT | `/api/todos/{id}` | Update an existing todo |
| DELETE | `/api/todos/{id}` | Delete a todo |

---

## 🧠 Aspect-Oriented Programming (AOP)

Spring AOP is used to handle cross-cutting concerns such as:

- Method execution logging
- Performance measurement
- Centralized exception logging
- Separation of business logic and infrastructure logic

---

## ▶️ How to Run the Application

### Prerequisites

- Java 17 or higher
- Maven
- Any Java IDE (IntelliJ IDEA / Eclipse)

### Steps

```bash
git clone https://github.com/your-username/TodoManagementSystem.git
cd TodoManagementSystem
mvn spring-boot:run


