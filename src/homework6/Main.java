package homework6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


       Scanner scanner = new Scanner(System.in);

        System.out.println("Navi");

        if (scanner.hasNextInt()) {
            int frags = scanner.nextInt();
            System.out.println("frags =" + frags);
        } else {
            System.out.println("Wrong data!");
            System.exit(0);
        }
        if (scanner.hasNextInt()) {
            int frags2 = scanner.nextInt();
            System.out.println("frags2 =" + frags2);
        } else {
            System.out.println("Wrong data!");
            System.exit(0);
        }
        if (scanner.hasNextInt()) {
            int frags3 = scanner.nextInt();
            System.out.println("frags3 =" + frags3);
        } else {
            System.out.println("Wrong data!");
            System.exit(0);
        }
        if (scanner.hasNextInt()) {
            int frags4 = scanner.nextInt();
            System.out.println("frags4 =" + frags4);
        } else {
            System.out.println("Wrong data!");
            System.exit(0);
        }
        if (scanner.hasNextInt()) {
            int frags5 = scanner.nextInt();
            System.out.println("frags5 =" + frags5);
        } else {
            System.out.println("Wrong data!");
            System.exit(0);

        }
            System.out.println("Virtus pro");

            if (scanner.hasNextInt()) {
                int frags6 = scanner.nextInt();
                System.out.println("frags6 =" + frags6);
            } else {
                System.out.println("Wrong data!");
                System.exit(0);
            }
            if (scanner.hasNextInt()) {
                int frags7 = scanner.nextInt();
                System.out.println("frags7 =" + frags7);
            } else {
                System.out.println("Wrong data!");
                System.exit(0);
            }
            if (scanner.hasNextInt()) {
                int frags8 = scanner.nextInt();
                System.out.println("frags8 =" + frags8);
            } else {
                System.out.println("Wrong data!");
                System.exit(0);
            }
            if (scanner.hasNextInt()) {
                int frags9 = scanner.nextInt();
                System.out.println("frags9 =" + frags9);
            } else {
                System.out.println("Wrong data!");
                System.exit(0);
            }
            if (scanner.hasNextInt()) {
                int frags10 = scanner.nextInt();
                System.out.println("frags10 =" + frags10);
            } else {
                System.out.println("Wrong data!");
                System.exit(0);
        }
            int frags1 = 10;
            int frags2 = 20;
            int frags3 = 30;
            int frags4 = 40;
            int frags5 = 50;

            int frags6 = 12;
            int frags7 = 22;
            int frags8 = 32;
            int frags9 = 42;
            int frags10 = 52;

            int Navi = (frags1 + frags2 + frags3 + frags4 + frags5)/5;
            int Pro100 = (frags6 + frags7 + frags8 + frags9 + frags10)/5;

            int Winner = Math.max(Navi, Pro100);
            System.out.println("Won  " + "Pro100 " + "with result " + Winner );



    }

}
