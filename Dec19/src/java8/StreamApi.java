package java8;

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/***
 * Stream Api -> It is a sequence of object and have many methods.
 *               the methods which we are combining and producing desire result.
 *
 * Types -> Sequential and  Parallel(multithreading)
 *
 * Operation -> Terminal and Intermediate
 *
 * Terminal -> forEach(Consumer), reduce(), collect()
 * intermediate -> map(Function), filter(Predicate), sorted()
 *
 */

public class StreamApi {

    public static void main(String[] args) {

        Function<String, Integer> function = (str) -> str.length();
        System.out.println( function.apply("Beautiful"));

        Function<Integer, Integer> add = (num) -> num+1;
        System.out.println(add.apply(5));

        Function<Integer, Integer> multi = (num) -> num*3;
        System.out.println(multi.apply(4));

        Function<Integer, Integer> res = add.andThen(multi);
        System.out.println(res.apply(2));

        Function<Integer, Integer> div = (num) -> num/2;
        System.out.println(div.apply(4));

        Function<Integer, Integer> ind = Function.identity();
        System.out.println(ind.apply(6));

        Function<Integer, Integer> com = add.compose(multi);
        System.out.println(com.apply(3));


        System.out.println();
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,8);

        Function<Integer, Integer> m = (n)->n*2;
        list.stream().map(m).forEach(System.out::println);

        System.out.println();
        Function<Integer, String> evenOdd = (number)-> number%2==0?"Even":"Odd";
        System.out.println(evenOdd.apply(5));

        list.stream().sorted(Comparator.reverseOrder());


        System.out.println();
        Predicate<Integer> predicate = (number) -> number%2==0;
        System.out.println(predicate.test(11));
//        list.stream().filter(predicate).forEach(System.out::println);


        List<String> string = Arrays.asList("australia","italy","bali");
        string.stream().map(s->s.toUpperCase()).forEach(System.out::println);

        List<String> str = Arrays.asList("Varanasi","NASHIK","DIU");
        str.stream().map(l-> l.toLowerCase()).forEach(System.out::println);



        List<Integer> list1 = Arrays.asList(1,2,3,4,5,6,8);
        int sum = 0;
        for(Integer i : list1){
            sum = sum+i;
        }
        System.out.println(sum);

        Optional<Integer> res1 = list1.stream().reduce(((integer, integer2) ->
                integer+integer2)).get().describeConstable();
        System.out.println(res1);

        System.out.println(IntStream.of(1,2,3,4,5,6).reduce(Integer::sum).getAsInt());



        List<String> words = Arrays.asList("Kolkata", "Warangal", "Solapur", "Pune");
        Optional<String> optional = words.stream().reduce((word1,word2)->word1.length() > word2.length()? word1:word2);
        System.out.println(optional);

        List<String> strings = Arrays.asList("Mirror","Bed","Purse","Chair");
        Optional<String> opt = strings
                .stream()
                .reduce((w1,w2)->w1.length()>w2.length()?w1:w2)
                .get()
                .describeConstable();
        System.out.println(opt);


        List<String> languages = Arrays.asList("Java","Javascript","C++","C","React","HTML");
        Set<String> startWithJ = languages.stream().filter((s)->s.startsWith("C")).collect(Collectors.toSet());
        System.out.println(startWithJ);

    }
}
