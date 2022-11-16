package Function_Examples;

import java.util.function.Function;

public class Function1 {
    public static void main(String[] args) {
        // function for square of the number
        Function<Integer, Integer> p1 = i -> i*i;
        System.out.println(p1.apply(4));

        // function for returning the length of the string
        Function<String, Integer> p2 = i -> i.length();
        System.out.println(p2.apply("Shivam"));

        // function to check the number is even or odd
        Function<Integer, Boolean> p3 = i -> i%2==0;
        System.out.println(p3.apply(3));
    }
}
