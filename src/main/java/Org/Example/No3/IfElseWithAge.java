package Org.Example.No3;
import java.util.Scanner;

// write a program that tells what you are/can with if else statements

public class IfElseWithAge {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();

        if (age >=18) {
            System.out.println("You are an adult");
        }

            else if (age >=15){
            System.out.println("You can drive a scooter in Denmark");
        }

            else if (age >= 13) {
            System.out.println("you are a teenager");
        }
            else {
            System.out.println("You are a kid");
        }
    }
}
