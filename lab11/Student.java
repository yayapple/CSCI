package lab11;

public class Student {
    protected int studentID;
    private double gpa;
    private int numberCredits;

    public Student(int studentID, double gpa, int numberCredits) {
        this.studentID = studentID;
        this.gpa = gpa;
        this.numberCredits = numberCredits;
    }

    public Student(int studentID) {
        this(studentID, 0.0, 0);
    }

    public Student() {
        this(0, 0.0, 0);
    }

    public int getStudentID() {
        return this.studentID;
    }

    public double getGpa() {
        return this.gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public int getNumberCredits() {
        return this.numberCredits;
    }

    public void setNumberCredits(int numberCredits) {
        this.numberCredits = numberCredits;
    }

    public void printMsg() {
        System.out.println("I am a Student.");
    }

    public String toString() {
        return String.format("StudentID: %d, GPA: %.2f, Total Credits: %d", this.studentID, this.gpa, this.numberCredits);
    }
}
