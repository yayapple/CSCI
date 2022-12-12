package lab14;

public class TestAll {
    public static void main(String[] args) {
        Sale s1 = new Sale();
        Sale s2 = new Sale("eggs", 45.99, 0.10);
        Sale s3 = new Sale(s2);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        System.out.println(s2.equals(s3));
    
        DiscountSale d1 = new DiscountSale();
        DiscountSale d2 = new DiscountSale("eggs 2", 49.99, 0.10, 0.05);

        System.out.println(d1);
        System.out.println(d2);

        System.out.println(new Sale("calculator", 20.00, 0.05));
        System.out.println(new DiscountSale("calculator", 20.00, 0.05, 0.02));
    }
}
