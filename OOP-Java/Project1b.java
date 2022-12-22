package project1b;

import java.util.*;

public class Project1b {
    public static void main(String[] args) {
        float salary[] = new float[21];
        float temp;
        Scanner S = new Scanner(System.in);
        System.out.print("Enter the salaries of 21 employees: ");
        for(int i=0; i<21;i++)
            salary[i] = S.nextFloat();
        Arrays.sort(salary);
        System.out.println("Sorted Array: ");
        for(float arr1: salary)
            System.out.print(arr1+" ");
        for(int i=0; i<salary.length;i++) {
            for(int j=i+1; j<salary.length; j++) {
                if(salary[i]<salary[j]) {
                    temp = salary[i];
                    salary[i]=salary[j];
                    salary[j]=temp;
                }
            }
        }
        System.out.println("\nElements of array sorted in descending order: ");
        for(int i=0; i<salary.length; i++)
            System.out.print(salary[i]+" ");
        System.out.println("\nInformation 21 employees as below: ");
        int k=0;
        float y[][] = new float[6][6];
        for(int i=0; i<6; i++) {
            for(int j=0; j<=i;j++) {
                y[i][j] = salary[k];
                System.out.printf(y[i][j]+" ");
                k++;
            }
            System.out.println();
        }
    }
}
