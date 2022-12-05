package lab13;

public class Movie {
    private int movieID;
    private String title;
    private String rating;

    public Movie(int movieID, String title, String rating) {
        this.movieID = movieID;
        this.title = title;
        this.rating = rating;
    }

    public Movie() {
        this(0, null, null);
    }

    public int getMovieID() {
        return this.movieID;
    }

    public void setMovieID(int movieID) {
        this.movieID = movieID;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getRating() {
        return this.rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public double calcLateFees(int numDays) {
        return 2.00 * numDays;
    }

    public boolean equals(Movie m2) {
        return (this.movieID == m2.getMovieID());
 
    }
    
    public String toString() {
        return String.format("Movie ID: %d, Title: %s, Rating: %s", this.movieID, this.title, this.rating);
    }
}
