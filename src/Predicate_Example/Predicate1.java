package Predicate_Example;

import java.util.function.Predicate;

public class Predicate1 {
    public static void main(String[] args) {
        // predicate for checking even and odd
        Predicate<Integer> p = i -> i%2==0;
        int[] a = {0,10,20,14,23,15,18,17};
        for (Integer i : a) {
            if (p.test(i)) {
                System.out.println(i);
            }
        }

        // predicate to check the length of the string is greater than 4 or not
        Predicate<String> p1 = i->i.length()>4;
        String[] strings = {"Ramesh", "Sohan", "Ramu", "Mahima"};
        for(String s : strings)
        {
            if (p1.test(s))
            {
                System.out.println(s);
            }
        }
    }
}