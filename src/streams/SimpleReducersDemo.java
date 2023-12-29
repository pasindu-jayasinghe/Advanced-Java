package streams;

import java.util.Comparator;
import java.util.List;

public class SimpleReducersDemo {
    public static void show(){
        List<Movie> movies = List.of(
                new Movie("a",10),
                new Movie("b",15),
                new Movie("c",20)
        );

        var result = movies.stream()
                .anyMatch(m -> m.getLikes() > 20);

        System.out.println(result);

        var result2 = movies.stream()
                .allMatch(m -> m.getLikes() > 5);

        System.out.println(result2);

        var result3 = movies.stream()
                .findFirst()
                .get();
        System.out.println(result3.getTitle());

        var max = movies.stream()
                .max(Comparator.comparing(Movie::getLikes))
                .get();
        System.out.println(max.getTitle());
    }
}
