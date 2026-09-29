public class Employee {
 
    String name;
    int idNumber;
    String department;
    String position;

    public Employee(String name, int idNumber, String department,String position){
        this.name = name;
        this.idNumber = idNumber;
        this.department = department;
        this.position = position;
    }

    public Employee(String name, int idNumber){
        name = "jawad";
        idNumber = 984284;
        department = "";
        position = "";

    }

    public Employee(){
        name = "";
        department = "";
        position = "";
        idNumber = 0;
    }

    public String getName(){
        return name;
    }

    public void setName(String n){
        name = n;
    }
    
    public int getIdNumber(){
        return idNumber;
    }

    public void setIdNumber(int id){
        idNumber = id;
    }

    public String getDepartment(){
        return department;
    }

    public void setDepartment(String d){
        department = d;
    }

    public String getPosition(){
        return position;
    }

    public void setPosition(String p){
        position = p;
    }

    public void displayInfo(){
        System.out.println("| Name \t\t| ID Number | Department    | Position      |");
        System.out.println("| ------------- | --------- | ------------| ------------ |");
        System.out.println("| " + name + "   |    " + idNumber + " | " + department + "   | " + position + " |");

    }
/* 
| Name         | ID Number | Department    | Position       |
| ------------ | --------: | ------------- | -------------- |
| Susan Meyers |     47899 | Accounting    | Vice President |
| Mark Jones   |     39119 | IT            | Programmer     |
| Joy Rogers   |     81774 | Manufacturing | Engineer       |
*/
}
