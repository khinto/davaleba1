package com.company;

public class Main {

    public static void main(String[] args) {
        AClass homework = new AClass();
        homework.setNumbers();
        System.out.println("Assigned number to 'x': " + homework.x);
        homework.sumOfNumbers(homework.x);
        homework.checkIfOddOrEven(homework.x);

    }
}