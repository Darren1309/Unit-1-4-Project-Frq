public class orderFood {
    private String name;
    private double price;
    //declaring each ingredient as a variable with amount in stock that can be changed outside of this class
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

    public orderFood(String name, double price) { //constructor to create a food item with a name and price
        this.name = name;
        this.price = price;
    }

    public String getName() { //returns name of food item
        return name;
    }

    public double getPrice() { //returns the price of the food item
        return price;
    }

}
