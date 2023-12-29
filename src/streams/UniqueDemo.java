package streams;

import java.util.List;

public class UniqueDemo {
    public static void show(){
        List<Movie> movies = List.of(
                new Movie("a",10),
                new Movie("a",10),
                new Movie("b",30),
                new Movie("c",20)
        );

        movies.stream().map(Movie::getLikes)
                .distinct()
                .forEach(System.out::println);
    }
}
