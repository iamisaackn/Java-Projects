package EmployeeSystem;

import java.util.*;


public class Employee {
 
    Scanner scan = new Scanner(System.in);

    // Declaration
    String name;
    String dob;
    String empnum;
    String position;
    String dpt;
    String gender;
    float salary;
    float hsallowance;
    float travallowance;

    // Get and Set Methods
    public void setAllowance(){
        hsallowance = (float)0.5*salary;
        travallowance = (float)0.1*salary;
    }

    // getters
    public float getHseAllowance(){ return hsallowance;}
    public float getTravAllowance(){ return travallowance;}
    public float getSalary() { return salary;}
    public String getName() { return name;}
    public String getNumber() { return empnum;}
    public String getPosition() { return position;}
    public String getDpt() { return dpt;}
    public String getGender() { return gender;}

    // setters
    public void setName(String nm) { name = nm;}
    public void setSalary(float s) { salary = s;}
    public void setEmpNum(String num) { empnum = num;}
    public void setDpt(String department) { this.dpt = department;}
    public void setDob(String dateOfBirth) { dob = dateOfBirth;}
    public void setGender(String gen) { gender = gen;}

    // Method to set employee details
    public void setDetails(){
        System.out.println("Enter Employee Name");
        name = scan.nextLine();
        System.out.println("Enter Employee Number");
        empnum = scan.nextLine();
        System.out.println("Enter Employee Position");
        position = scan.nextLine();
        System.out.println("Enter Employee Salary");
        salary = scan.nextFloat();
        System.out.println("Enter Employee Department");
        scan.nextLine(); // Consume newline left-over
        dpt = scan.nextLine();
        System.out.println("Enter Employee Date of Birth");
        dob = scan.next();
    }

    // Method printEmployee Details
    public void printEmployee() {
        System.out.println(empnum + "\t" + name + "\t" + position + "\t" + dpt);
    }
}
