# 📜 Support Agent Chatbot for CDP by Abubakar Chanda

## 📊 Project Description
The **Support Agent Chatbot** is designed to answer "how-to" questions related to **Customer Data Platforms (CDPs)** including **Segment, mParticle, Lytics, and Zeotap**. It retrieves relevant information from official documentation to provide step-by-step guidance on various platform functionalities.

Built using a **Java Full Stack** approach, it consists of:
- **Frontend:** React.js
- **Backend:** Spring Boot (Java)
- **Database:** MySQL
- **Web Scraping:** JSoup

This project was developed as part of an assignment for **Zeotap's Software Engineer Intern** position.

---

## 🛠 Tech Stack Used
| Component  | Technology  |
|------------|-------------|
| Frontend | React.js, CSS (Tailwind) |
| Backend  | Spring Boot, Java  |
| Database  | MySQL  |
| Web Scraping | JSoup (Extract documentation) |
| API Communication | RESTful APIs (Axios) |
| Security | CORS Policy (Spring Security) |
| Build Tools | Maven, npm |

---

## 📜 How to Run the Project (Step-by-Step Guide)

### 🔹 1. Clone the Repository
```sh
git clone <https://github.com/arshsnaz/chatbot-project>
```

### 🔹 2. Setup the Backend (Spring Boot)

✅ **Step 1: Configure MySQL Database**
1. Open MySQL Workbench and create a new database:
```sql
CREATE DATABASE chatbotdb;
```
2. Update database credentials in `application.properties`:
```properties
spring.datasource.url=jdbc:mysql://localhost:3306/chatbotdb
spring.datasource.username=root
spring.datasource.password=your_password
```

✅ **Step 2: Run the Spring Boot Backend**
```sh
cd chatbot-backend
mvn clean install
mvn spring-boot:run
```
The backend should now be running at: `http://localhost:8080/`

---

### 🔹 3. Setup the Frontend (React.js)
```sh
cd chatbot-frontend
npm install
npm start
```
The frontend should now be running at: `http://localhost:3000/`

---

## ✅ Features Implemented
### 📌 Core Functionalities
✔️ Answers "How-to" questions for Segment, mParticle, Lytics, and Zeotap
✔️ Extracts data from official documentation using **JSoup** and stores in **MySQL**
✔️ Handles variations in question phrasing
✔️ Prevents irrelevant queries from being processed

### 📌 Bonus Features
✔️ Cross-CDP Comparisons (Segment vs. Lytics, etc.)
✔️ Advanced "How-to" queries (e.g., configuring event tracking in mParticle)
✔️ Modern UI with **Dark Mode Toggle**
✔️ Optimized **search logic** for better responses
✔️ Improved **UI animations & responsiveness**

---

## 🛡 Security & Performance Enhancements

### 🔐 Security
✅ **CORS Policy** – Secure API access from React frontend
✅ **Input Validation** – Prevents invalid queries
✅ **Sanitized API Requests** – Protection against SQL Injection

### ⚡ Performance
✅ **Optimized Database Queries** – Ensures fast retrieval of responses
✅ **Pre-fetched Documentation Storage** – Reduces reliance on live web scraping
✅ **Lazy Loading Components** – Improves UI performance

---

## 📎 GitHub
🔗 **Repository:** [Chatbot Repo](https://github.com/arshsnaz/chatbot-project)
🔗 **arshsnaz:** [Abubakar's Profile](https://github.com/arshsnaz)

---

## 📝 Author
👨‍💻 Developed By: **Abubakar Chanda**  
📧 Email: abubakarchanda3@gmail.com  

---

## 🚀 How to Contribute
If you'd like to contribute:
```sh
git clone https://github.com/arshsnaz/chatbot-project
git checkout -b feature-branch
git commit -m "Added new feature"
git push origin feature-branch
```

---

## 🎯 Final Notes
This project was created as a **Zeotap Software Engineer Intern Assignment**. It provides an AI-powered chatbot that assists users with **CDP documentation-based queries** using **Java Full Stack (Spring Boot, React, MySQL, JSoup)**.

Thank you for checking out the project! 🙌

