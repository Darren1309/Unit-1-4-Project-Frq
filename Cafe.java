import java.util.Scanner;

/*
 * Playtest log 1 - Daniel Miao
 * Potential improvements: add delay when customers order, fix floating-point math errors when subtracting amount in wallet (e.g round result to one decimal), print total amount that user earned (final$ - 100)
 * Good aspects of program: input checking for invalid input, reasonable prices and earnings, large variety of inventory items for stock, randomization of customers
 * 
 * Playtest log 2 - Kavin Gahlaut
 *  Potential improvements: Making sure that the customer's order is still printed out even if it is unable to be served.
 * Good aspects: good input validation, randomizing of customer names, using public instance variables for better access to them
 * 
 * Playtest log 3 - William Xiong
 * Potential improvements: floating point errors lol, yo what are the customers ordering bro ur losing customers, u gotta fix that
 * also add a delay between dialogue so its not js spam. Also, buying is kinda tedious, u should add a buy how many option.
 * also add a check option to see how much money u still have, it stops printing that if u do a too expensive thing
 * Yo u Really gotta fix that ordered a " ". 
 * 
 */

public class Cafe{
    public static void main(String[] args){
        //Intro to cafe giving directions and asking input for name of cafe
        Scanner i = new Scanner(System.in);
        System.out.println("Welcome to your Cafe!");
        System.out.println("Please enter the name for your Cafe: ");
        String cafeName = i.nextLine();
        System.out.println("Welcome to the " + cafeName + " Cafe! The goal is to make as much money as possible in 7 days. \nYou will start with $100.00 and you will have to buy ingredients for your Cafe. \nYou will then have to serve customers and make money. Good luck!");
        //creating food items on the menu into the orderFood class
        orderFood coffee = new orderFood("Coffee", 6.50);
        orderFood muffin = new orderFood("Muffin", 7.00);
        orderFood sandwich = new orderFood("Sandwich", 9.00);
        orderFood pancake = new orderFood("Pancake", 12.00);
        orderFood bagel = new orderFood("Bagel", 5.00);
        orderFood breakfastBurrito = new orderFood("Breakfast Burrito", 15.00);
        orderFood waffle = new orderFood("Waffle", 6.50);
        orderFood toast = new orderFood("Toast", 3.00);
        double money = 100.0;
        int days = 0;
        double[] dailySales = new double[7]; //array to store daily sales for each of the 7 days
        DayReport[] reports = new DayReport[7];//array to store DayReport objects for each of the 7 days
        //Start of while loop that loops for 7 days the user will be managing the cafe
        while(days < 7){
            System.out.println("Welcome to Day " + (days + 1) + " of 7!");
            DayReport today = new DayReport(days + 1);//creating a new DayReport object for the day
            reports[days] = today;//storing the DayReport object in the reports array
            //Printing out how many ingredients the user has and the cost of them to buy more
            System.out.println("Here is the ingredients you have in stock: ");
            System.out.println("1 Coffee Beans: " + orderFood.coffeeBeans + " $2.00");
            System.out.println("2 Milk: " + orderFood.milk + " $1.00");
            System.out.println("3 Muffins: " + orderFood.muffins + " $3.00");
            System.out.println("4 Turkey: " + orderFood.turkey + " $5.00 for 8 slices");
            System.out.println("5 Tomatoes: " + orderFood.tomatoes + " $1.00");
            System.out.println("6 Lettuce: " + orderFood.lettuce + " $1.00");
            System.out.println("7 Bread: " + orderFood.bread + " $2.50 for 20 slices");
            System.out.println("8 Pancakes: " + orderFood.pancakes + " $4.00");
            System.out.println("9 Waffles: " + orderFood.waffles + " $4.50");
            System.out.println("10 Tortillas: " + orderFood.tortillas + " $3.50 for 10");
            System.out.println("11 Sausage: " + orderFood.sausage + " $2.00");
            System.out.println("12 Potatoes: " + orderFood.potatoes + " $1.50");
            System.out.println("13 Cheese: " + orderFood.cheese + " $2.50");
            System.out.println("14 Eggs: " + orderFood.eggs + " $3.30 for 12");
            System.out.println("15 Bagels: " + orderFood.bagels + " $9.00 for 12");
            
            System.out.println("New Day! You have $" + money + " to spend on ingredients.");
            //loops until user types "exit" and lets the user buy ingredients in the stock with the money they have,telling them if it's not enough
            //entering a number correseponds with a ingredient, adding it to the stock and subtracting price by cost
            
            while(true){
                System.out.println("Type the number for the ingredient you would like to add to your stock, or type 'exit' to exit the cafe program.");
                String input = i.nextLine();
                if (input.equals("exit")){ //checking if user wants to exit the ordering program, breaking out buying process if true
                    System.out.println("Thank you for using the Cafe program!");
                    break;
                }
                else if (input.equals("1")){ //checking if the ingredient they want to buy is coffee
                    if (money < 2.00){ //checking if money amount is enough to buy ingredient
                        System.out.println("You do not have enough money to buy Coffee Beans.");
                        continue;
                    }
                    orderFood.coffeeBeans++; //adds 1 to coffee bean variable in the stock from the orderFood class
                    money -= 2.00; //subtracting the amount of money the ingredient costs
                    money = Math.round(money * 100.0) / 100.0; //eliminate floating point error
                    System.out.println("You have added 1 Coffee Bean to your stock."); //confirming the ingredient was bought
                }
                else if (input.equals("2")){
                    if (money < 1.00){
                        System.out.println("You do not have enough money to buy Milk.");
                        continue;
                    }
                    orderFood.milk++;
                    money -= 1.00;
                    money = Math.round(money * 100.0) / 100.0;
                    System.out.println("You have added 1 Milk to your stock.");
                }
                else if (input.equals("3")){
                    if (money < 3.00){
                        System.out.println("You do not have enough money to buy Muffins.");
                        continue;
                    }
                    orderFood.muffins++;
                    money -= 3.00;
                    money = Math.round(money * 100.0) / 100.0;
                    System.out.println("You have added 1 Muffin to your stock.");
                }
                else if (input.equals("4")){
                    if (money < 5.00){
                        System.out.println("You do not have enough money to buy Turkey.");
                        continue;
                    }
                    orderFood.turkey += 8;
                    money -= 5.00;
                    money = Math.round(money * 100.0) / 100.0;
                    System.out.println("You have added 8 Turkey to your stock.");
                }
                else if (input.equals("5")){
                    if (money < 1.00){
                        System.out.println("You do not have enough money to buy Tomatoes.");
                        continue;
                    }
                    orderFood.tomatoes++;
                    money -= 1.00;
                    money = Math.round(money * 100.0) / 100.0;
                    System.out.println("You have added 1 Tomato to your stock.");
                }
                else if (input.equals("6")){
                    if (money < 1.00){
                        System.out.println("You do not have enough money to buy Lettuce.");
                        continue;
                    }
                    orderFood.lettuce++;
                    money -= 1.00;
                    money = Math.round(money * 100.0) / 100.0;
                    System.out.println("You have added 1 Lettuce to your stock.");
                }
                else if (input.equals("7")){
                    if (money < 2.50){
                        System.out.println("You do not have enough money to buy Bread.");
                        continue;
                    }
                    orderFood.bread += 20;
                    money -= 2.50;
                    money = Math.round(money * 100.0) / 100.0;
                    System.out.println("You have added 20 Bread to your stock.");
                }
                else if (input.equals("8")){
                    if (money < 4.00){
                        System.out.println("You do not have enough money to buy Pancakes.");
                        continue;
                    }
                    orderFood.pancakes++;
                    money -= 4.00;
                    money = Math.round(money * 100.0) / 100.0;
                    System.out.println("You have added 1 Pancake to your stock.");
                }
                else if (input.equals("9")){
                    if (money < 4.50){
                        System.out.println("You do not have enough money to buy Waffles.");
                        continue;
                    }
                    orderFood.waffles++;
                    money -= 4.50;
                    money = Math.round(money * 100.0) / 100.0;
                    System.out.println("You have added 1 Waffle to your stock.");
                }
                else if (input.equals("10")){
                    if (money < 3.50){
                        System.out.println("You do not have enough money to buy Tortillas.");
                        continue;
                    }
                    orderFood.tortillas += 10;
                    money -= 3.50;
                    money = Math.round(money * 100.0) / 100.0;
                    System.out.println("You have added 10 Tortillas to your stock.");
                }
                else if (input.equals("11")){
                    if (money < 2.00){
                        System.out.println("You do not have enough money to buy Sausage.");
                        continue;
                    }
                    orderFood.sausage++;
                    money -= 2.00;
                    money = Math.round(money * 100.0) / 100.0;
                    System.out.println("You have added 1 Sausage to your stock.");
                }
                else if (input.equals("12")){
                    if (money < 1.50){
                        System.out.println("You do not have enough money to buy Potatoes.");
                        continue;
                    }
                    orderFood.potatoes++;
                    money -= 1.50;
                    money = Math.round(money * 100.0) / 100.0;
                    System.out.println("You have added 1 Potato to your stock.");
                }
                else if (input.equals("13")){
                    if (money < 2.50){
                        System.out.println("You do not have enough money to buy Cheese.");
                        continue;
                    }
                    orderFood.cheese++;
                    money -= 2.50;
                    money = Math.round(money * 100.0) / 100.0;
                    System.out.println("You have added 1 Cheese to your stock.");
                }
                else if (input.equals("14")){
                    if (money < 3.30){
                        System.out.println("You do not have enough money to buy Eggs.");
                        continue;
                    }
                    orderFood.eggs += 12;
                    money -= 3.30;
                    money = Math.round(money * 100.0) / 100.0;
                    System.out.println("You have added 12 Eggs to your stock.");
                }
                else if (input.equals("15")){
                    if (money < 9.00){
                        System.out.println("You do not have enough money to buy Bagels.");
                        continue;
                    }
                    orderFood.bagels += 12;
                    money -= 9.00;
                    money = Math.round(money * 100.0) / 100.0;
                    System.out.println("You have added 12 Bagels to your stock.");
                }
                else{
                    System.out.println("Invalid input. Please try again.");
                }
                System.out.println("You have $" + money + " left."); //prints out the money left after each loop
            }
            //starting a day of the cafe
            System.out.println("Ready to start the day!");
            int numCustomers = (int)(Math.random()*9)+7; //generating a random int from 7-15 so there is 7-15 customers randomly per day
            while(numCustomers > 0){ //looping until there are no customers left
                boolean hasItem = true;
                double price = 0;
                int orderAmount = (int)(Math.random()*4)+1; //determines if the customer will order 1-4 items randomly
                int order1 = (int)(Math.random()*8)+1; //determining what the customer will order using a random number 1-11 to determine
                int order2 = (int)(Math.random()*8)+1;
                int order3 = (int)(Math.random()*8)+1;
                int order4 = (int)(Math.random()*8)+1;
                String order = "";
                String Order2 = "";
                String Order3 = "";
                String Order4 = "";

                    if (order1 == 1){
                        order += "Coffee"; //setting the order for the customer to Coffee
                        if (orderFood.coffeeBeans > 0 && orderFood.milk > 0){ //checks if the first order is 1 and if the ingredients are more than 1
                            orderFood.coffeeBeans--; //subtracting ingredients from the stock
                            orderFood.milk--;
                            price = coffee.getPrice(); //getting the price for the item from the coffee object from the orderFood class
                        }
                        else{
                            hasItem = false; //if the ingredients are out of stock then it sets the hasItem variable to false
                        }
                    }
                
                    //same for the rest checking if the first order is the item then subtracting the ingredients from the stock then getting the price from object in the orderFood class
                    else if (order1 == 2){
                         order += "Muffin";
                        if (orderFood.muffins > 0){
                            orderFood.muffins--;
                            price = muffin.getPrice();
                        }
                        else{
                            hasItem = false;
                        }
                    }
                    else if (order1 == 3){
                        order += "Sandwich";
                        if (orderFood.turkey > 0 && orderFood.tomatoes > 0 && orderFood.lettuce > 0 && orderFood.bread > 0){
                            orderFood.turkey--;
                            orderFood.tomatoes--;
                            orderFood.lettuce--;
                            orderFood.bread--;
                        
                        price = sandwich.getPrice();
                        }
                        else{
                            hasItem = false;
                        }
                    }
                    else if (order1 == 4 ){
                        order += "Pancakes";
                        if (orderFood.pancakes > 0){
                            orderFood.pancakes--;
                            
                            price = pancake.getPrice();
                        }
                        else{
                            hasItem = false;
                        }
                    }
                    else if (order1 == 5 ){
                        order += "Waffles";
                        if (orderFood.waffles > 0){
                            orderFood.waffles--;
                            
                            price = waffle.getPrice();
                        }
                        else{
                            hasItem = false;
                        }
                    }
                    else if (order1 == 6 ){
                        order += "Breakfast Burrito";
                        if (orderFood.tortillas > 0 && orderFood.sausage > 0 && orderFood.potatoes > 0 && orderFood.cheese > 0 && orderFood.eggs > 0){
                            orderFood.tortillas--;
                            orderFood.sausage--;
                            orderFood.potatoes--;
                            orderFood.cheese--;
                            orderFood.eggs--;
                            
                        price = breakfastBurrito.getPrice();
                        }
                        else{
                            hasItem = false;
                        }
                    }
                    else if (order1 == 7 ){
                        order += "Bagel";
                        if (orderFood.bagels > 0){
                            orderFood.bagels--;
                            
                            price = bagel.getPrice();
                        }
                        else{
                            hasItem = false;
                        }
                    }
                    else if(order1 == 8 ){
                        order += "Toast";
                        if (orderFood.bread > 0){
                            orderFood.bread--;
                            price = toast.getPrice();
                        }
                        else{
                            hasItem = false;
                        }
                    }
                    else{           
                        hasItem = false;
                    }
                    if (!hasItem){ //if the ingredients are out prints that the item is out of stock
                        System.out.println("Sorry, we are out of that item.");
                    }
                    else{
                        money += price; //adds the price of the item to the total money of the cafe
                        money = Math.round(money * 100.0) / 100.0;
                        today.addSale(price); //adds the price of the item to the total sales of the day
                    }
                
                price = 0; //resets the price to 0 for next order
                hasItem = true; //resets the hasItem variable to true for next order
                if (orderAmount == 2 || orderAmount == 3 || orderAmount == 4){ //checks if the order amount is 2 3 or 4 and does the same as above
                    if (order2 == 1 ){
                        Order2 += "Coffee";
                        if (orderFood.coffeeBeans > 0 && orderFood.milk > 0){
                            orderFood.coffeeBeans--;
                            orderFood.milk--;
                            price = coffee.getPrice();
                        }
                        else{
                            hasItem = false;
                        }
                    }
                    else if (order2 == 2 ){
                        Order2 += "Muffin";
                        if (orderFood.muffins > 0){
                            orderFood.muffins--;
                            price = muffin.getPrice();
                        }
                        else{
                            hasItem = false;
                        }
                    }
                    else if (order2 == 3 ){
                        Order2 += "Sandwich";
                        if (orderFood.turkey > 0 && orderFood.tomatoes > 0 && orderFood.lettuce > 0 && orderFood.bread > 0){
                            orderFood.turkey--;
                            orderFood.tomatoes--;
                            orderFood.lettuce--;
                            orderFood.bread--;
                            price = sandwich.getPrice();
                        }
                        else{
                            hasItem = false;
                        }
                    }
                    else if (order2 == 4){
                        Order2 += "Pancakes";
                        if (orderFood.pancakes > 0){
                            orderFood.pancakes--;
                            price = pancake.getPrice();
                        }
                        else{
                            hasItem = false;
                        }
                    }
                    else if (order2 == 5){
                        Order2 += "Waffle";
                        if (orderFood.waffles > 0){
                            orderFood.waffles--;
                            price = waffle.getPrice();
                        }
                        else{
                            hasItem = false;
                        }
                    }
                    else if (order2 == 6){
                        Order2 += "Breakfast Burrito";
                        if (orderFood.tortillas > 0 && orderFood.sausage > 0 && orderFood.potatoes > 0 && orderFood.cheese > 0 && orderFood.eggs > 0){
                            orderFood.tortillas--;
                            orderFood.sausage--;
                            orderFood.potatoes--;
                            orderFood.cheese--;
                            orderFood.eggs--;
                            price = breakfastBurrito.getPrice();
                        }
                        else{
                            hasItem = false;
                        }
                    }
                    else if (order2 == 7){
                        Order2 += "Bagel";
                        if (orderFood.bagels > 0){
                            orderFood.bagels--;
                            price = bagel.getPrice();
                        }
                        else{
                            hasItem = false;
                        }
                    }
                    else if (order2 == 8 ){
                        Order2 += "Toast";
                        if (orderFood.bread > 0){
                            orderFood.bread--;
                            price = toast.getPrice();
                        }
                        else{
                            hasItem = false;
                        }
                    }
                    if (!hasItem){ //if the ingredients are out prints that the item is out of stock
                        System.out.println("Sorry, we are out of that item.");
                    }
                    else{
                        money += price; //adds the price of the item to the total money of the cafe
                        money = Math.round(money * 100.0) / 100.0;
                        today.addSale(price); //adds the price of the item to the total sales of the day

                    
                    }

                price = 0; //resets the price to 0 for next order
                hasItem = true; //resets the hasItem variable to true for next order
                if (orderAmount == 3 || orderAmount == 4){ //checks if order amount is 3 or 4 and does the same as the above 2
                    if (order3 == 1 ){
                        Order3 += "Coffee";
                        if (orderFood.coffeeBeans > 0 && orderFood.milk > 0){
                            orderFood.coffeeBeans--;
                            orderFood.milk--;
                            price = coffee.getPrice();
                        }
                        else{
                            hasItem = false;
                        }
                    }
                    else if (order3 == 2){
                        Order3 += "Muffin";
                        if (orderFood.muffins > 0){
                            orderFood.muffins--;
                            price = muffin.getPrice();
                        }
                        else{
                            hasItem = false;
                        }
                    }
                    else if (order3 == 3){
                        Order3 += "Sandwich";
                        if (orderFood.turkey > 0 && orderFood.tomatoes > 0 && orderFood.lettuce > 0 && orderFood.bread > 0){
                            orderFood.turkey--;
                            orderFood.tomatoes--;
                            orderFood.lettuce--;
                            orderFood.bread--;
                            price = sandwich.getPrice();
                        }
                        else{
                            hasItem = false;
                        }
                    }
                    else if (order3 == 4){
                        Order3 += "Pancakes";
                        if (orderFood.pancakes > 0){
                            orderFood.pancakes--;
                            price = pancake.getPrice();
                        }
                        else{
                            hasItem = false;
                        }
                    }
                    else if (order3 == 5){
                        Order3 += "Waffle";
                        if (orderFood.waffles > 0){
                            orderFood.waffles--;
                            price = waffle.getPrice();
                        }
                        else{
                            hasItem = false;
                        }
                    }
                    else if (order3 == 6){
                        Order3 += "Breakfast Burrito";
                        if (orderFood.tortillas > 0 && orderFood.sausage > 0 && orderFood.potatoes > 0 && orderFood.cheese > 0 && orderFood.eggs > 0){
                            orderFood.tortillas--;
                            orderFood.sausage--;
                            orderFood.potatoes--;
                            orderFood.cheese--;
                        orderFood.eggs--;
                        price = breakfastBurrito.getPrice();
                        }
                        else{
                            hasItem = false;
                        }
                    }
                    else if (order3 == 7){
                        Order3 += "Bagel";
                        if (orderFood.bagels > 0){
                            orderFood.bagels--;
                            price = bagel.getPrice();
                        }
                        else{
                            hasItem = false;
                        }
                    }
                    else if (order3 == 8 ){
                        Order3 += "Toast";
                        if (orderFood.bread > 0){
                            orderFood.bread--;
                            price = toast.getPrice();
                        }
                        else{
                            hasItem = false;
                        }
                    }
                    if (!hasItem){ //if the ingredients are out prints that the item is out of stock
                        System.out.println("Sorry, we are out of that item.");
                    }
                    else{
                        money += price; //adds the price of the item to the total money of the cafe
                        money = Math.round(money * 100.0) / 100.0;
                        today.addSale(price); //adds the price of the item to the total sales of the day
                    }
                }
                price = 0; //resets the price to 0 for next order
                hasItem = true; //resets the hasItem variable to true for next order
                if(orderAmount == 4){ //only runs if order amount is 4 and does the same as the rest
                    if (order4 == 1){
                        Order4 += "Coffee";
                        if (orderFood.coffeeBeans > 0 && orderFood.milk > 0){
                            orderFood.coffeeBeans--;
                            orderFood.milk--;
                            price = coffee.getPrice();
                        }
                        else{
                            hasItem = false;
                        }
                    }
                    else if (order4 == 2){
                        Order4 += "Muffin";
                        if (orderFood.muffins > 0){
                            orderFood.muffins--;
                            price = muffin.getPrice();
                        }
                        else{
                            hasItem = false;
                        }
                    }
                    else if (order4 == 3){
                        Order4 += "Sandwich";
                        if (orderFood.turkey > 0 && orderFood.tomatoes > 0 && orderFood.lettuce > 0 && orderFood.bread > 0){
                            orderFood.turkey--;
                            orderFood.tomatoes--;
                            orderFood.lettuce--;
                            orderFood.bread--;
                            price = sandwich.getPrice();
                        }
                        else{
                            hasItem = false;
                        }
                    }
                    else if (order4 == 4){
                        Order4 += "Pancakes";
                        if (orderFood.pancakes > 0){
                            orderFood.pancakes--;
                            price = pancake.getPrice();
                        }
                        else{
                            hasItem = false;
                        }
                    }
                    else if (order4 == 5){
                        Order4 += "Waffles";
                        if (orderFood.waffles > 0){
                            orderFood.waffles--;
                            price = waffle.getPrice();
                        }
                        else{
                            hasItem = false;
                        }
                    }
                    else if (order4 == 6 ){
                        Order4 += "Breakfast Burrito";
                        if (orderFood.tortillas > 0 && orderFood.sausage > 0 && orderFood.potatoes > 0 && orderFood.cheese > 0 && orderFood.eggs > 0){
                            orderFood.tortillas--;
                            orderFood.sausage--;
                            orderFood.potatoes--;
                            orderFood.cheese--;
                            orderFood.eggs--;
                            price = breakfastBurrito.getPrice();
                        }
                        else{
                            hasItem = false;
                        }
                    }
                    else if (order4 == 7){
                        Order4 += "Bagel";
                        if (orderFood.bagels > 0){
                            orderFood.bagels--;
                            price = bagel.getPrice();
                        }
                        else{
                            hasItem = false;
                        }
                    }
                    else if (order4 == 8 ){
                        Order4 += "Toast";
                        if (orderFood.bread > 0){
                            orderFood.bread--;
                            price = toast.getPrice();
                        }
                        else{
                            hasItem = false;
                        }
                    }
                    if (!hasItem){ //if the ingredients are out prints that the item is out of stock
                        System.out.println("Sorry, we are out of that item.");
                    }
                    else{
                        money += price; //adds the price of the item to the total money of the cafe
                        money = Math.round(money * 100.0) / 100.0;
                        today.addSale(price); //adds the price of the item to the total sales of the day
                    }
                }
                    Customer customer;
                    if (orderAmount == 1) {
                        customer = new Customer(order);
                    }
                    else if (orderAmount == 2) {
                        customer = new Customer(order, Order2);
                    }
                    else if (orderAmount == 3) {
                        customer = new Customer(order, Order2, Order3);
                    }
                    else {
                        customer = new Customer(order, Order2, Order3, Order4);
                    }
                    today.addCustomer(customer); //adds the customer to the DayReport object for the day
                    System.out.print(customer.getName() + " has ordered: ");
                    System.out.print(customer.getOrder());

                    if (orderAmount >= 2) {
                        System.out.print(", " + customer.getOrder2());
                    }
                    if (orderAmount >= 3) {
                        System.out.print(", " + customer.getOrder3());
                    }
                    if (orderAmount >= 4) {
                        System.out.print(", " + customer.getOrder4());
                    }

                    System.out.println(".");    
                    numCustomers--; //subtracts one customer from the amount of the day
                
                System.out.println("Number of customers remaining: " + numCustomers);
                System.out.println("You have $" + money + " left."); //prints amount of money after transaction
            }
            dailySales[days] = today.getSales(); //adds the price of the item to the total sales of the day
            System.out.println(today);
            
            days++; //adds a day to the amount of days


        }
        //completed cafe simulation of 7 days and printing how much money was made after all 7 days
        System.out.println("You have completed 7 days of running your Cafe!");
        System.out.println("\n===== WEEKLY SALES REPORT =====");

        // Print each day's report.
        for (int j = 0; j < reports.length; j++) {
            if (reports[j] != null) {
                System.out.println(reports[j].toString());
            }
        }

        // Print the weekly statistics.
        System.out.printf("Total sales: $%.2f%n",
            totalSales(dailySales));

        System.out.printf("Average daily sales: $%.2f%n",
            averageSales(dailySales));
        System.out.printf("Best day's sales: $%.2f%n",
            bestDaySales(dailySales));

        System.out.println("Reports created: "
            + DayReport.getReportsCreated());
        System.out.println("You have have $" + money + " in total.");
        double profit = money - 100;
        profit = Math.round(profit * 100.0) / 100.0; //eliminate floating point error
        System.out.println("You have made $" + profit + " in profit.");
        System.out.println("Thank you for using the Cafe program!");
    }


    /** Calculates the total sales across all days. */
    public static double totalSales(double[] sales) {
        double total = 0;
        for (double amount : sales) {
            total += amount;
        }
        return total;
    }

    /** Calculates the average sales per day. */
    public static double averageSales(double[] sales) {
        if (sales.length == 0) {
            return 0;
        }
        return totalSales(sales) / sales.length;
    }

    /** Finds the greatest daily sales value. */
    public static double bestDaySales(double[] sales) {
        if (sales.length == 0) {
            return 0;
        }

        double highest = sales[0];
        for (int i = 1; i < sales.length; i++) {
            if (sales[i] > highest) {
                highest = sales[i];
            }
        }
        return highest;
    }
}


