package convertor;

import java.util.Scanner;

public class time {
    public static Scanner S = new Scanner(System.in);
    public static double period;
    public static void HoursToMinutes() {
        System.out.print("Enter Hours to be converted: ");
        period = S.nextDouble();
        System.out.println("The Minutes for "+period+" Hours is "+(period*60));
    }
    public static void MinutesToSeconds() {
        System.out.print("Enter Minutes to be converted: ");
        period = S.nextDouble();
        System.out.println("The Seconds for "+period+" Minutes is "+(period*60));
    }
    public static void SecondsToMinutes() {
        System.out.print("Enter Seconds to be converted: ");
        period = S.nextDouble();
        System.out.println("The Minutes for "+period+" Seconds is "+(period/60));
    }
    public static void MinutesToHours() {
        System.out.print("Enter Minutes to be converted: ");
        period = S.nextDouble();
        System.out.println("The Hours for "+period+" Minutes is "+(period/60));
    }
    public static void HoursToSeconds() {
        System.out.print("Enter Hours to be converted: ");
        period = S.nextDouble();
        System.out.println("The Seconds for "+period+" Hours is "+(period*60));
    }
    public static void SecondsToHours() {
        System.out.print("Enter Seconds to be converted: ");
        period = S.nextDouble();
        System.out.println("The Hours for "+period+" Seconds is "+(period/60));
    }
}
