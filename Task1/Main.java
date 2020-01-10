package com.company;

public class Main {

    public static void main(String[] args) {
        CClass homework = new CClass();
        homework.setNumbers();
        System.out.println("Assigned number to 'a': " + homework.a);
        System.out.println("Assigned number to 'b': " + homework.b);
        System.out.println("Assigned number to 'c': " + homework.c);
        System.out.println("Last digit of number 'a': " + homework.returnLastDigitFromA(homework.a));
        System.out.println("First digit of number 'b': " + homework.returnFirstDigitFromB(homework.b));
        System.out.println("Sum of all digits of number 'c': " + homework.returnSumOfAllDigitsFromC(homework.c));
        System.out.println("Multiplication of Second and Third Methods: " + homework.multiplicationOfMethodsSecondAndThird(homework.a, homework.b));
        homework.sumOfMethodsThirdAndFifth(homework.a, homework.b);



    }
}
