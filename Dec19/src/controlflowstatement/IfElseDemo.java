package controlflowstatement;

import org.w3c.dom.ls.LSOutput;

public class IfElseDemo {

    public static void main(String[] args) {
        int age = 18;
        String nationality = "Indian";

        if (age >= 18) {
            if (nationality == "Indian") { //nested if
                System.out.println("You can vote");
            } else {
                System.out.println("Not Indian");
            }
        } else {
            System.out.println("You can not vote");
        }

/*
        int a = 52, b = 20, c = 5;

        if (a > b && a > c) { // ladder if
            System.out.println("a is greater");
        } else if (b > c) {
            System.out.println("b is greater");
        } else {
            System.out.println("c is greater");
        }

        int age1 = 19;
        String str = age1 > 18 ? "You can vote" : "You can not vote";
        System.out.println(str);
        */

        int[] num = {2,5,8,3,7};
        for(int i=0; i<=num.length; i++) {
          if(num[i]%2==0) {
              System.out.println("The number is even" +num[i]);
          } else{
              System.out.println("The number is odd" +num[i]);
          }
        }


    }
}

