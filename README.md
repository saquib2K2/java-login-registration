# Login & Registration System

A simple **Login & Registration System** built using **Java, JDBC, Servlets, JSP, and PostgreSQL**.

## 📌 Features
- User Registration with password encryption  
- User Login with session management  
- Logout functionality  
- PostgreSQL as the database  

## 🛠️ Technologies Used
- **Backend:** Java, Servlets, JDBC  
- **Frontend:** JSP, HTML, CSS  
- **Database:** PostgreSQL  

## 📂 Project Structure
project-folder/
│── src/main/java/com/company/
│ ├── dao/ # Data Access Layer
│ ├── servlet/ # Servlets (Login, Register, Logout)
│ ├── util/ # Database Connection
│── src/main/webapp/
│ ├── login.jsp # Login Page
│ ├── register.jsp # Registration Page
│ ├── welcome.jsp # Welcome Page
│ ├── style.css # CSS Styles
│── schema.sql # Database Schema
│── README.md # Project Documentation

bash

## 🚀 Installation & Setup  
1️⃣ **Clone the repository**  
```bash
git clone https://github.com/your-username/login-registration-jsp.git
cd login-registration-jsp
2️⃣ Create the PostgreSQL database

sql
CREATE DATABASE your_database;
3️⃣ Run the schema file
psql -U your_username -d your_database -f schema.sql

4️⃣ Configure DBUtil.java with your PostgreSQL credentials.

5️⃣ Deploy the project on Tomcat/any Java EE server.

6️⃣ Open in a browser:
http://localhost:8080/login.jsp

