package com.company;

import java.util.Scanner;

public class AClass {
    int x;
    public AClass() { //Constructor
        System.out.println("Hello");
    }

    public void setNumbers() { //First Method
        Scanner input = new Scanner(System.in);
        System.out.println("Input number for 'x'");
        x = input.nextInt();
    }
    public void sumOfNumbers(int xNumber) { //Second Method
        int sumOfTwoNumbers = xNumber + 12;
        System.out.println("'x' + 12 = " + sumOfTwoNumbers);
    }
    public void checkIfOddOrEven(int xNumber) { //Third Method
        if ((xNumber & 1) == 0) {
            System.out.println("Number 'x' is even");
        } else {
            System.out.println("Number 'x' is odd");
        }
    }
}

class BClass extends AClass {
    int y;
    public void setNumbersInheritance() { //First Method of child class
        Scanner input = new Scanner(System.in);
        System.out.println("Input number for 'y'");
        y = input.nextInt();
    }
    public int sumOfNumbers() {
        return x + y;
    }

}