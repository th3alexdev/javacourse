package OOP_BillingApp.models;

public class BillItem {
    private Integer amount;
    private Product product;
    private Integer id;
    private static int lastId;

    public BillItem(Integer id) {
        this.id = ++lastId;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public double calcTotal() {
        return this.amount * this.product.getPrice();
    }
}
