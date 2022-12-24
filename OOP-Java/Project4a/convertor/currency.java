package convertor;

import java.util.Scanner;

public class currency {
    Scanner S = new Scanner(System.in);
    public double cur;
    public void DollarToINR() {
        System.out.print("Enter Dollar to be converted: ");
        cur = S.nextDouble();
        System.out.println("The INR for "+cur+" is "+(cur*82.92));
    }
    public void INRtoDollar() {
        System.out.print("Enter INR to be converted: ");
        cur = S.nextDouble();
        System.out.println("The Dollar for "+cur+" is "+(cur/82.92));
    }
    public void EuroToINR() {
        System.out.print("Enter Euro to be converted: ");
        cur = S.nextDouble();
        System.out.println("The INR for "+cur+" is "+(cur*88.03));
    }
    public void INRToEuro() {
        System.out.print("Enter INR to be converted: ");
        cur = S.nextDouble();
        System.out.println("The Euro of "+cur+" is "+(cur/88.03));
    }
    public void YenToINR() {
        System.out.print("Enter Yen to be converted: ");
        cur = S.nextDouble();
        System.out.println("The INR of "+cur+" is "+(cur*0.62));
    }
    public void INRToYen() {
        System.out.print("Enter INR to be converted: ");
        cur = S.nextDouble();
        System.out.print("The Yen of "+cur+" is "+(cur/0.62));
    }
}
