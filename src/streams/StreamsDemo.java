package streams;

import javax.swing.plaf.IconUIResource;
import java.util.List;
import java.util.Map;

public class StreamsDemo {
    public static void show(){
        List<Movie> movies = List.of(
                new Movie("a",10),
                new Movie("b",15),
                new Movie("c",20));

        int count = 0;
        //Imperative Programming
        for (var movie : movies)
            if (movie.getLikes()>20)
                count++;

        //Declarative (Functional) Programming
        var count2 = movies.stream()
                .filter(movie -> movie.getLikes() > 10)
                .count();




    }

}
