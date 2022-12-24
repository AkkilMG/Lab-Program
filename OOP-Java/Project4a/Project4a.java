
import convertor.*;

import java.util.Scanner;

public class Project4a {
    public static void main(String[] args) {
        currency Currency = new currency();
        Scanner S = new Scanner(System.in);
        while(true){
            System.out.println("Convertors available are:\n1. Currency Convertor\n2. Time Convertor\n3. Distance Convertor\n4. Exit");
            System.out.print("Enter your choice: ");
            int ch = S.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("Currency convertors available are:\n1. Dollar To INR\n2. INR To Dollar\n3. Euro To INR\n4. INR To Euro\n5. Yen To INR\n6. INR To Yen\n7. Exit");
                    System.out.print("Enter your choice: ");
                    int ch1 = S.nextInt();
                    if(ch1==1)
                        Currency.DollarToINR();
                    else if (ch1==2)
                        Currency.INRtoDollar();
                    else if (ch1==3)
                        Currency.EuroToINR();
                    else if (ch1==4)
                        Currency.INRToEuro();
                    else if (ch1==5)
                        Currency.YenToINR();
                    else if (ch1==6)
                        Currency.INRToYen();
                    else
                        break;
                    break;
                case 2:
                    System.out.println("Time convertors available are:\n1. Hours To Minutes\n2. Minutes To Seconds\n3. Seconds To Minutes\n4. Minutes To Hours\n5. Hours To Seconds\n6. Seconds To Hours\n7. Back");
                    System.out.print("Enter your choice: ");
                    int ch2 = S.nextInt();
                    if(ch2==1)
                        time.HoursToMinutes();
                    else if (ch2==2)
                        time.MinutesToSeconds();
                    else if (ch2==3)
                        time.SecondsToMinutes();
                    else if (ch2==4)
                        time.MinutesToHours();
                    else if (ch2==5)
                        time.HoursToSeconds();
                    else if (ch2==6)
                        time.SecondsToHours();
                    else
                        break;
                    break;
                case 3:
                    System.out.println("Distance Convertor available are:\n1. Meter To Kilometer\n2. Kilometer To Meter\n3. Back");
                    System.out.print("Enter your choice: ");
                    int ch3 = S.nextInt();
                    if(ch3==1)
                        distance.MToKm();
                    else if (ch3==2)
                        distance.KmToM();
                    else
                        break;
                    break;
                default:
                    break;
            }
        }
    }
}
