public class orderFood {
    private String name;
    private double price;
    public static int coffeeBeans = 0;
    public static int milk = 0;
    public static int muffins = 0;

    public static int turkey = 0;
    public static int tomatoes = 0;
    public static int lettuce = 0;
    public static int bread = 0;

    public static int pancakes = 0;
    public static int waffles = 0;

    public static int tortillas = 0;
    public static int sausage = 0;
    public static int potatoes = 0;
    public static int cheese = 0;
    public static int eggs = 0;

    public static int bagels = 0;

    public orderFood(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

}
