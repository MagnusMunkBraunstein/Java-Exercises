package Org.Example.No2;

//write a program that prints 3 random numbers by using math.random, you also have to print the sum and the average of the numbers

public class RandomNumbersWithMathRandom {


    public static void main(String[] args) {

        // Generate 3 random numbers between 0 and 100
        // You multiply by 1000 beacuse math random give a decimal between 0 and 1
        int number1 = (int) (Math.random() * 100);
        int number2 = (int) (Math.random() * 100);
        int number3 = (int) (Math.random() * 100);

        int sum = number1 + number2 + number3;
        double average = sum / 3.0;

        System.out.println("Random numbers: " + number1 + ", " + number2 + ", " + number3);
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);

    }


}
