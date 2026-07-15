# Mini CRM System

A full-stack Customer Relationship Management (CRM) application built using **Spring Boot**, **React**, **MySQL**, and **JWT Authentication**. The application allows users to manage leads, convert leads into customers, track tasks, and monitor activities through a clean dashboard.

---

## Features

### Authentication

* User Login using JWT
* Password Encryption with BCrypt
* Protected API Endpoints

### Lead Management

* Add Lead
* Update Lead
* Delete Lead
* Search Lead by Name or Email
* Filter Leads by Status
* Convert Lead to Customer

### Customer Management

* View Converted Customers

### Task Management

* Create Task
* Update Task
* Delete Task
* View All Tasks

### Activity Management

* Record Activities
* View Activity History

### Dashboard

* Display CRM Overview
* Navigation to all modules

---

## Tech Stack

### Frontend

* React
* React Router
* Axios
* Bootstrap 5

### Backend

* Spring Boot
* Spring Security
* JWT Authentication
* Spring Data JPA
* Hibernate

### Database

* MySQL

### Build Tools

* Maven
* Vite

---

## Project Structure

### Backend

```
src
 ├── controller
 ├── service
 ├── repository
 ├── entity
 ├── dto
 ├── config
 ├── util
 └── exception
```

### Frontend

```
src
 ├── components
 ├── pages
 ├── services
 ├── assets
 └── App.jsx
```

---

## Database Entities

* User
* Lead
* Customer
* Task
* Activity

---

## Main Features

* JWT Authentication
* CRUD Operations
* Lead Conversion
* Search & Filter
* Form Validation
* REST APIs
* Responsive UI

---

## API Endpoints

### Authentication

```
POST /api/auth/login
POST /api/auth/register
```

### Leads

```
GET /api/leads
POST /api/leads
PUT /api/leads/{id}
DELETE /api/leads/{id}

GET /api/leads/search/name
GET /api/leads/search/email
GET /api/leads/search/company

GET /api/leads/filter/status

POST /api/leads/{id}/convert
```

### Customers

```
GET /api/customers
```

### Tasks

```
GET /api/tasks
POST /api/tasks
PUT /api/tasks/{id}
DELETE /api/tasks/{id}
```

### Activities

```
GET /api/activities
POST /api/activities
```

---

## Validation

### Backend Validation

* Required Fields
* Email Validation
* Phone Number Validation
* String Length Validation
* Password Validation

### Frontend Validation

* Required Fields
* Email Format Validation
* Phone Number Validation
* Login Validation

---

## How to Run

### Backend

1. Clone the repository

```
git clone <repository-url>
```

2. Configure MySQL

3. Update `application.properties`

4. Run

```
mvn spring-boot:run
```

---

### Frontend

Install dependencies

```
npm install
```

Run

```
npm run dev
```

---

## Future Improvements

* Role-Based Access Control
* Customer Edit/Delete
* Email Notifications
* File Uploads
* Reports & Analytics
* Pagination
* Docker Deployment

---

## Author

**Rajat Choudhary**
