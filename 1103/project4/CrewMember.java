package project4;

public class CrewMember {
    private int crewId;
    private String firstName, lastName;
    private String position;
    private int[] ratings;
    private int count = 0;

    public CrewMember(int crewId, String firstName, String lastName, String position, int numRatings) {
        this.crewId = crewId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
        this.ratings = new int[numRatings];
    }

    // CrewId

    public void setCrewId(int crewId) {
        this.crewId = crewId;
    }

    public int getCrewId() {
        return this.crewId;
    }

    // lastName

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return this.lastName;
    }

    // firstName

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    public String getFirstName() {
        return this.firstName;
    }

    // position

    public void setPosition(String position) {
        this.position = position;
    }

    public String getPosition() {
        return this.position;
    }

    // ratings

    public int[] getRatings() {
        return this.ratings;
    }

    public void addRating(int rating) {
        if (this.count > this.ratings.length - 1) {
            System.out.println("Cannot add rating to list.");
            return;
        }
        if (rating > 100 || rating < 0) {
            System.out.println("Rating must be between 0 and 100 inclusive.");
            return;
        }

        this.ratings[this.count] = rating;
        this.count++;
    }

    public int avgRatings() {
        if (this.count == 0) return 0;

        int sum = 0;
        for (int i = 0; i < this.count; i++) {
            sum += this.ratings[i];
        }

        return sum / this.count;
    }

    public int maxRating() {
        if (this.count == 0) return 0;

        int max = 0;
        for (int i = 0; i < this.count; i++) {
            if (this.ratings[i] > max) max = this.ratings[i];
        }

        return max;
    }

    public int minRating() {
        if (this.count == 0) return 0;

        int min = this.ratings[0];
        for (int i = 0; i < this.count; i++) {
            if (this.ratings[i] < min) min = this.ratings[i];
        }

        return min;
    }

    public int numRatings() {
        return this.count;
    }

    // toString

    public String toString() {
        String ratingList = "[";
        for (int i = 0; i < this.ratings.length - 1; i++) {
            ratingList += this.ratings[i] + ", ";
        }
        ratingList += this.ratings[this.ratings.length-1] + "]";

        int avgRating = avgRatings();

        return String.format("Crew Member: %d, %s %s, %s, %s, %d", this.crewId, this.firstName, this.lastName, this.position, ratingList, avgRating);
    }
}