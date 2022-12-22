package program2a;

import java.util.*;
import java.io.*;

public class Program2a {

    static int choice(int n, int k) {
        if(n==1)
            return 1;
        else 
            return (choice(n-1,k)+k-1)%n+1;
    }
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("Enter n and k value: ");
        int n = S.nextInt();
        int k = S.nextInt();
        System.out.println("The chosen place is "+choice(n,k));
    }
    
}
