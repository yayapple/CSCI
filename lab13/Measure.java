package lab13;

public class Measure {
    private int feet;
    private int inches;
    private final double inchToCmMult = 2.54;

    public Measure(int feet, int inches) {
        if (inches >= 12) {
            feet += inches / 12;
            inches %= 12;
        }
        this.feet = feet;
        this.inches = inches;
    }

    public Measure() {
        this(0, 0);
    }

    public int getFeet() {
        return this.feet;
    }

    public void setFeet(int feet) {
        this.feet = feet;
    }

    public int getInches() {
        return this.inches;
    }

    public void setInches(int inches) {
        this.feet += inches / 12;
        this.inches = inches % 12;
    }

    public double convertCentimeters() {
        final int totalInches = this.feet * 12 + this.inches;
        return totalInches * inchToCmMult;
    }

    public Measure addMeasure(Measure m2) {
        final int totalInches = this.feet * 12 + this.inches + m2.getFeet() * 12 + m2.getInches();
        return new Measure(totalInches / 12, totalInches % 12);
    }

    public boolean equals(Measure m2) {
        if (m2.getFeet() == this.feet && m2.getInches() == this.inches) return true;
        return false;
    }

    public String toString() {
        return String.format("Measurement: %d feet %d inches, %.2f centimeters", this.feet, this.inches, this.convertCentimeters());
    }
}

