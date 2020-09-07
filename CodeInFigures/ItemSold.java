public class ItemSold {
    private int invoiceNumber;
    private String description;
    private double price;

    public String getDescription() {
        return description;
    }

    public int getInvoiceNumber() {
        return invoiceNumber;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double petPrice) {
        price = petPrice;
    }

    public void setDescription(String petDescription) {
        description = petDescription;
    }

    public void setInvoiceNumber(int petInvoiceNumber) {
        invoiceNumber = petInvoiceNumber;
    }
}
