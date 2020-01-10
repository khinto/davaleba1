package com.company;

import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input number for 'a' int");
        int a = input.nextInt();
        System.out.println("Input number for 'b' int");
        int b = input.nextInt();

        if (a > b){
            System.out.println("'a' is bigger than 'b', swapping numbers");
            a = b;
            b = a;
            System.out.println("Swapped numbers, generating 40 random numbers");
            generateRandomNumbersByAmount(40, a, b);
        } else {
            System.out.println("Generating 40 random numbers");
            generateRandomNumbersByAmount(40, a, b);
        }

    }
    private static void generateRandomNumbersByAmount(int amount, int min, int max) {
        int evenCounter = 0, evenSum = 0, oddCounter = 0, oddSum = 0;
        for (int i = 0; i < amount; i++) {
            int currNumber = getRandomNumberInRange(min, max);
            if ((currNumber & 1) == 0) {
                evenCounter = evenCounter + 1;
                evenSum = evenSum + currNumber;
            } else {
                oddCounter = oddCounter + 1;
                oddSum = oddSum + currNumber;
            }
        }
        System.out.println("Amount of even numbers found: " + evenCounter);
        System.out.println("Sum of even numbers found: " + evenSum);
        System.out.println("Amount of odd numbers found: " + oddCounter);
        System.out.println("Sum of odd numbers found: " + oddSum);
        if (evenSum > oddSum){
            evenSum = oddSum;
            oddSum = evenSum;
            for (int i = 0; i < 5; i++) {
                System.out.println(getRandomNumberInRange(evenSum, oddSum));
            }
        } else {
            for (int i = 0; i < 5; i++) {
                System.out.println(getRandomNumberInRange(evenSum, oddSum));
            }
        }
    }
    private static int getRandomNumberInRange(int min, int max) {
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }
}