# Java-SE-CPUT
All exercises from CPUT Application Development Practice

Write the class definition for an Employee using the following UML:

Employee
-empName: String
-empSurname: String
-empNumber: String
-empSalary: double
+Employee()
+Employee(n: String, sn: String, num: String)
+setEmpName (nm: String): void
+setEmpSurname (snm: String): void
+setEmpNumber (num: String): void
+setEmpSalary (sal: double): void
+getEmpName(): String
+getEmpSurname(): String
+getEmpNumber(): String
+getEmpSalary(): double
+increaseSalary(amt: double): void
+toString(): String


The argument of the increaseSalary() method is a value representing the percentage increase required.

Now write another class that contains a main method in which you use both constructors to construct 2 Employee objects. Use the Scanner class to enter values for all the instance variables.
Now call the appropriate method/s to display the property values for each object. Increase the salary of each object by 10% and 15% respectively (use the Scanner class for input).
Now display the property values for each object again.

