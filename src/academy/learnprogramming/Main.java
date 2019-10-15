package academy.learnprogramming;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

        int counter = 0;
        int sum = 0;

        while (counter < 10) {
            System.out.print("Enter number #" + (counter + 1) + ": ");

            if (scanner.hasNextInt()) {
                int num = scanner.nextInt();
                sum += num;
                counter++;
            } else {
                System.out.println("Invalid Value. Enter a NUMBER!");
            }

            scanner.nextLine();
        }

        System.out.println("Sum of the Ten Numbers: " + sum);

        scanner.close();
    }
}
