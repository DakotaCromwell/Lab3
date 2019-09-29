package com.mycompany.lab3;

import java.util.Scanner;

public class IsPrime {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter the number you'd like to check");
        int primeToCheck = keyboard.nextInt();
        int isItPrime = isPrime(primeToCheck);
        if (isItPrime == 0) {
            System.out.println("The number you have chosen: " + primeToCheck + " is a not prime number");
        } else {
            System.out.println("The number you have chosen: " + primeToCheck + " is a prime number");
        }
    }

    public static int isPrime(int primeToCheck) {
        int itIsPrime = 0;
        for (int i = 2; i < primeToCheck; i++) {
            itIsPrime = primeToCheck % i;
            if (itIsPrime == 0) {
                break;
            }
        }
        return itIsPrime;
    }
}
