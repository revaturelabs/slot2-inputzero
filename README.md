# Input Zero Questions

- Job Role: Java Developer
- CTC : 4 LPA above (Confirm with delivery team)
- Job Location: Bangalore/Guragon

Technical Interview Main Focus (Round 1 especially)
- Project
- Java
- SQL
- JDBC
- HTML
- CSS
- JS
- Coding questions - [Click here](./Coding%20Problems/)
- Angular - [Click here](./Angular%20FAQs.pdf)
- Spring - [Click here](./Spring%20FAQs.pdf)

# Interview Structure

Initially, there will be a assessment.

Followed by, selected candidates will have 3 rounds

1. Technical Round - Teams
2. Technical Round - Face 2 Face/In-person
3. HR Round - Teams


# Project Expln should have

 - I worked on a Project Name
 - describe your project:
 - the userstories/modules/ responsiblites you've worked on  
 - technologies used: In these project, we've used Angular to develop a front end and 
		      Spring as a backend.
 - dataflow (user stories/when you explain)

# Java

### Java Basics
Java -> features, JVM/JRE/JDK, platform independent
(what do you know about java, what's experience with ur java)

control statements -> for, for each, do while, while , if , if else, switch
(problem solving, predict the output, error debugging)

access modifiers -> private, public, protected and default

non access modifiers -> static , final -> variable, method, class

### Arrays

Arrays -> declare, addding element to an array, accessing any element
          .length attribute, 1D array, 2D array

### Strings

Strings -> immutables, string pool, 

String s  = "Porkodi" -> String literal
String s  = new String("Porkodi") -> String object

How java stores string literal and string object
== vs equals
String methods -> .length(), .charAt(), .substring(), toUpperCase()/toLowerCase(),
		.concat(), replace()

String Builder and String Buffer -> difference, threadsafe, which slower or faster

//reverse a string
String s = sc.next();
StringBuffer sb = new StringBuffer(s);
sb.reverse();
String rev_s = sb.toString();
		 
thread -> program in execution
main thread -> main method
multiple threads are created to perform the task simulante

### Stack vs heap memory

Car c  = new Car()

stack

c -> 23578136487

heap -> data inside the object

### OOP

OOPs -> a pie -> what is it, example, how to implement in java


functional Interface -> has only one abstract method 

### Exceptions

[Click Here](./Exceptions/)


### Collections

[Click Here](./Collections)

### Java 8

[Click Here](./Java8/)


# SQL - Topics

- DDL - CRUD 
- Joins
- Aggergate functions
- GroupBy
- Orderby

## Queries Must Know

**Table: Employees(EmpID, EmpName, Department, ProjectName, Salary, City, Gender)   Where 'EmpID'  is the Primary Key**

1. List the number of employees in each department

2. Select all the Employees whose Salary is between 10000 and 20000

3. Select all the employees assigned to the ProjectName starts with 'Alpha'

4. Select all records from the Employees table, sort the result alphabetically by the column City.

5. Write a SQL Query to print the total number of employees whose salary is above 10,000

6. Write a SQL Query to return the highest salary of employees in each department

7. Write a SQL Query to return the minimum salary of employees in each department

8. Write a SQL Query to print the number of employees whose salary is above 10,000"

9. Table A -> Student (sid, sname, courseid)  TableB -> Course (courseid, coursename, creditpoints). write join queries

## JDBC Topics

- JDBC Driver 

- Interfaces -> Connection, statement, prepared statement, ResultSet (Callable Statement)

```java
public List<Employee> findAllEmployeesByManagerID(int mId) {

		List<Employee> eList = new ArrayList<Employee>();
		try {
			// insert into Employee values();

			Connection con = ConnectionUtil.getConnection();
			PreparedStatement stmt = con.prepareStatement(" Select * from employee where m_id =  ?");
			
			stmt.setInt(1, mId);
			// set of rows -> resiult set

			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				// each row -> each object

				Employee e = new Employee();

				// in a row
				// column index -> 1. e_id
				e.seteId(rs.getInt(1));

				// 2. e_name

				e.seteName(rs.getString(2));

				// 3. e_email

				e.seteEmail(rs.getString(3));
				// 4. e_password

				e.setePassword(rs.getString(4));

				// 5. m_id
				e.setmId(rs.getInt(5));

				eList.add(e);

			}

		} catch (Exception ex) {
			System.err.println(ex.getMessage());
		}

		return eList;
	}
 ```

# HTML - HyperText Markup Language

- creates/design to web page
- Web, Web page, Web site, Web Browser, Client Server arch, HTTP

### HTML Tags
- 2 sections: body and title
- b,i,u,p
- heading tags - 6 : h1 to h6
- list: ol, ul,dd
- table
- image: src from local & online
- video: iframe put in html
- linkto other page : <a>, href
- src, href -> attributes

# CSS - Cascading Style sheets

- colors/styling to the page
- types: inline, internal and external
- style tag

### CSS types
- inline -> style as an attribute
- internal -> style tag in head section
- external ->.css, <link rel = "stylesheet" href= "">

### CSS selectors  
- Element Selectors, id selectors and class selectors
- syntax:
```
selector-name{
	property name : propertyvalue;
}
```
- element -> p{}, id -> #, class ->.
- attribute: bgcolor, background-image, font-, color

# Angular

### ng if 
- Structural directive
- if its true, only that true block added to the dom and remove the false block from the dom and viceversa

### Ng if and ng show

Ng-if can be used as attribute like *ngIf 
ng-show and ng-hide can be used as hidden attribute like [hidden]
 
- ngshow 
- angularjs directive - in angular 2+ we use as [hidden]
	- [hidden] = true -> block will not be showed/ hidden
	- [hidden] = false -> block will show on the ui
- Either its true or false, it will be in your dom 
<input type="text" placeholder="Enter a number" [(ngModel)]="num" />

```ts
<div *ngIf=" num %2 == 0; else elseBlock">
    Entered Number is even
</div>

<ng-template #elseBlock>
    Entered number is odd
</ng-template>

<div [hidden]=" num %2 ==0">
    True will be hidden! for all even numbers it would be hidden, for odd numbers it would show
</div>

```



