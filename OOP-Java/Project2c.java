package project2c;

import java.util.*;

class Employee {
    long Phone_No;
    double Salary;
    String Empid, Empname;
    void read() {
        Scanner S = new Scanner(System.in);
        System.out.printf("\nEnter the Employee ID: ");
        Empid = S.next();
        System.out.printf("Enter the Employee Name: ");
        Empname = S.next();
        System.out.printf("Enter the Salary: ");
        Salary = S.nextDouble();
        System.out.printf("Enter the Phone Number: ");
        Salary = S.nextLong();
    }
    void display() {
        System.out.println(Empid+"\t"+Empname+"\t"+Salary+"\t"+Phone_No);
    }
}

public class Project2c {
    public static void main(String[] args) {
        Employee E[] = new Employee[10];
        Scanner S = new Scanner(System.in);
        System.out.printf("Enter the no.of Employees: ");
        int n = S.nextInt();
        for(int i=0;i<n;i++) {
            E[i] = new Employee();
            E[i].read();
        }
        System.out.println("\nEmpid\tEmpname\tSalary\tPhone_no");
        for(int i=0; i<n;i++)
            E[i].display();
    }
}
