package lab10;

public class TestFraction {
    public static void main(String[] args) {
        Fraction frac1 = new Fraction();
        Fraction frac2 = new Fraction(10, 3);
        Fraction frac3 = new Fraction(24, 46);

        System.out.println("Constructors");
        System.out.printf("frac1: %s%n", frac1);
        System.out.printf("frac2: %s%n", frac2);
        System.out.printf("frac3: %s%n%n", frac3);

        System.out.println("Getters / setters");
        System.out.printf("frac1 numerator: %d%n", frac1.getNumerator());
        frac1.setNumerator(3);
        System.out.printf("frac1 numerator: %d%n", frac1.getNumerator());
        System.out.printf("frac2 denominator: %d%n", frac2.getDenominator());
        frac2.setDenominator(59);
        System.out.printf("frac2 denominator: %d%n%n", frac2.getDenominator());

        System.out.println("Decimal value");
        System.out.printf("frac1: %s, decimal value: %.3f%n", frac1, frac1.toDecimalValue());
        System.out.printf("frac2: %s, decimal value: %.3f%n", frac2, frac2.toDecimalValue());
        System.out.printf("frac3: %s, decimal value: %.3f%n%n", frac3, frac3.toDecimalValue());

        System.out.println("Change fraction");
        System.out.printf("frac1: %s%n", frac1);
        System.out.printf("frac2: %s%n", frac2);
        frac1.changeFraction(frac2);
        System.out.printf("frac1: %s%n", frac1);
        System.out.printf("frac2: %s%n%n", frac2);

        System.out.println("Multiply fractions");
        System.out.printf("frac2: %s%n", frac2);
        System.out.printf("frac3: %s%n", frac3);
        System.out.printf("frac2 * frac3: %s%n", frac2.multipleFractions(frac3));
        
    }
}
