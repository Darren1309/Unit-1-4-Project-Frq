public class Customer {
    private String name;
    private String order;

    public Customer(String name, String order) {
        this.name = name;
        this.order = order;
    }

    public String getName() {
        return name;
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }
    
}
