[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-24ddc0f5d75046c5622901739e7c5dd533143b0c8e959d652212380cedb1ea36.svg)](https://classroom.github.com/a/eEf93O-z)

Flow:

1.	Professor will create the course.

2.	Students will register for courses and will get number of credits.

3.	Total Number of Credits taken will be validated by employer and student will declare the graduation status.

4.	Student, Professor and Employer directories would be maintained.

5.	Average rating of all the Courses for a Professor would be calculated.

6.	On the basis of Professor rating student will decide register for the course of a given professor.


ENTITIES:

1.	Classes
•	Course: This class contains the details about a course. It has id, name and credits as it’s attributes.
•	CourseList: This class contains the information about the courses a student has taken and the grades he/she has scored in it. It has attributes like studentID, course and grade in it.
•	Professor: This class contains the basic information about a Professor, course taught by that Professor and their rating. It has attributes like ProfessorID, ProfessorName, coursesTaught and rating.
•	ProfessorDirectory: This class contains the list of all the faculties present in the CourseNet. It has the attribute called faculties.
•	Transcripts: This class contains a list of courses taken by a student. It has an attribute called coursesTaken.
•	Student: This class contains the information about a student. It has attributes like studentID, studentName, joiningSalary, salaryAfterFiveYears and transcript.
•	StudentDirectory: This class contains the list of all the students who are from a particular CourseNet. It has an attribute called directory.
•	Employer: This class contains all basic information about a CourseNet. It is meant to compare universities on the basis of it’s rating. It has attributes like EmployerID, EmployerName, studentDirectory, ProfessorDirectory and rating.
•	EmployerDirectory: This class contains the list of all the universities present in the CourseNet. It has the attribute called universities.

