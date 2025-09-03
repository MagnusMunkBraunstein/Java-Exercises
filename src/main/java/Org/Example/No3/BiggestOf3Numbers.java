package Org.Example.No3;

import java.util.Scanner;

// finde the biggest of 3 numbers by using if else

public class BiggestOf3Numbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("enter first number");
        int a = scanner.nextInt();

        System.out.println("enter second number");
        int b = scanner.nextInt();

        System.out.println("enter Third number");
        int c = scanner.nextInt();

        int biggestNumber;


        if (a >= b && a >= c){
            biggestNumber = a;
        } else if (b >= a && b >= c) {
            biggestNumber =b;
        }
        else {
            biggestNumber = c;
        }

        System.out.println(" The biggest number is " + biggestNumber);

    }
}
