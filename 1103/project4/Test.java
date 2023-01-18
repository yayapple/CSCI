package project4;

public class Test {
    public static void main(String[] args) {
        CrewMember member1 = new CrewMember(1, "ethan", "peterson", "pilot", 3);

        System.out.println(member1);
        System.out.printf("no. of ratings: %d%nmin rating: %d%nmax rating: %d%navg rating: %d%n%n", member1.numRatings(), member1.minRating(), member1.maxRating(), member1.avgRatings());
        
        member1.addRating(10);

        System.out.println(member1);
        System.out.printf("no. of ratings: %d%nmin rating: %d%nmax rating: %d%navg rating: %d%n%n", member1.numRatings(), member1.minRating(), member1.maxRating(), member1.avgRatings());

        member1.addRating(90);
        
        System.out.println(member1);
        System.out.printf("no. of ratings: %d%nmin rating: %d%nmax rating: %d%navg rating: %d%n%n", member1.numRatings(), member1.minRating(), member1.maxRating(), member1.avgRatings());


        System.out.println("member1 adding out of range rating");
        member1.addRating(110);
        System.out.println();


        member1.addRating(100);

        System.out.println("member1 adding too many ratings");
        member1.addRating(100);
        System.out.println();

        System.out.println(member1);
        System.out.printf("no. of ratings: %d%nmin rating: %d%nmax rating: %d%navg rating: %d%n%n", member1.numRatings(), member1.minRating(), member1.maxRating(), member1.avgRatings());


        CrewMember member2 = new CrewMember(2, "aaaa", "bbbb", "copilot", 7);
        for (int i = 0; i < 7; i++) {
            member2.addRating(50+(i*5));
        }

        CrewMember member3 = new CrewMember(3, "bob", "l'eponge", "steward", 2);
        member3.addRating(40);
        member3.addRating(50);
        AirplaneCrew crew = new AirplaneCrew(1234);
        crew.addCrewMember(member1);
        crew.addCrewMember(member2);
        crew.addCrewMember(member3);

        System.out.printf("member 1 average rating: %d%nmember 2 average rating: %d%nmember 3 average rating: %d%n", member1.avgRatings(), member2.avgRatings(), member3.avgRatings());
        System.out.printf("Crew total rating: %d%n", crew.totalAvgRatings());
    }
}
