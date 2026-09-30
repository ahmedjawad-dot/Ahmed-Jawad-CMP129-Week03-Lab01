/*
 * Student Name:
 * Course: CMP 129
 * Week: 3
 * Lab: 1
 * Problem: 2
 * Date: 9/29/2026
 */
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
        this.name = "jawad";
        this.idNumber = 984284;
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
        return name;                //accessor methods
    }

    public void setName(String n){      //mutator methods
        name = n;
    }
    
    public int getIdNumber(){       //accessor methods
        return idNumber;
    }

    public void setIdNumber(int id){        //mutator methods
        idNumber = id;
    }

    public String getDepartment(){      //accessor methods
        return department;
    }

    public void setDepartment(String d){        //mutator methods
        department = d;
    }

    public String getPosition(){
        return position;                    //accessor methods
    }

    public void setPosition(String p){      //mutator methods
        position = p;
    }

    public void displayInfo(){      //method to display info in certain format
        System.out.println("| Name \t\t| ID Number | Department    | Position     |");
        System.out.println("| ------------- | --------- | ------------- | ------------ |");
        System.out.println("| " + name + "         |       " + idNumber + " | " + department + "            | " + position + "           |");
        System.out.println();
    }

}
