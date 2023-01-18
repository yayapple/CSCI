package lab11;

public class TestAll {
    public static void main(String[] args) {
        Student shana = new Student(1001); 
        shana.printMsg(); // Prints:  I am a Student. 
        System.out.println(shana);  // Prints: StudentID: 1001, GPA:  0.0, Total Credits:  0
        shana.setGpa(3.33);
        shana.setNumberCredits(117);
        System.out.println(shana);
        System.out.println(shana.getGpa());
        System.out.println(shana.getNumberCredits());
        System.out.println(shana.getStudentID());
        System.out.println();

        Graduate john = new Graduate(1234, 3.33, 120, "barista", 15.00);
        john.printMsg();
        System.out.println(john);
        john.setGpa(3.45);
        john.setNumberCredits(121);
        john.setJobType("welder");
        john.setPayRate(25.50);
        System.out.println(john);
        System.out.println(john.getJobType());
        System.out.println(john.getPayRate());
        System.out.println(john.getGpa());
        System.out.println(john.getNumberCredits());
        System.out.println(john.getStudentID());
    }
}
