package lab11;

public class Graduate extends Student {
    private String jobType;
    private double payRate;
    
    public Graduate(int studentID, double gpa, int numberCredits, String jobType, double payRate) {
        super(studentID, gpa, numberCredits);
        this.jobType = jobType;
        this.payRate = payRate;
    }

    public Graduate(int studentID) {
        this(studentID, 0.0, 0, "TA", 21.25);
    }

    public String getJobType() {
        return this.jobType;
    }
    
    public void setJobType(String jobType) {
        this.jobType = jobType;
    }

    public double getPayRate() {
        return this.payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    public void printMsg() {
        System.out.println("I am a Graduate student with Student ID " + this.studentID);
    }

    public String toString() {
        return String.format("%s, Job: %s, Rate: %.2f", super.toString(), this.jobType, this.payRate);
    }
}
