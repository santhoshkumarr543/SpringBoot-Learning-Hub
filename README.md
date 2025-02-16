I)Student CRUD Application :
This is a simple Spring Boot application that demonstrates CRUD (Create, Read, Update, Delete) operations for managing student data. The application follows a layered architecture with Model, Controller, and Service components.

II)Project Structure:
StudentCRUD
│── src
│   ├── main
│   │   ├── java
│   │   │   ├── model
│   │   │   ├── controller
│   │   │   ├── service
│   │   │   ├── SpringCrudApplication.java

III)Features:
1.Add Student: Create a new student entry.
2.Get Students: Retrieve the list of students.
3.Update Student: Modify student details.
4.Delete Student: Remove a student from the database.

IV)Technologies Used:
1.Java
2.Spring Boot
3.Spring MVC
4.Collections(ArrayList)

V)How to Run:
1.Clone the repository:
git clone https://github.com/your-username/StudentCRUD.git
2.Navigate to the project directory:
cd StudentCRUD
3.Run the application using:
mvn spring-boot:run
4.The application will start on http://localhost:8080.

VIAPI Endpoints:
Method	    Endpoint	      Description
GET	      /students      	Fetch all students
POST	    /students	      Add a new student
PUT	      /students/{rno}	Update a student by ID
DELETE	  /students/{rno}	Delete a student by ID
