package Org.Example.No4;

public class Tabeller {

    public static void main(String[] args) {

for (int table = 2; table <= 10; table++){
    System.out.println(table + " tabellen");
    for (int i = 1; i<=10; i++){
        System.out.println(table + " x " + i + " = " +(table*i));
    }
}}
}
