package Homework10;

import java.util.Scanner;

public class Transpon {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
//
        if (scanner.hasNextInt());
        int n = scanner.nextInt();

        if (scanner.hasNextInt());
        int m = scanner.nextInt();

        int[][] array = new int[n][m];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 101);
            }
        }
        System.out.println("Before");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println();


        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array[i].length; j++) {
                int temp = array[i][j];
                array[i][j] = array[j][i];
                array[j][i] = temp;
            }
        }
        System.out.println("After");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
