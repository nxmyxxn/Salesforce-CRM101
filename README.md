# Salesforce-CRM101

---
## Group Project - HelloWeb2   
A simple web application that saves user input from a form to an Oracle database and displays the result.

---
## 🛠 Tech Stack

- **JSP**
- **JDBC (Java Database Connectivity)**
- **Oracle Database**
- **Apache Tomcat**
- **Eclipse IDE**
- **DBeaver**

---

## 📁 Project Structure
![image](https://github.com/user-attachments/assets/ada75536-43fb-4d39-9f78-10e400900563)

---
## 🔄 Application Flow

1. **`form.jsp`**  
   - Displays an input form where users can enter their data.

2. **`insert.jsp`**  
   - Retrieves submitted data from the request.
   - Populates a `FormVo` (Value Object). vo 객체에 값을 채워넣음
   - Uses `FormDao` (Data Access Object) to insert the data into the Oracle database. FormDao 사용해서 진짜 db에 넣는 작업.
   - Forwards the request to `result.jsp`.

3. **`result.jsp`**  
   - Displays the data that was just inserted into the database.

4. **`FormVo.java`**
   - A simple Java class that holds the data fields with getters and setters.

5. **`FormDao.java`**
   - Handles database operations like `insert()` and `select()` using JDBC.
   - Establishes a connection to the Oracle database.

---

## ⚙️ Features

- Accepts user input through a web form.
- Connects to Oracle DB and performs insert operations via JDBC.
- Displays the submitted data as confirmation.
- Demonstrates MVC-like separation using DAO and VO patterns.

---

## 🚀 Getting Started

1. Clone the repository into your Eclipse workspace.
2. Set up your Oracle database and update connection details in `FormDao.java`.
3. Run on Apache Tomcat locally.
4. Access `form.jsp` via your local server (e.g., `http://localhost:8080/HelloWeb2/GroupProject/form.jsp`).
5. Fill out the form, submit it, and check the result page.

---

## 📌 Notes

- This project is designed for learning basic web application structure with JSP and JDBC.
- For production-level code, using a proper MVC framework like Spring MVC is recommended.

---
## 🖼️ Screenshots

### Database Setup 
![image](https://github.com/user-attachments/assets/9b6a5713-b736-4d3d-8c24-ce88759b17f0)
### Input Form
![Screenshot 2025-05-24 235130](https://github.com/user-attachments/assets/63e53ca1-e482-431d-ad03-2a29b02e136a)
### Table Data Preview 
![image](https://github.com/user-attachments/assets/119218e7-984c-45d8-9b0d-0564fb6a8a02)
### Submission Result
![image](https://github.com/user-attachments/assets/6276d0a4-3753-42f2-938b-f9b1e847ecba)
### Notes
![image](https://github.com/user-attachments/assets/e1f827a4-b7a1-45c0-b38f-e986efe1498b)





