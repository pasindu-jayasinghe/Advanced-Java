package streams;

import java.util.List;
import java.util.stream.Stream;

public class MappingDemo {
    public static void show(){
        List<Movie> movies = List.of(
                new Movie("a",10),
                new Movie("b",15),
                new Movie("c",20)
        );
        movies.stream()
                .map(movie -> movie.getTitle())
                .forEach(name -> System.out.println(name));

        movies.stream()
                .mapToInt(movie -> movie.getLikes())
                .forEach(like -> System.out.println(like));

        var stream = Stream.of(List.of(1,2,3),List.of(4,5,6));

        //Stream<List<X>> -> Stream<X>
        stream.flatMap(list -> list.stream())
                .forEach(n -> System.out.println(n));
    }
}
