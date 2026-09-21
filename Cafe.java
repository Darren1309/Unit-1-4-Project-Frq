import java.util.Scanner;

public class Cafe{
    public static void main(String[] args){
        Scanner i = new Scanner(System.in);
        System.out.println("Welcome to your Cafe!");
        System.out.println("Please enter the name for your Cafe: ");
        String cafeName = i.nextLine();
        System.out.println("Welcome to the " + cafeName + " Cafe! The goal is to make as much money as possible in 7 days. \nYou will start with $100.00 and you will have to buy ingredients for your Cafe. \nYou will then have to serve customers and make money. Good luck!");
        orderFood coffee = new orderFood("Coffee", 6.50);
        orderFood muffin = new orderFood("Muffin", 7.00);
        orderFood sandwich = new orderFood("Sandwich", 9.00);
        orderFood pancake = new orderFood("Pancake", 12.00);
        orderFood bagel = new orderFood("Bagel", 5.00);
        orderFood breakfastBurrito = new orderFood("Breakfast Burrito", 15.00);
        orderFood waffle = new orderFood("Waffle", 6.50);
        orderFood friedEgg = new orderFood("Fried Egg", 4.50);
        orderFood sausage = new orderFood("Sausage", 4.00);
        orderFood hashbrowns = new orderFood("Hashbrowns", 3.00);
        orderFood toast = new orderFood("Toast", 3.00);
        double money = 100;
        int days = 0;

        while(days < 7){
            System.out.println("Welcome to Day " + (days + 1) + " of 7!");
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
            while(true){
                System.out.println("Type the number for the ingredient you would like to add to your stock, or type 'exit' to exit the program.");
                String input = i.nextLine();
                
                System.out.println("Type the number for the ingredient you would like to add to your stock, or type 'exit' to exit the program.");
                if (input.equals("exit")){
                    System.out.println("Thank you for using the Cafe program!");
                    break;
                }
                else if (input.equals("1")){
                    if (money < 2.00){
                        System.out.println("You do not have enough money to buy Coffee Beans.");
                        continue;
                    }
                    orderFood.coffeeBeans++;
                    money -= 2.00;
                    System.out.println("You have added 1 Coffee Bean to your stock.");
                }
                else if (input.equals("2")){
                    if (money < 1.00){
                        System.out.println("You do not have enough money to buy Milk.");
                        continue;
                    }
                    orderFood.milk++;
                    money -= 1.00;
                    System.out.println("You have added 1 Milk to your stock.");
                }
                else if (input.equals("3")){
                    if (money < 3.00){
                        System.out.println("You do not have enough money to buy Muffins.");
                        continue;
                    }
                    orderFood.muffins++;
                    money -= 3.00;
                    System.out.println("You have added 1 Muffin to your stock.");
                }
                else if (input.equals("4")){
                    if (money < 5.00){
                        System.out.println("You do not have enough money to buy Turkey.");
                        continue;
                    }
                    orderFood.turkey += 8;
                    money -= 5.00;
                    System.out.println("You have added 8 Turkey to your stock.");
                }
                else if (input.equals("5")){
                    if (money < 1.00){
                        System.out.println("You do not have enough money to buy Tomatoes.");
                        continue;
                    }
                    orderFood.tomatoes++;
                    money -= 1.00;
                    System.out.println("You have added 1 Tomato to your stock.");
                }
                else if (input.equals("6")){
                    if (money < 1.00){
                        System.out.println("You do not have enough money to buy Lettuce.");
                        continue;
                    }
                    orderFood.lettuce++;
                    money -= 1.00;
                    System.out.println("You have added 1 Lettuce to your stock.");
                }
                else if (input.equals("7")){
                    if (money < 2.50){
                        System.out.println("You do not have enough money to buy Bread.");
                        continue;
                    }
                    orderFood.bread += 20;
                    money -= 2.50;
                    System.out.println("You have added 20 Bread to your stock.");
                }
                else if (input.equals("8")){
                    if (money < 4.00){
                        System.out.println("You do not have enough money to buy Pancakes.");
                        continue;
                    }
                    orderFood.pancakes++;
                    money -= 4.00;
                    System.out.println("You have added 1 Pancake to your stock.");
                }
                else if (input.equals("9")){
                    if (money < 4.50){
                        System.out.println("You do not have enough money to buy Waffles.");
                        continue;
                    }
                    orderFood.waffles++;
                    money -= 4.50;
                    System.out.println("You have added 1 Waffle to your stock.");
                }
                else if (input.equals("10")){
                    if (money < 3.50){
                        System.out.println("You do not have enough money to buy Tortillas.");
                        continue;
                    }
                    orderFood.tortillas += 10;
                    money -= 3.50;
                    System.out.println("You have added 10 Tortillas to your stock.");
                }
                else if (input.equals("11")){
                    if (money < 2.00){
                        System.out.println("You do not have enough money to buy Sausage.");
                        continue;
                    }
                    orderFood.sausage++;
                    money -= 2.00;
                    System.out.println("You have added 1 Sausage to your stock.");
                }
                else if (input.equals("12")){
                    if (money < 1.50){
                        System.out.println("You do not have enough money to buy Potatoes.");
                        continue;
                    }
                    orderFood.potatoes++;
                    money -= 1.50;
                    System.out.println("You have added 1 Potato to your stock.");
                }
                else if (input.equals("13")){
                    if (money < 2.50){
                        System.out.println("You do not have enough money to buy Cheese.");
                        continue;
                    }
                    orderFood.cheese++;
                    money -= 2.50;
                    System.out.println("You have added 1 Cheese to your stock.");
                }
                else if (input.equals("14")){
                    if (money < 3.30){
                        System.out.println("You do not have enough money to buy Eggs.");
                        continue;
                    }
                    orderFood.eggs += 12;
                    money -= 3.30;
                    System.out.println("You have added 12 Eggs to your stock.");
                }
                else if (input.equals("15")){
                    if (money < 9.00){
                        System.out.println("You do not have enough money to buy Bagels.");
                        continue;
                    }
                    orderFood.bagels += 12;
                    money -= 9.00;
                    System.out.println("You have added 12 Bagels to your stock.");
                }
                else{
                    System.out.println("Invalid input. Please try again.");
                }
                System.out.println("You have $" + money + " left.");
            }
            System.out.println("Ready to start the day!");
            int numCustomers = (int)(Math.random()*15)+7;
            while(numCustomers > 0){
                boolean hasItem = true;
                double price = 0;
                int orderAmount = (int)(Math.random()*4)+1;
                int order1 = (int)(Math.random()*11)+1;
                int order2 = (int)(Math.random()*11)+1;
                int order3 = (int)(Math.random()*11)+1;
                int order4 = (int)(Math.random()*11)+1;
                String order = "";
                if (orderAmount == 1 || orderAmount == 2 || orderAmount == 3 || orderAmount == 4){
                    if (order1 == 1 && orderFood.coffeeBeans > 0 && orderFood.milk > 0){
                        order += "Coffee";
                        orderFood.coffeeBeans--;
                        orderFood.milk--;
                        price = coffee.getPrice();
                    }
                    else if (order1 == 2 && orderFood.muffins > 0){
                        orderFood.muffins--;
                        order += "Muffin";
                        price = muffin.getPrice();
                    }
                    else if (order1 == 3 && orderFood.turkey > 0 && orderFood.tomatoes > 0 && orderFood.lettuce > 0 && orderFood.bread > 0){
                        orderFood.turkey--;
                        orderFood.tomatoes--;
                        orderFood.lettuce--;
                        orderFood.bread--;
                        order += "Sandwich";
                        price = sandwich.getPrice();
                    }
                    else if (order1 == 4 && orderFood.pancakes > 0){
                        orderFood.pancakes--;
                        order += "Pancakes";
                        price = pancake.getPrice();
                    }
                    else if (order1 == 5 && orderFood.waffles > 0){
                        orderFood.waffles--;
                        order += "Waffles";
                        price = waffle.getPrice();
                    }
                    else if (order1 == 6 && orderFood.tortillas > 0 && orderFood.sausage > 0 && orderFood.potatoes > 0 && orderFood.cheese > 0 && orderFood.eggs > 0){
                        orderFood.tortillas--;
                        orderFood.sausage--;
                        orderFood.potatoes--;
                        orderFood.cheese--;
                        orderFood.eggs--;
                        order += "Breakfast Burrito";
                        price = breakfastBurrito.getPrice();
                    }
                    else if (order1 == 7 && orderFood.bagels > 0){
                        orderFood.bagels--;
                        order += "Bagel";
                        price = bagel.getPrice();
                    }
                    else{           
                        hasItem = false;
                    }
                    Customer customer = new Customer(order);
                    System.out.println(customer.getName() + " has ordered a " + customer.getOrder() + ".");
                    if (!hasItem){
                        System.out.println("Sorry, we are out of that item.");
                    }
                    else{
                        money += price;
                    }
                }
                else if (orderAmount == 2 || orderAmount == 3 || orderAmount == 4){
                    if (order2 == 1 && orderFood.coffeeBeans > 0 && orderFood.milk > 0){
                        orderFood.coffeeBeans--;
                        orderFood.milk--;
                    }
                    else if (order2 == 2 && orderFood.muffins > 0){
                        orderFood.muffins--;
                    }
                    else if (order2 == 3 && orderFood.turkey > 0 && orderFood.tomatoes > 0 && orderFood.lettuce > 0 && orderFood.bread > 0){
                        orderFood.turkey--;
                        orderFood.tomatoes--;
                        orderFood.lettuce--;
                        orderFood.bread--;
                    }
                    else if (order2 == 4 && orderFood.pancakes > 0){
                        orderFood.pancakes--;
                    }
                    else if (order2 == 5 && orderFood.waffles > 0){
                        orderFood.waffles--;
                    }
                    else if (order2 == 6 && orderFood.tortillas > 0 && orderFood.sausage > 0 && orderFood.potatoes > 0 && orderFood.cheese > 0 && orderFood.eggs > 0){
                        orderFood.tortillas--;
                        orderFood.sausage--;
                        orderFood.potatoes--;
                        orderFood.cheese--;
                        orderFood.eggs--;
                    }
                    else if (order2 == 7 && orderFood.bagels > 0){
                        orderFood.bagels--;
                    }
                    else{
                        System.out.println("Sorry, we are out of that item.");
                        hasItem = false;
                    }
                    Customer customer = new Customer(order, order);
                    System.out.println(customer.getName() + " has ordered a " + customer.getOrder() + " and a " + customer.getOrder2() + ".");
                    if (!hasItem){
                        System.out.println("Sorry, we are out of that item.");
                    }
                    else{
                        money += price;
                    }
                }
                else if (orderAmount == 3 || orderAmount == 4){
                    if (order3 == 1 && orderFood.coffeeBeans > 0 && orderFood.milk > 0){
                        orderFood.coffeeBeans--;
                        orderFood.milk--;
                    }
                    else if (order3 == 2 && orderFood.muffins > 0){
                        orderFood.muffins--;
                    }
                    else if (order3 == 3 && orderFood.turkey > 0 && orderFood.tomatoes > 0 && orderFood.lettuce > 0 && orderFood.bread > 0){
                        orderFood.turkey--;
                        orderFood.tomatoes--;
                        orderFood.lettuce--;
                        orderFood.bread--;
                    }
                    else if (order3 == 4 && orderFood.pancakes > 0){
                        orderFood.pancakes--;
                    }
                    else if (order3 == 5 && orderFood.waffles > 0){
                        orderFood.waffles--;
                    }
                    else if (order3 == 6 && orderFood.tortillas > 0 && orderFood.sausage > 0 && orderFood.potatoes > 0 && orderFood.cheese > 0 && orderFood.eggs > 0){
                        orderFood.tortillas--;
                        orderFood.sausage--;
                        orderFood.potatoes--;
                        orderFood.cheese--;
                        orderFood.eggs--;
                    }
                    else if (order3 == 7 && orderFood.bagels > 0){
                        orderFood.bagels--;
                    }
                    else{
                        System.out.println("Sorry, we are out of that item.");
                        hasItem = false;
                    }
                    Customer customer = new Customer(order, order, order);
                    System.out.println(customer.getName() + " has ordered a " + customer.getOrder() + ", a " + customer.getOrder2() + ", and a " + customer.getOrder3() + ".");
                    if (!hasItem){
                        System.out.println("Sorry, we are out of that item.");
                    }
                    else{
                        money += price;
                    }
                }
                else{
                    if (order4 == 1 && orderFood.coffeeBeans > 0 && orderFood.milk > 0){
                        orderFood.coffeeBeans--;
                        orderFood.milk--;
                    }
                    else if (order4 == 2 && orderFood.muffins > 0){
                        orderFood.muffins--;
                    }
                    else if (order4 == 3 && orderFood.turkey > 0 && orderFood.tomatoes > 0 && orderFood.lettuce > 0 && orderFood.bread > 0){
                        orderFood.turkey--;
                        orderFood.tomatoes--;
                        orderFood.lettuce--;
                        orderFood.bread--;
                    }
                    else if (order4 == 4 && orderFood.pancakes > 0){
                        orderFood.pancakes--;
                    }
                    else if (order4 == 5 && orderFood.waffles > 0){
                        orderFood.waffles--;
                    }
                    else if (order4 == 6 && orderFood.tortillas > 0 && orderFood.sausage > 0 && orderFood.potatoes > 0 && orderFood.cheese > 0 && orderFood.eggs > 0){
                        orderFood.tortillas--;
                        orderFood.sausage--;
                        orderFood.potatoes--;
                        orderFood.cheese--;
                        orderFood.eggs--;
                    }
                    else if (order4 == 7 && orderFood.bagels > 0){
                        orderFood.bagels--;
                    }
                    else{
                        System.out.println("Sorry, we are out of that item.");
                        hasItem = false;
                    }
                    Customer customer = new Customer(order, order, order, order);
                    System.out.println(customer.getName() + " has ordered a " + customer.getOrder() + ", a " + customer.getOrder2() + ", a " + customer.getOrder3() + ", and a " + customer.getOrder4() + ".");
                    if (!hasItem){
                        System.out.println("Sorry, we are out of that item.");
                    }
                    else{
                        money += price;
                    }
                    
                }
                numCustomers--;
                System.out.println("Number of customers remaining: " + numCustomers);
                System.out.println("You have $" + money + " left.");
            }
            days++;


        }
        System.out.println("You have completed 7 days of running your Cafe!");
        System.out.println("You have made $" + money + " in total.");
        System.out.println("Thank you for using the Cafe program!");

    }
    
    }

