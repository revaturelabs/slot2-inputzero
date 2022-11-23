
SQL

DDL - CRUD 
Joins
Aggergate functions
GroupBy
Orderby

"Table: Employees(EmpID, EmpName, Department, ProjectName, Salary, City, Gender)   Where 'EmpID'  is the Primary Key

1. List the number of employees in each department

2. Select all the Employees whose Salary is between 10000 and 20000

3. Select all the employees assigned to the ProjectName starts with 'Alpha'

4. Select all records from the Employees table, sort the result alphabetically by the column City.

5. Write a SQL Query to print the total number of employees whose salary is above 10,000

6. Write a SQL Query to return the highest salary of employees in each department

7. Write a SQL Query to return the minimum salary of employees in each department

8. Write a SQL Query to print the number of employees whose salary is above 10,000"

9. Table A -> Student (sid, sname, courseid)  TableB -> Course (courseid, coursename, creditpoints). write join queries

JDBC
---

JDBC Driver 

Interfaces -> Connection, statement, prepared statement, ResultSet (Callable Statement)

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
