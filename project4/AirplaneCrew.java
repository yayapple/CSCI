package project4;

public class AirplaneCrew {
    private int airplaneID;
    private CrewMember[] crew;
    private int crewCount = 0;

    public AirplaneCrew(int airplaneID) {
        this.airplaneID = airplaneID;
        this.crew = new CrewMember[3];
    }

    public void addCrewMember(CrewMember member) {
        if (this.crewCount >= 3) {
            System.out.println("Cannot add member to crew.");
            return;
        }
        this.crew[this.crewCount] = member;
        this.crewCount++;
    }

    public int totalAvgRatings() {
        if (this.crewCount == 0) return 0;

        int sum = 0;
        for (int i = 0; i < this.crewCount; i++) {
            sum += this.crew[i].avgRatings();
        }
        return sum / this.crewCount;
    }
}
