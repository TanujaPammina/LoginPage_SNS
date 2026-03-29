# 🔐 Java Login & Signup System

A simple full-stack web application built using **Java Servlets, MySQL, and Apache Tomcat** that allows users to register and login securely.

---

## 🚀 Features

- User Registration (Signup)
- User Authentication (Login)
- MySQL Database Integration
- Secure query handling using PreparedStatement
- Clean and modern UI

---

## 🛠️ Technologies Used

- Frontend: HTML, CSS
- Backend: Java Servlets
- Database: MySQL
- Server: Apache Tomcat

---

## 📁 Project Structure
# 🔐 Java Login & Signup System

A simple full-stack web application built using **Java Servlets, MySQL, and Apache Tomcat** that allows users to register and login securely.

---

## 🚀 Features

- User Registration (Signup)
- User Authentication (Login)
- MySQL Database Integration
- Secure query handling using PreparedStatement
- Clean and modern UI

---

## 🛠️ Technologies Used

- Frontend: HTML, CSS
- Backend: Java Servlets
- Database: MySQL
- Server: Apache Tomcat

---

## 📁 Project Structure
# 🔐 Java Login & Signup System

A simple full-stack web application built using **Java Servlets, MySQL, and Apache Tomcat** that allows users to register and login securely.

---

## 🚀 Features

- User Registration (Signup)
- User Authentication (Login)
- MySQL Database Integration
- Secure query handling using PreparedStatement
- Clean and modern UI

---

## 🛠️ Technologies Used

- Frontend: HTML, CSS
- Backend: Java Servlets
- Database: MySQL
- Server: Apache Tomcat

---

## 📁 Project Structure
LoginApp/
│
├── login.html
├── register.html
├── LoginServlet.java
├── SignupServlet.java
│
└── WEB-INF/
├── web.xml
└── classes/

---

## ⚙️ Setup Instructions

### 1. Install Required Software

- Java JDK
- Apache Tomcat
- MySQL Server

---

```md id="fix123"
### 🔹 2. Database Setup

```sql
CREATE DATABASE testdb;

USE testdb;

CREATE TABLE users (
    id INT AUTO_INCREMENT PRIMARY KEY,
    userId VARCHAR(50),
    password VARCHAR(50)
);
```
---
```md id="fix456"
### 🔹 3. Configure Database Connection

Update credentials in Java files:

```java
Connection con = DriverManager.getConnection(
    "jdbc:mysql://localhost:3306/testdb",
    "root",
    "your_password"
);
```
---

### 🔹 4. Compile Servlets

```bash
javac -cp "path_to_servlet-api.jar" LoginServlet.java
javac -cp "path_to_servlet-api.jar" SignupServlet.java
---

### 🔹 5. Deployment

```bash
Place project folder inside Tomcat webapps
Start Tomcat server
Open browser:
http://localhost:8080/LoginApp/login.html
---


### 🔹 System Workflow

```bash
User opens login page
New user → Register → Data stored in MySQL
Existing user → Login → Credentials verified
Result displayed on screen
---
### 🔐 Security
```bash
Uses PreparedStatement to prevent SQL Injection
(Future Improvement: Password hashing)
---
### 🚀 Future Improvements
Password encryption (hashing)
Session management
Dashboard page after login
Improved UI/UX
---
### 👩‍💻 Author

Tanuja Pammina
