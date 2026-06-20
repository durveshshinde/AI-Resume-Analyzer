# 🚀 AI Resume Analyzer

An **AI-powered Resume Analyzer** built using **Spring Boot** that evaluates resumes with **ATS keyword matching, skill detection, job role compatibility, and intelligent career roadmap suggestions**, presented through an interactive dashboard UI.

---

## 🔥 Features

* 📄 Resume Upload & Parsing (PDF)
* 🧠 Skill Extraction
* 🎯 Resume Score Calculation
* 🔍 ATS Keyword Analysis
* 💼 Job Role Matching
* 📊 Skill Analysis Dashboard
* 📄 Resume Section Detection (Skills, Education, Experience)
* 💡 Smart AI Suggestions
* 🎯 Career Roadmap Generator
* 🎨 Interactive UI with charts and animations

---

## 🛠️ Tech Stack

### 🔹 Backend

* Java 17
* Spring Boot
* Spring MVC
* Apache PDFBox (for PDF parsing)

### 🔹 Frontend

* HTML5
* CSS3
* JavaScript
* Chart.js

### 🔹 Tools

* Eclipse / IntelliJ
* Maven
* Postman (API testing)

---

## 📁 Project Structure

```
ai-resume-analyzer/
│
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/resume/analyzer/
│   │   │       ├── controller/
│   │   │       │   └── ResumeController.java
│   │   │       │
│   │   │       ├── service/
│   │   │       │   └── ResumeService.java
│   │   │       │
│   │   │       └── BackendApplication.java
│   │   │
│   │   └── resources/
│   │       ├── static/
│   │       │   └── index.html
│   │       │
│   │       └── application.properties
│
├── pom.xml
└── README.md
```

---

## 🚀 How to Run the Project

### 1️⃣ Clone Repository

```
git clone https://github.com/your-username/ai-resume-analyzer.git
cd ai-resume-analyzer
```

### 2️⃣ Run Backend

* Open project in IDE
* Run `BackendApplication.java`

### 3️⃣ Open in Browser

```
http://localhost:8080/
```

---

## 📊 How It Works

1. Upload Resume (PDF)
2. Extract text using PDFBox
3. Detect skills from resume
4. Calculate resume score
5. Match with selected job role
6. Perform ATS keyword analysis
7. Detect resume sections
8. Generate AI-based suggestions and career roadmap
9. Display results in dashboard

---

## 🎯 Sample Output

* 🎯 Score: 75/100
* 🛠️ Skills: Java, SQL, HTML
* 🔍 ATS Score: 68%
* 📄 Sections: Skills ✅, Education ✅, Experience ❌
* 🎯 Career Roadmap: Suggestions to improve profile

---

## 💡 Future Enhancements

* 🌐 Deploy online (Netlify + Render)
* ⚛️ Convert frontend to React
* 🤖 Integrate OpenAI for advanced AI suggestions
* 🔐 Add user login & history tracking
* 📊 Advanced analytics dashboard

---

## 👨‍💻 Author

**Durvesh Shinde**

---

## ⭐ If you like this project

Give it a ⭐ on GitHub!
