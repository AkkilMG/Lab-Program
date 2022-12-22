package project2b;

import java.util.Scanner;

class financeClass {
    void calculate(int amt, float pr, int mt) {
        System.out.println("Month\tCD Value");
        for(int i=1; i<mt+1; i++)
            System.out.println(i+"\t"+(amt+i*(pr/12*100)));
    }
}

public class Project2b {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.printf("Enter the initial deposit amount: ");
        int amount = S.nextInt();
        System.out.printf("Enter annual percentage yield: ");
        float percentage = S.nextFloat();
        System.out.printf("Enter maturity period (no. of months): ");
        int maturity = S.nextInt();
        financeClass F = new financeClass();
        F.calculate(amount, percentage, maturity);
    }
}
