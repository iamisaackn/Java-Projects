import EmployeeSystem.*;
import java.util.Scanner;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Calendar;

public class EmployeeMain {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
    } 

    // Method to get Employee Gross
    public static float getGross(Employee E) {
        return E.getSalary() + E.getHseAllowance() + E.getTravAllowance();
    }

    //Employee Tax
    public static float getTax(Employee E) {
        float gross = getGross(E);
        float tax = 0;

        if(gross<=10000){
            tax = 0;
        } else if(gross<=25000) {
            tax = 1000 + 10/100 *(gross - 10000);
        } else if(gross<=35000) {
            tax = 1500 + 20/100 * (gross - 25000);
        } else if(gross<=45000) {
            tax = 3500 + 30/100*(gross - 35000);
        } else if(gross<=55000) {
            tax = 6500 + 40/100*(gross - 45000);
        } 
        return tax; // return 0 if gross > 55000
    }
    
    public static String getMonth(){
        String months[]={"January","February","March","April","May","June","July","August","September","October","November","December"};
        Date dt= new Date();

        GregorianCalendar gc = new GregorianCalendar();
        int month = gc.get(Calendar.MONTH);
        String mon = months[month];

        return mon;
    }

    // A method to Return Current Date
    public static String getDate(){
        Date dt= new Date();
        GregorianCalendar gc = new GregorianCalendar();
        int year = gc.get(Calendar.YEAR);
        int month = gc.get(Calendar.MONTH) + 1; // month is zero-based
        int dte = gc.get(Calendar.DATE);
        String date = (dte+"/"+month+"/"+year);

        return date;
    }

    // A method to Return Time now
    public static String getTime(){
        Date dt = new Date();
        GregorianCalendar gc = new GregorianCalendar();
        int hour = gc.get(Calendar.HOUR_OF_DAY);
        int min = gc.get(Calendar.MINUTE);
        int sec = gc.get(Calendar.SECOND);
        String tm = (hour+":"+min+":"+sec);

        return tm;
    }
}
