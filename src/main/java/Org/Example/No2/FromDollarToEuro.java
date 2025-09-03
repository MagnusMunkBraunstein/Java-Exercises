package Org.Example.No2;

//write a simple program to convert dollars intro euros

public class FromDollarToEuro {

    public static void main(String[] args) {
        double dollar = 100;
        double exchangeRate = 0.85; // 1 Dollar = 0.85 Euro
        double euro = dollar * exchangeRate;
        System.out.println(dollar + " Dollar is " + euro + " Euro");
    }

}
