# Spring-CURD-API
This Spring Boot project illustrates the implementation of basic CRUD functionality for a "Students" database. It showcases the exposure of REST APIs to facilitate Create, Read, Update, and Delete operations on student records.
API's to provide web services
1)GET - http://localhost:8080/school/student/all

2)GET - http://localhost:8080/school/student/search/{Student ID} instead of {Student ID} you have to give id of student

3)GET - http://localhost:8080/school/student/search/gender/{Gender} instead of {Gender} you have to mention gender of student you wou want to see

4)POST - http://localhost:8080/school/student/add body { "studentnm": "", "rollno": "", "education": "", "gender": "", "feespaid": , "feesunpaid": , "phone": "" }

5)PUT - http://localhost:8080/school/student/payfees?studid=2&amount=2000

6)DELETE - http://localhost:8080/school/student/remove?studid=11
