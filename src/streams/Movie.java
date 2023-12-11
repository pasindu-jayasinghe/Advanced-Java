package streams;

public class Movie {
    private String title;
    private Integer likes;

    public Movie(String title, Integer likes) {
        this.title = title;
        this.likes = likes;
    }

    public Integer getLikes() {
        return likes;
    }

}
