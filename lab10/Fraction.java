package lab10;

public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction() {
        this(1, 1);
    }

    public int getNumerator() {
        return this.numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return this.denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public double toDecimalValue() {
        return ((double) numerator) / (denominator);
    }

    public void changeFraction(Fraction fraction2) {
        this.numerator = fraction2.getNumerator();
        this.denominator = fraction2.getDenominator();
    }

    public Fraction multipleFractions(Fraction fraction2) {
        int num = this.numerator * fraction2.getNumerator();
        int dem = this.denominator * fraction2.getDenominator();
        return new Fraction(num, dem);
    }

    public String toString() {
        return String.format("%d/%d", this.numerator, this.denominator);
    }
}
