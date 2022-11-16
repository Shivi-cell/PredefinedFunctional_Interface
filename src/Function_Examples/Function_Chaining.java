package Function_Examples;

import java.util.function.Function;

public class Function_Chaining {
    public static void main(String[] args) {
        Function<Integer, Integer> f1 = i -> 2*i;
        Function<Integer, Integer> f2 = i -> i*i*i;

        // applying both on a value
        System.out.println(f1.andThen(f2).apply(2));  // first f1 then f2

        System.out.println(f1.compose(f2).apply(2)); // first f2 then f1
    }
}
