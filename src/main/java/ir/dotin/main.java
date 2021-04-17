package ir.dotin;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Computing computing = new Computing();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of array members : ");
        int n = input.nextInt();
        int a[] = new int[n];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            System.out.println("Enter a[" + i + "] : ");
            a[i] = scanner.nextInt();
        }
        int Count = computing.countShifting(a, n);
        System.out.println("Count shifting : " + Count);
    }
}








