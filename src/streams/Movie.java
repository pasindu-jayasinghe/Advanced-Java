package streams;

public class Movie implements Comparable<Movie> {
    private String title;
    private Integer likes;

    public Movie(String title, Integer likes) {
        this.title = title;
        this.likes = likes;
    }

    public Integer getLikes() {
        return likes;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public int compareTo(Movie o) {
        return 0;
    }
}
