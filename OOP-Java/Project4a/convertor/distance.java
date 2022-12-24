package convertor;

import java.util.Scanner;

public class distance {
    public static Scanner S = new Scanner(System.in);
    public static double pos;
    public static void MToKm() {
        System.out.print("Enter Meter to be converted: ");
        pos = S.nextDouble();
        System.out.println("The Kilometer for "+pos+" Meter is "+(pos/1000));
    }
    public static void KmToM() {
        System.out.print("Enter Kilometer to be converted: ");
        pos = S.nextDouble();
        System.out.println("The Meter for "+pos+" Kilometer is "+(pos*1000));
    }
}
