package streams;

import java.util.List;

public class PeekDemo {
    public static void show(){
        List<Movie> movies = List.of(
                new Movie("a",10),
                new Movie("b",15),
                new Movie("c",20)
        );
        movies.stream()
                .filter(m -> m.getLikes() > 10 )
                .peek(m-> System.out.println("filtered "+ m.getTitle()))
                //peek for troubleshooting see output each operations
                .map(m -> m.getTitle())
                .peek(m -> System.out.println("mapped " + m))
                .forEach(t -> System.out.println(t));
    }
}
