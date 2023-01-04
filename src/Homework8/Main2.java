package Homework8;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter integer number from 0 to 10!");

        if (scanner.hasNextInt()) {
            int number = scanner.nextInt();
        } else {
            System.out.println("Wrong data!");
            System.exit(0);
            scanner.nextLine();

        }
        System.out.println((int) (Math.random() * 11));

        System.out.println("Enter integer number from 0 to 10!");

        if (scanner.hasNextInt()) {
            int number2 = scanner.nextInt();
        } else {
            System.out.println("Wrong data!");
            System.exit(0);
        }
        System.out.println((int) (Math.random() * 11));

        System.out.println("Enter integer number from 0 to 10!");

        if (scanner.hasNextInt()) {
            int namber3 = scanner.nextInt();
        } else {
            System.out.println("Wrong data!");
            System.exit(0);
        }
        System.out.println((int) (Math.random() * 11));
    }
}
