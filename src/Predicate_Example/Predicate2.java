package Predicate_Example;

import java.util.function.Predicate;

// combining two predicates
public class Predicate2 {
    public static void main(String[] args) {
        // predicate 1 for even numbers
        Predicate<Integer> p1 = i -> i%2==0;
        // predicate 2 for numbers greater than 10
        Predicate<Integer> p2 = i -> i>10;

        int[] numbers = {0,10,23,44,68,54,37,29,70,3,9};
        // want a even number greater than 10
        // combine p1 and p2 using and()
        System.out.println("even number greater than 10");
        for(int n : numbers)
        {
            if (p1.and(p2).test(n))
            {
                System.out.print(n+" ");
            }
        }
        // number either even or greater than 10
        System.out.println("\nnumber either even or greater than 10");
        for(int n : numbers)
        {
            if (p1.or(p2).test(n))
            {
                System.out.print(n+" ");
            }
        }

        // odd numbers only
        System.out.println("\nodd numbers only");
        for(int n : numbers)
        {
            if (p1.negate().test(n))
            {
                System.out.print(n+" ");
            }
        }
    }
}
