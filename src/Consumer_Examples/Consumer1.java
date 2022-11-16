package Consumer_Examples;

import java.util.function.Consumer;

public class Consumer1 {
    public static void main(String[] args) {
        Consumer<String> c1 = s -> System.out.println(s);
        c1.accept("Shivam");

        Consumer<String> c2 = s -> {
            System.out.println("Hello "+s);
            System.out.println("welcome "+s);
        };
        c2.accept("Rohit");
    }
}
