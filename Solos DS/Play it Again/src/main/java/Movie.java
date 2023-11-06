public class Movie {
    private String title;
    private String director;
    private int releaseYear;
    private String plot;
    private int runtimeInMinutes;
    private String rating;

    public Movie(String title, String director) {
        this.title = title;
        this.director = director;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public String getPlot() {
        return plot;
    }

    public void setPlot(String plot) {
        this.plot = plot;
    }

    public int getRuntimeInMinutes() {
        return runtimeInMinutes;
    }

    public void setRuntimeInMinutes(int runtimeInMinutes) {
        this.runtimeInMinutes = runtimeInMinutes;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return  "Title: " + title + "\n" +
                "Director: " + director + "\n" +
                "Release Year: " + releaseYear + "\n" +
                "Plot: " + plot + "\n" +
                "Runtime In Minutes: " + runtimeInMinutes + "\n" +
                "Rating: " + rating;
    }
}//end of class

