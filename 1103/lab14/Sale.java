package lab14;

public class Sale {
    private String itemName;
    private double itemPrice;
    private double taxRate; // as a value, not a percentage

    public Sale(String itemName, double itemPrice, double taxRate) {
        this.itemName = itemName;
        this.itemPrice = (itemPrice >= 0.0) ? itemPrice : 0.0;
        this.taxRate = (taxRate >= 0.0) ? taxRate : 0.0;
    }

    public Sale() {
        this("Name not known", 0.0, 0.0);
    }

    public Sale(Sale original) {
        this(original.getItemName(), original.getItemPrice(), original.getTaxRate());
    }

    public String getItemName() {
        return this.itemName;
    }

    public double getItemPrice() {
        return this.itemPrice;
    }

    public double getTaxRate() {
        return this.taxRate;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }

    public void setTaxRate(double taxRate) {
        this.taxRate = taxRate;
    }

    public double calcFinalTotal() {
        return itemPrice *= (1 + taxRate);
    }

    public boolean equals(Sale otherSale) {
        if (
            this.itemName.equals(otherSale.getItemName()) &&
            this.itemPrice == otherSale.getItemPrice() &&
            this.taxRate == otherSale.getTaxRate()
        ) {
            return true;
        }
        return false;
    }

    public String toString() {
        return String.format("Sale: %s, Price: %.2f, Tax: %d%%, Total: %.2f", this.itemName, this.itemPrice, (int) (this.taxRate * 100), this.calcFinalTotal());
    }

}