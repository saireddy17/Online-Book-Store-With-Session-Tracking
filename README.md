#  OnlineBookStore With Session Tracking 
- A Java Web Developement Project
<!--Check out the Live website demo: [https://theonlinebookstore.herokuapp.com](https://theonlinebookstore.herokuapp.com)-->
- User Login Credentials: (Demo/demo)
- Admin Login Credentials: (Admin/Admin)
<hr>

### About

A user-friendly Online Bookstore project in which users can log in or register, view the available books, select books along with their quantity, and buy them and add to cart. The project can also be used by the administrator, who can add new books, remove books, increase and decrease the quantity of books, change the price of the books as well as maintain the selling history of books.Session Tracking is used for track the user And Admin

![onlinebookstore](https://user-images.githubusercontent.com/34605595/137615096-8447d32d-bddc-4f13-a8ed-3c0f4dd5e04e.png)

<span style="color:blue">**This Website is built for following purpose:-**</span>
- For Selling books online.
- Maintaining books selling history.
- Adding and managing books.
- User Friendly.
- For Implementation of Http Servlets in Java.
- This is a Mini-project developed using Java, Jdbc, Jsp And Servlets.

<span style="color:blue">**Admin Have Following Access for this online store site:-**</span>
- Create New Account or Register.
- Add New Books.
- View Books Available.
- Remove Books.
- Increase Books Amount.

<span style="color:blue">**Users Have Following Access for this online store site:-**</span>
- Create New Account or Register.
- Login.
- View Available Books.
- Select Books to Buy.
- Select Books Quantity.
- Buy Books.
- Add To Cart.

### Technologies used:-
1. Front-End Development:
  - HTML
  - CSS
  - Javascript

2. Back-End Development:
  - Java [JDK 8+]
  - JDBC
  - Servlet
  - JSP

3. Database:
  - SQL PLUS / ORACLE

### ================ Software And Tools Required ================
- ORACLE/PL-SQL
- Eclipse [Enterprise Edition]
- Java [JDK 8+]
- Tomcat v8.0+
- Apache Tomcat
-Note:- This is a Sample Project, So we have used only Generic Servlet and not taken care for Security.

### ================= Dummy Database Initialization =================

STEP 1: Open SQL PLUS Command Prompt or SQL PLUS

STEP 2: Login to the administrator user as : ```sqlplus -u <username> -p``` (Enter Password if asked)

STEP 3: Copy paste the following MySql Commands-
```SQL PLUS
create database if not exists onlinebookstore;

use onlinebookstore;

create table  BookDetails57(code varchar2(10),name varchar2(100),author varchar2(100),price number(10,2),qty number(10),primary key(code));

create table  Admin57(uname varchar2(15),pword varchar2(15),fname varchar2(15),lname varchar2(15),addr varchar2(15),mid varchar2(25),phno number(15),primary key(uname));

create table Customer57(uname varchar2(15),pword varchar2(15),fname varchar2(15),lname varchar2(15),addr varchar2(15),mid varchar2(25),phno number(15),primary key(uname));

insert into BookDetails57 values('A1111','The Go Programming Language','Alan A. A. Donovan and Brian W. Kernighan',400,8);
insert into BookDetails57 values('B2222','C++ Primer','Stanley Lippman and Josée Lajoie and Barbara Moo',976,13);
insert into BookDetails57 values('C3333','The Rust Programming Language','Steve Klabnik and Carol Nichols',560,12);
insert into BookDetails57 values('D4444','Head First Java','Kathy Sierra and Bert Bates and Trisha Gee',754,23);
insert into BookDetails57 values('E55555','Fluent Python','Luciano Ramalho',1014,5);
insert into BookDetails57 values('F66666','The Road to Learn React','Robin Wieruch',239,18);
insert into BookDetails57 values('G7777','Clean Code: A Handbook of Agile Software Craftsmanship','Robert C Martin',288,3);
insert into BookDetails57 values('H8888','Domain-Driven Design','Eric Evans',560,28);
insert into BookDetails57 values('I99999','A Programmers Guide to Computer Science','William Springer',188,4);
insert into Customer57 values('Demo','demo','Demo','User','Demo Home','demo@gmail.com','42502216225');
insert into Customer57 values('user','user','Mr.','Admin','Haldia WB','admin@gmail.com','9584552224521');
insert into Customer57 values('saireddy','sai','Muni','Sai','AP','sai@gmail.com','1236547089');
insert into Admin57 values('demo','demo','Demo','User','Demo Home','demo@gmail.com','42502216225');
insert into Admin57 values('Admin','Admin','Mr.sai','Admin','Haldia WB','admin@gmail.com','9584552224521');
insert into Admin57 values('saireddy','saireddy','Muni','Sai','AP','sai@gmail.com','1236547089');

commit;

```

### ========== Importing and Running The Project Through Eclipse EE ==========

Step 0: Open Eclipse Enterprise Edition. [Install, if not already installed.]

Step 1: Click On File > Import > Git > Projects From Git > Clone Uri > Paste The Repository Url as: ```https://github.com/saireddy17/Online-Book-Store-With-Session-Tracking.git```> Select master Branch > Next > Next > Finish.

Step 2. a: Go inside ```src/main/resources > DBConnection``` and update the value of database details as per your usage, like db.driver, db.host, db.username and db.password according to your installed mysql/postgresql admin user credentials.

Step 2.b: Right Click on Project > Run as > Maven Build > In the goals field enter "clean install" > apply > run

Step 2.c: Right Click On Project > Build Path > Configure Build Path > Libraries > Remove and Update Any Libraries if Red Mark Exists > Finish.

Step 3: [Only If Tomcat Server is not configured in Eclipse] : Right Click On Project > Run As > Run On Server > Select Tomcat V8.0 > (Select Tomcat V8.0 Installation Location If Asked) Next > Add onlinebookstore > Finish.

Step 4: In The Server Tab > Double Click On Tomcat Server > Ports > Change The Port Number For Http/1.1 To 8083 > Close And Save.

Step 5: Right Click On Project > Run As > Run On Server > Select Tomcat v8.0 > Next > Add All> Done.

Step 6: Check Running The Site At  <a href="http://localhost:8082/OnlineBookStore/">http://localhost:8082/OnlineBookStore/</a>

Step 7: Default Username And Password For Admin Is "Admin" And "Admin"

Step 8: The default Username And Password For User Is "Saireddy" And "sai"

## FAQ
**Question:1** Unable to Connect to Database?

**Answer:** Please check you have installed the SQL PLUS correctly and have updated the correct db details in application.properties file. Also you can try doing maven clean install and force update the project and restart.

Note:- Considering this as a Sample Project, we have not much considered of web security.
<hr>

## Some Screenshots for the project:
<img width="941" alt="image" src="https://github.com/saireddy17/Online-Book-Store-With-Session-Tracking/blob/main/java_Project_onlineBook-master/ScreenShots/1.png">
<img width="954" alt="image" src="https://github.com/saireddy17/Online-Book-Store-With-Session-Tracking/blob/main/java_Project_onlineBook-master/ScreenShots/2.png">
<img width="930" alt="image" src="https://github.com/saireddy17/Online-Book-Store-With-Session-Tracking/blob/main/java_Project_onlineBook-master/ScreenShots/3.png">
<img width="934" alt="image" src="https://github.com/saireddy17/Online-Book-Store-With-Session-Tracking/blob/main/java_Project_onlineBook-master/ScreenShots/4.png">
<img width="946" alt="image" src="https://github.com/saireddy17/Online-Book-Store-With-Session-Tracking/blob/main/java_Project_onlineBook-master/ScreenShots/5.png">


## "Suggestions and project improvement ideas are welcomed!"

<bold>Thanks a lot,</bold><br/>
                                                                                                        Project Leader<br/>
                                                                                                         <b>SAIREDDY</b>
