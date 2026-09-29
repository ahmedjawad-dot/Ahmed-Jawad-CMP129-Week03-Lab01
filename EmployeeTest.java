public class EmployeeTest {
    public static void main(String args[]){
    

        Employee employee1 = new Employee("joe", 3393, "food", "cook");
        employee1.displayInfo();

        Employee employee2 = new Employee("peter", 424, "IT", "CS");
        employee2.displayInfo();
        Employee employee3 = new Employee();
        employee3.setName("quagmire");

    }
}
