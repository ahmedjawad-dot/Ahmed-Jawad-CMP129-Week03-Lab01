/*
 * Student Name:
 * Course: CMP 129
 * Week: 3
 * Lab: 1
 * Problem: 2
 * Date: 9/29/2026
 */
public class EmployeeTest {
    public static void main(String args[]){
    

        Employee employee1 = new Employee("Joe", 3393, "Food", "Cook");     //object creation for employee 1 with intialized fields
        employee1.displayInfo();

        Employee employee2 = new Employee("Peter", 424, "IT", "CS");
        employee2.getName();
        employee2.displayInfo();

        Employee employee3 = new Employee();
        employee3.setName("Quagmire");
        employee3.setIdNumber(567);
        employee3.setDepartment("Aerospace ");      //mutator methods because no original parameters
        employee3.setPosition("Pilot");
        employee3.displayInfo();
    }
}
