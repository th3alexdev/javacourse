package OOP_BillingApp.models;

public class Product {

    private Integer lastId;
    private static Integer id;
    private Integer code;
    private String name;
    private Double price;

    public Product(Integer code) {
        id += ++this.lastId;
    }

    public Integer getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
