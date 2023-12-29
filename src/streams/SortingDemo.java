package streams;

import java.util.Comparator;
import java.util.List;

public class SortingDemo {
    public static void show(){
        List<Movie> movies = List.of(
                new Movie("b",10),
                new Movie("a",30),
                new Movie("c",20)
        );

        movies.stream()
                .sorted((Comparator.comparing(Movie::getTitle)) )
                .forEach(movie -> System.out.println(movie.getTitle()));
    }
}
