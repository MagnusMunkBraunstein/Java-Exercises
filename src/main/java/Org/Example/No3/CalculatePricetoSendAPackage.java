package Org.Example.No3;

import java.util.Scanner;

public class CalculatePricetoSendAPackage {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Type the wheigt of the package in grams");
        double packageWeight = scanner.nextDouble();

        double pricePrGram = 0.4;
        System.out.println("The price of sending you package is " + packageWeight * pricePrGram);










    }


}
