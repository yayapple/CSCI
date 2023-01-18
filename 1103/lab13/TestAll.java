package lab13;

public class TestAll {
    public static void main(String args[]) {
        Measure m1 = new Measure();
        Measure m2 = new Measure(5, 6);
        Measure m3 = new Measure(6, 1);

        System.out.println("MEASURE");

        System.out.println("toString");
        System.out.println(m1);
        System.out.println(m2);
        System.out.println();

        System.out.println("getters");
        System.out.println("m2 feet: " + m2.getFeet());
        System.out.println("m2 inches: " + m2.getInches());
        System.out.println();

        System.out.println("setters");
        m1.setFeet(4);
        m1.setInches(6);
        System.out.println("4 foot 6: " + m1);
        m1.setFeet(4);
        m1.setInches(20);
        System.out.println("5 foot 8: " + m1);
        System.out.println();

        System.out.println("addMeasure");
        m2 = m2.addMeasure(new Measure(0, 7));
        System.out.println("6 foot 1: " + m2);
        System.out.println();

        System.out.println("equals");
        System.out.println("false: " + m1.equals(m2));
        System.out.println("true: " + m2.equals(m3));
        System.out.println();
        System.out.println();

        System.out.println("MOVIE");
        Movie movie1 = new Movie();
        Movie movie2 = new Movie(1234, "movie name two!!", "PG-13");

        System.out.println("getters");
        System.out.println("movieID: " + movie2.getMovieID());
        System.out.println("title: " + movie2.getTitle());
        System.out.println("rating: " + movie2.getRating());
        System.out.println();

        System.out.println("setters");
        movie1.setMovieID(12121);
        movie1.setRating("G");
        movie1.setTitle("movie name one!!");
        System.out.println(movie1);
        System.out.println(movie2);
        System.out.println();

        System.out.println("equals");
        System.out.println("true: " + movie2.equals(movie2));
        System.out.println("false: " + movie1.equals(movie2));
        System.out.println();
        System.out.println();

        System.out.println("ACTION");
        Action action1 = new Action(9999, "action movie!!!", "R");
        System.out.println(action1);



    }
}
