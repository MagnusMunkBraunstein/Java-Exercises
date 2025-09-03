package Org.Example.No3;

import java.util.Scanner;

// write a program that changes dollars to euros with a rate, and commission (2%). if its at least 0.5 euro

public class DollarToEuroWithKommision {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter amount of dollars");
        double dollars = scanner.nextDouble();

        double rate = 0.85;
        double euro = dollars * rate;

        double commission = euro*0.02;
        if (commission<0.5){
            commission = 0.5;
        }

        double euroAfterCommission = euro -commission;

        System.out.printf("amount of euro after commission is " + euroAfterCommission);











    }
}
