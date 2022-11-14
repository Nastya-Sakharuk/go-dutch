package com.epam.rd.autotasks.godutch;

import java.util.Scanner;

public class GoDutch {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int accountAll = scan.nextInt();
        int countGuest = scan.nextInt();
        int accountGuest = (int)(1.1*accountAll / countGuest);
        int i;
        if (accountAll < 0) {
            System.out.println("Bill total amount cannot be negative");
        } else if (countGuest <= 0) {
            System.out.println("Number of friends cannot be negative or zero");
        } else {
            for ( i = 0; i < accountGuest; i++) {
            }
            System.out.println(i);
        }
    }
}
