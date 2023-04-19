package controlflowstatement;

import java.util.Scanner;

public class GuessNumber {

    public static void main(String[] args) {

        int num;
        int guessNumber = 0;
        num  = (int) (Math.random() * 100)+1;
        Scanner scanner = new Scanner(System.in);
        int counter = 1;
        do {
            System.out.println("Enter Number");
            guessNumber = scanner.nextInt();
            counter++;
            if (num > guessNumber) {
                System.out.println("Number is greater");
            } else if (num < guessNumber) {
                System.out.println("Number is smaller");
            } else {
                System.out.println("Your guess is correct" + counter);
            }
        } while (num != guessNumber);


    }
}
