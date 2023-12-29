package streams;

import java.util.Arrays;
import java.util.stream.Stream;

public class CreatingStreamsDemo {
    public static void show(){
        int [] array = {1,2,3};
        Arrays.stream(array).forEach(n-> System.out.println(n));

        var stream = Stream.generate(() -> Math.random());
            stream
                .limit(3)
                .forEach(n -> System.out.println(n));


             Stream.iterate(1,n->n+1)
                     .limit(10)
                     .forEach(n-> System.out.println(n));

    }
}
