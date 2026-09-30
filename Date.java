/*
 * Student Name:
 * Course: CMP 129
 * Week: 3
 * Lab: 1
 * Problem: 1
 * Date: 9/23/2026
 */
public class Date {
    
    private int month;
    private int day;    //private variable initializaation
    private int year;

    public Date(int m, int d, int y){   //constructor with month, day, and year parameters with input validation for months and days
        if (m < 1 || m > 12){
            System.out.print("Invalid Month");
            System.out.println();
        }
        else
            month = m;
        if (d < 1 || d > 31){
            System.out.print("Invalid Day");
            System.out.println();
        }
        else
            day = d;
        year = y;
    }


    public int getMonth(){
        return month;
    }

    public int getDay(){
        return day;
    }                       //accessor methods

    public int getYear(){
        return year;
    }

    public void setMonth(int m){
        if (m < 1 || m > 12)
            System.out.print("You Set an Invalid Month");
        else
            month = m;
    }

    public void setDay(int d){
        if (d < 1 || d > 31)
            System.out.print("You Set an Invalid Day");
        else                                                            //mutator methods and input validation for months and days.
            day = d;
    }

    public void setYear(int y){
        year = y;
    }

    public void displayNumeric(){
        if (month >= 1 && month <=31 && day >=1 && day <=31){
            System.out.print(month + "/" + day + "/" + year);
            System.out.println();
        }
    }
    public void displayMonthFirst(){
        String[] months = {"January","February","March","April","May","June","July","August","September","October","November","December"};
        for(int i=0; i<=11; i++){
            if (month == i+1)                                           //converts numerical month into standard format using array
                System.out.print(months[i]+" "+ day + ", " + year);
        }
        System.out.println();
    }
    
    
    public void displayDayFirst(){
        String[] months = {"January","February","March","April","May","June","July","August","September","October","November","December"};
        for(int i=0; i<=11; i++){
            if (month == i+1)
                System.out.print(day + " " + months[i] + " " + year);   
        }   
        System.out.println();
    }
}
