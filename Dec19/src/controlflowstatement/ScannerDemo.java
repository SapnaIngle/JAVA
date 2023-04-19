package controlflowstatement;

import java.util.Scanner;
public class ScannerDemo {

    public static void main(String[] args) {

        String name;
        int age;
        double salary;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Name,Age and Salary");
        name = scanner.next();
        age = scanner.nextInt();
        salary= scanner.nextDouble();

        System.out.println("Name:" +name+ " " +"Age:" +age+ " " +"Salary:" +salary);



//        do{
//            System.out.println();
//        }while(int)






    }
}
