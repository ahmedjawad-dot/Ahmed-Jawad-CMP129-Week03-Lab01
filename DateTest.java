/*
 * Student Name:
 * Course: CMP 129
 * Week: 3
 * Lab: 1
 * Problem: 1
 * Date: 9/23/2026
 */
public class DateTest {
 
    public static void main(String[] args)
    {
        Date date = new Date(0,32,2026);        //object creation in main with initialized fields
        date.setDay(32);
        date.getDay();
        date.getMonth();
        date.getYear(); 
        date.displayDayFirst();
        date.displayMonthFirst();
        date.displayNumeric();

        Date date2 = new Date(5,8,2025);
        date2.setDay(8);
        date2.getDay();
        date2.getMonth();
        date2.getYear(); 
        date2.displayDayFirst();
        date2.displayMonthFirst();
        date2.displayNumeric();
    }
}
