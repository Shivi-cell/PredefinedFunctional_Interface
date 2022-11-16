package Consumer_Examples;

import java.util.function.Consumer;
class Movie
{
    String name;
    Movie(String name)
    {
        this.name = name;
    }
}
public class Consumer_Chaining {
    public static void main(String[] args) {
        Consumer<Movie> c1 = m -> System.out.println(m.name+" is ready to release");
        Consumer<Movie> c2 = m -> System.out.println(m.name+" is released");
        Consumer<Movie> c3 = m -> System.out.println(m.name+" storing info in database");

        // consumer for consumer chaining
        Consumer<Movie> cc = c1.andThen(c2).andThen(c3);

        // first method
        cc.accept(new Movie("K.G.F"));

        // second method
        c1.andThen(c2).andThen(c3).accept(new Movie("K.G.F"));

        // consumer does not have compose method
    }
}
