<h1 align="center">🚀 Spring Boot Cohort 3.0 — Coding Shuttle</h1>

<p align="center">
  <img src="https://img.shields.io/badge/Spring_Boot-3.3+-brightgreen?logo=springboot&logoColor=white" alt="Spring Boot"/>
  <img src="https://img.shields.io/badge/Java-23-blue?logo=openjdk&logoColor=white" alt="Java"/>
  <img src="https://img.shields.io/badge/Maven-Build%20Tool-orange?logo=apachemaven&logoColor=white" alt="Maven"/>
  <img src="https://img.shields.io/badge/Status-Learning%20In%20Progress-yellow?style=flat-square"/>
</p>

---

## 📘 About the Cohort

> **Spring Boot Cohort 3.0** by *Coding Shuttle* is an end-to-end backend development program using **Java + Spring Boot**.  
> The course covers everything from **Spring Core, REST APIs, Security, Microservices, Docker, CI/CD, to Kubernetes**, all with practical, project-based learning.

You will go from **Spring beginner → Advanced backend engineer**, learning to design, build, and deploy enterprise-grade systems.

---

## 🧩 Curriculum Overview

### 🌱 **Spring Framework Core**
- Spring IoC Container & Bean Lifecycle  
- Dependency Injection (Constructor / Setter / Field)  
- AutoConfiguration, Component Scanning  
- Spring MVC with Controllers, Models & Views  
- Integration with Hibernate ORM  
- Exception Handling and Bean Validation  
- Lombok & ModelMapper Integration  

### ⚙️ **Spring Boot & RESTful APIs**
- Build CRUD REST APIs  
- Request/Response Mapping and DTOs  
- Global Exception Handling & Response Wrapping  
- REST Template & Third-Party API Integrations  
- Actuator Monitoring & Logging  
- Swagger/OpenAPI Documentation  
- Spring Boot Dev Tools for faster development  

### 🧠 **Spring Data & Databases**
- Spring Data JPA with Hibernate ORM  
- Custom Queries and Query Methods  
- DTO Mapping & Projection  
- MySQL, PostgreSQL, and NoSQL Integration  
- JPA Relationships (One-to-Many, Many-to-Many)  
- Auditing & Transaction Management  

### 🔐 **Spring Security & Authentication**
- Spring Security 6 Integration  
- Role-Based Access Control (RBAC)  
- JWT Authentication & Authorization  
- Google OAuth Login  
- Password Encoding with BCrypt  
- User Registration and Login System  
- Session Management  

### 🧪 **Testing & Environment Profiles**
- Unit Testing with **JUnit 5**  
- Mocking with **Mockito**  
- Integration Tests for REST APIs  
- Using **Spring Profiles** for dev, stage, prod  
- Test Containers & H2 Database  

### ☁️ **Microservices & Spring Cloud**
- Monolithic vs. Microservice Architecture  
- Service Communication: **RestTemplate**, **WebClient**, **OpenFeign**  
- Service Registry with **Eureka**  
- API Gateway using **Spring Cloud Gateway**  
- Centralized Configuration with **Config Server**  
- Distributed Tracing with **Sleuth + Zipkin**  
- Resilience4j — Circuit Breaker, Retry, RateLimiter  
- Securing Microservices with JWT  

### 🧰 **DevOps & Deployment**
- AWS CI/CD Pipelines with **CodePipeline** & **CodeDeploy**  
- Elastic Beanstalk Deployment  
- Build Automation with `buildspec.yml`  
- Dockerizing Spring Boot Applications  
- Docker Compose for Multi-Container Apps  
- Kubernetes Orchestration  
- Kubernetes Dashboard, Services, and Load Balancing  

### 💬 **Messaging & Caching**
- Redis Cache & Pub/Sub Messaging  
- Apache Kafka Producer–Consumer System  
- Spring Boot Kafka Messaging  

---

## 💻 Mini Projects Built

| Module | Project | Key Learnings |
|--------|----------|--------------|
| 🧩 REST APIs | Employee Management System | CRUD APIs, DTOs, ModelMapper, JPA |
| 🔐 Security | User Authentication System | Spring Security, JWT, OAuth |
| ☁️ Microservices | Product-Order Microservice | Eureka, Gateway, Feign |
| 🚀 DevOps | CI/CD Deployment | AWS CodePipeline + Elastic Beanstalk |
| 🐳 Containers | Dockerized Spring App | Dockerfile + Docker Compose |
| 📨 Messaging | Kafka Event System | Pub/Sub, Topic Partitioning |

---

## ⚙️ Tech Stack

| Category | Technologies |
|-----------|---------------|
| **Language** | Java 23 |
| **Framework** | Spring Boot 3.3+ |
| **ORM / DB** | Hibernate, JPA, MySQL, PostgreSQL |
| **Security** | Spring Security 6, JWT, OAuth2 |
| **Libraries** | Lombok, ModelMapper, Swagger, Actuator |
| **Build Tool** | Maven |
| **Testing** | JUnit 5, Mockito |
| **DevOps** | AWS CodePipeline, Docker, Kubernetes |
| **Messaging** | Kafka, Redis |
| **Monitoring** | Spring Boot Actuator, ELK Stack |

---

## 🧱 Project Setup Guide

### 🛠️ Prerequisites
- Java 17+ (Recommended Java 23)
- Maven 3.9+
- MySQL / PostgreSQL Installed
- IntelliJ IDEA or VS Code with Lombok Plugin Enabled

### ⚙️ Steps to Run Locally

```bash
# 1️⃣ Clone the repository
git clone https://github.com/Aditya-raghuvanshi19/SpringBoot-Cohort-3.0.git

# 2️⃣ Open the project in IntelliJ IDEA or VS Code

# 3️⃣ Configure database in application.properties
spring.datasource.url=jdbc:mysql://localhost:3306/employeedb
spring.datasource.username=root
spring.datasource.password=yourpassword

# 4️⃣ Build and run
mvn clean install
mvn spring-boot:run
