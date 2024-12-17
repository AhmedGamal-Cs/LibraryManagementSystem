# **Library Management System**

## **Front End:**
- **IDE**: NetBeans  
- **Functions**:  
    1. **Login Page**  
    2. **Books Available**  
    3. **Staff Details**  
    4. **Add Books**  
    5. **Remove Books**  
    6. **Add Staff**  
    7. **Remove Staff**  

## **Back End:**
- **Database**: MySQL  

### **Tables:**
1. **Admin Table**  
2. **Books Table**  
3. **Staff Table**  

---

### **Table Structures**

#### **1. Admin Table**
```sql
CREATE TABLE ADMIN (
    USER_ID VARCHAR(50) PRIMARY KEY,
    NAME VARCHAR(50),
    PASSWORD VARCHAR(50),
    CONTACT VARCHAR(10)
);

CREATE TABLE BOOKS (
    BOOK_ID VARCHAR(50) PRIMARY KEY,
    CATEGORY VARCHAR(50),
    NAME VARCHAR(50),
    AUTHOR VARCHAR(50),
    COPIES INT
);

CREATE TABLE STAFFS (
    STAFF_ID VARCHAR(50) PRIMARY KEY,
    NAME VARCHAR(50),
    CONTACT VARCHAR(50)
);

How to Run the Project
1-Setup Database:

Install MySQL and create the database.
Use the table structures provided above to set up the tables.
Configure Database Connection:

2-Update the Conn.getConnection() method in your project with your MySQL database credentials.
Run the Project:

3-Open the project in NetBeans.
Run the project and test the functions.
