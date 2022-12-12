package lab14;

public class DiscountSale extends Sale {
    private double discount;
    public DiscountSale(String itemName, double itemPrice, double taxRate, double discount) {
        super(itemName, itemPrice, taxRate);
        this.discount = discount;
    }

    public DiscountSale() {
        super();
        this.discount = 0.0;
    }

    public double getDiscount() {
        return this.discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double bill() {
        double preFinal = this.calcFinalTotal();
        return preFinal *= (1 - this.discount);
    }

    public String toString() {
        return String.format("Sale: %s, Price: %.2f, Tax: %d%%, Discount: %d%%, Total: %.2f", this.getItemName(), this.getItemPrice(), (int) (this.getTaxRate() * 100), (int) (this.discount * 100), this.bill());
    }
    
}
