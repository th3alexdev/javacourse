package OOP_BillingApp.models;

import java.util.Arrays;
import java.util.Date;
public class Bill {
    private Integer code;
    private String description;
    private Date date;
    private Customer customer;
    private BillItem[] items;
    private int itemsIndex;
    private static int lastCode;
    public static final int MAX_ITEMS = 50;

    public Bill() {
        this.items = new BillItem[MAX_ITEMS];
        this.code = +lastCode;
        this.date = new Date();
    }

    public Bill(String description, Customer customer) {
        this();
        this.description = description;
        this.customer = customer;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public BillItem[] getItems() {
        return items;
    }

    public void setItems(BillItem[] items) {
        this.items = items;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void addBillItem(BillItem item) {
        if(itemsIndex < MAX_ITEMS) {
            this.items[itemsIndex++] = item;
        }
    }

    public float calcTotal() {
        float total = 0.0f;
        for (BillItem item: this.items) {
            if(item == null) {
                continue;
            }
            total += item.calcTotal();
        }
        return total;
    }

    public StringBuilder showDetails() {
        StringBuilder sb = new StringBuilder("Bill #" + code);
        sb.append("\n\tdescription -> ").append(this.getDescription())
                .append("\n\tdate -> ").append(this.getDate())
                .append("\n\tcustomer -> ").append(this.getCustomer())
                .append("\n\titems -> ").append(Arrays.toString(items));

        return sb;
    }
}
