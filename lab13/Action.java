package lab13;

public class Action extends Movie {
    public Action(int movieID, String title, String rating) {
        super(movieID, title, rating);
    }

    public Action () {
        super();
    }

    public String toString() {
        return "Action " + super.toString();
    }
}
