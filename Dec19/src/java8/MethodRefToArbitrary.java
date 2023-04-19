package java8;

import java.util.Arrays;
import java.util.List;

public class MethodRefToArbitrary {

    public static void main(String[] args) {

        List<Person> list = Arrays.asList(new Person("Rahul"), new Person("Vanshika"));
        list.forEach(Person::getName);
    }

    private static class Person{
        String name;

        public Person(String name){
            this.name = name;
        }

        public void getName(){
            System.out.println("Name: " + this.name);
        }
    }
}
