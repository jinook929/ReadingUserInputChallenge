package academy.learnprogramming;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);
        int counter = 0;
        int sum = 0;
        int num;

        while (counter < 10) {
            System.out.print("Enter number #" + (counter + 1) + ": ");

            if (scanner.hasNextInt()) {
                num = scanner.nextInt();
                scanner.nextLine();
                sum += num;
                counter++;
            } else {
                System.out.println("Invalid Value");
                scanner.nextLine();
            }
        }

        System.out.println("Sum of Ten Numbers: " + sum);

        scanner.close();
    }

}
