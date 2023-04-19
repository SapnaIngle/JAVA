package controlflowstatement;

import java.util.Scanner;

public class CalculatorDemo {
    public static void main(String[] args) {

        int num1, num2;
        char operator;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter Value for num1");
        num1 = scanner.nextInt();
        System.out.println("Enter Value for num2");
        num2 = scanner.nextInt();
        System.out.println("Enter Operator");
        operator = scanner.next().charAt(0);

        switch (operator){
            case'+' :
                System.out.println(num1 + num2);
            case'-' :
                System.out.println(num1 - num2);
            case'*' :
                System.out.println(num1 * num2);
            default:
                System.out.println("Wrong Choice");
        }









    }
}
