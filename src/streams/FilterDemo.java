package streams;

import java.util.List;
import java.util.function.Predicate;

public class FilterDemo {
    public static void show(){
        List<Movie> movies = List.of(
                new Movie("a",10),
                new Movie("b",30),
                new Movie("c",20)
        );

        Predicate<Movie> isPopular = movie -> movie.getLikes()>10;
        movies.stream()
                .filter(isPopular)
                .forEach(name -> System.out.println(name));//without forEach nothing going to happen


        movies.stream().takeWhile(movie -> movie.getLikes()<30)//only print 10 (not break until found)
                .forEach(movie -> System.out.println(movie));

        //dropWhile - opposite
    }
}
