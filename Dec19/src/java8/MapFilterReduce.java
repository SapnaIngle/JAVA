package java8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MapFilterReduce {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("picasso", "newton", "camila");
        Stream<String> stream = list.stream();
        stream.map(String::toUpperCase).forEach(System.out::println);

        List<Integer> num = Arrays.asList(23,56,14,12);
        Stream<Integer> stream1 = num.stream();
        stream1.filter(n->n%2==0).forEach(System.out::println);

        List<Integer> integer = Arrays.asList(23,65,17,42);
        int sum = integer.stream().reduce(1,(num1,num2)->num1*num2);
        System.out.println("The multiplication of nums is" + "" +sum);

//        System.out.println(IntStream.of(2,5,6,8).reduce((int1,int2)->);







    }
}
