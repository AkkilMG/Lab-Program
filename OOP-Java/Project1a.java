package project1a;

import java.util.*;
import java.io.*;

public class Project1a {
    public static void main(String[] args) {
        int N;
        Scanner S = new Scanner(System.in);
        System.out.println("Enter the N value: ");
        N = S.nextInt();
        if(N%2==0) {
            N/=2;
            System.out.println("The Nth term in the series is "+ Math.pow(3, N-1));
        } else {
            N=N/2+1;
            System.out.println("The Nth term in the series is "+ Math.pow(2, N-1));
        }
    }
    
}
