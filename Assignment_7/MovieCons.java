package Assignment_7;

import java.time.LocalDate;
import java.util.List;

public class MovieCons {

    private String title;
    private String genre;
    private String director;
    private short rating;
    private int duration;
    private LocalDate releaseDate;
    private List<String> cast;
    public static int totalMovie;

    public MovieCons(String title, String genre, String director, short rating, int duration, LocalDate releaseDate, List<String> cast) {
        this.title = title;
        this.genre = genre;
        this.director = director;
        this.rating = rating;
        this.duration = duration;
        this.releaseDate = releaseDate;
        this.cast = cast;
        totalMovie++;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public short getRating() {
        return rating;
    }

    public void setRating(short rating) {
        this.rating = rating;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    public List<String> getCast() {
        return cast;
    }
    public void setCast(List<String> cast) {
        this.cast = cast;
    }

    @Override
    public String toString() {
        return  "title \t\t: " + title +
                "\ngenre \t\t: " + genre +
                "\ndirector \t: " + director +
                "\nrating \t\t: " + rating +
                "\nduration \t: " + duration +
                "\nreleaseDate \t: " + releaseDate +
                "\ncast \t\t: " + cast;
    }
}