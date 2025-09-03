package Org.Example.No4;

import java.util.Scanner;

// write the code to play get number with with while lopps and math trandom

public class GuessANumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int randomNumber = (int) (Math.random() * 20) + 1;
        int guess;
        int attempts = 0;

        System.out.println("guess a number between 1 and 20");

        do {
            guess = scanner.nextInt();
            attempts++;
            if (guess < randomNumber){
                System.out.println("too low try again");
            } else if (guess > randomNumber) {
                System.out.println("Too high try again");
            } else {
                System.out.println("you won in " + attempts + " guesses");
            }
        } while (guess !=randomNumber);

    }

}
