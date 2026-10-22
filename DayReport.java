public class DayReport {
    private int day;
    private double sales;
    private Customer[] customers;
    private int customerCount;

    // Shared by all DayReport objects, so this belongs to the class.
    private static int reportsCreated = 0;

    // Constructor creates space for the customers from one day.
    public DayReport(int day, int maxCustomers) {
        this.day = day;
        this.sales = 0.0;
        this.customers = new Customer[maxCustomers];
        this.customerCount = 0;
        reportsCreated++;
    }

    // Calls the other constructor with a default capacity of 20.
    public DayReport(int day) {
        this(day, 20);
    }

    /** Returns the day number. */
    public int getDay() {
        return day;
    }

    /** Returns the total sales recorded for the day. */
    public double getSales() {
        return sales;
    }

    /** Changes the day number.
     * Precondition: day must be between 1 and 7.
     * Postcondition: the day is updated if the value is valid.
     */
    public void setDay(int day) {
        if (day >= 1 && day <= 7) {
            this.day = day;
        }
    }

    /** Adds a sale to this day's total.
     * Precondition: amount must be nonnegative.
     * Postcondition: sales increases by amount if valid.
     */
    public void addSale(double amount) {
        if (amount >= 0) {
            sales += amount;
        }
    }

    /**
     * Records a customer in the first available array position.
     * Precondition: customer is not null.
     * Postcondition: returns true if added; otherwise false.
     */
    public boolean addCustomer(Customer customer) {
        if (customer == null) {
            return false;
        }

        if (customerCount < customers.length) {
            customers[customerCount] = customer;
            customerCount++;
            return true;
        }

        return false;
    }

    /** Returns the number of customers recorded. */
    public int getCustomerCount() {
        return customerCount;
    }

    /** Returns the number of DayReport objects created. */
    public static int getReportsCreated() {
        return reportsCreated;
    }

    /** Returns a summary of the day's performance. */
    public String toString() {
        return "Day " + day
            + " | Sales: $" + String.format("%.2f", sales)
            + " | Customers: " + customerCount;
    }
}
