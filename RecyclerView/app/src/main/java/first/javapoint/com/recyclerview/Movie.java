package first.javapoint.com.recyclerview;
//this the adapeter class for data rendering
//after we added the recycler view widget
public class Movie {

    private String movie;
    private String year;
    private String genre;

    public Movie(String movie, String genre, String year) {
        this.movie = movie;
        this.genre = genre;
        this.year = year;
    }
    public String getMovie() {
        return movie;
    }

    public void setMovie(String movie) {
        this.movie = movie;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }



    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }




}
