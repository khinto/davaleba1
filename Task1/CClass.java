package com.company;

import java.util.Scanner;

public class CClass {
    int a,b,c;
    public void setNumbers() { //First Method
        Scanner input = new Scanner(System.in);
        System.out.println("Input number for 'a' int");
        a = input.nextInt();
        System.out.println("Input number for 'b' int");
        b = input.nextInt();
        System.out.println("Input number for 'c' int");
        c = input.nextInt();
    }
    public int returnLastDigitFromA(int aNumber) { //Second Method
        int lastDigit = aNumber % 10;
        return lastDigit;
    }
    public int returnFirstDigitFromB(int bNumber) { //Third Method
        int firstDigit = Integer.parseInt(Integer.toString(bNumber).substring(0, 1));
        return firstDigit;
    }
    public int returnSumOfAllDigitsFromC(int cNumber) { //Fourth Method
        int sum = 0;
        String intToString = String.valueOf(cNumber);

        for(int i = 0; i < intToString.length(); i++) {
            int backToInt = intToString.charAt((i)) - '0';
            sum = sum + backToInt;
        }
        return sum;
    }
    public int multiplicationOfMethodsSecondAndThird(int aNumber, int bNumber) { //Fifth Method
        int secondMethod = returnLastDigitFromA(aNumber);
        int thirdMethod = returnFirstDigitFromB(bNumber);
        //System.out.println("Multiplication of Second and Third Methods " + secondMethod * thirdMethod);
        // Printing from the main function because we are using this method call in the Sixth method causing it to print the result twice, hence why the above is commented out.
        return secondMethod * thirdMethod;

    }
    public void sumOfMethodsThirdAndFifth(int aNumber, int bNumber) { //Sixth Method
        int thirdMethod = returnFirstDigitFromB(bNumber);
        int fifthMethod = multiplicationOfMethodsSecondAndThird(aNumber, bNumber);
        int newSum = thirdMethod + fifthMethod;
        System.out.println("Sum of Third and Fifth Methods " + newSum);
    }
}