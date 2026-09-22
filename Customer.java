public class Customer {
    private String name;
    private String order1;
    private String order2;
    private String order3;
    private String order4;

    public Customer(String order1) { //if the customer only has one order runs this cunstructor
        int num = (int)(Math.random()*100); //generates random number 1-100 to determine which name the customer is given through a group of 10 names
        if (num < 10){
            this.name = "Asuna Y";
        }
        else if (num < 20){
            this.name = "Kazuto K";
        }
        else if (num < 30){
            this.name = "Sinon A";
        }
        else if (num < 40){
            this.name = "Lena M";
        }
        else if (num < 50){
            this.name = "Shin N";
        }
        else if (num < 60){
            this.name = "Anju E";
        }
        else if (num < 70){
            this.name = "Ruby H";
        }
        else if (num < 80){
            this.name = "Jacob D";
        }
        else if (num < 90){
            this.name = "Ai H";
        }
        else{
            this.name = "Akane K";
        }
        this.order1 = order1;
    }
    public Customer(String order1, String order2) { //runs this constructor as overflow if the customer has 2 orders
        int num = (int)(Math.random()*100);
        if (num < 10){
            this.name = "Asuna Y";
        }
        else if (num < 20){
            this.name = "Kana A";
        }
        else if (num < 30){
            this.name = "Sinon A";
        }
        else if (num < 40){
            this.name = "Lena M";
        }
        else if (num < 50){
            this.name = "Shin N";
        }
        else if (num < 60){
            this.name = "Aqua H";
        }
        else if (num < 70){
            this.name = "Ruby H";
        }
        else if (num < 80){
            this.name = "Jacob D";
        }
        else if (num < 90){
            this.name = "Ai H";
        }
        else{
            this.name = "Akane K";
        }
        this.order1 = order1;
        this.order2 = order2;
    }
    public Customer(String order1, String order2, String order3) { //runs this constructor as overflow if the customer has 3 orders
        int num = (int)(Math.random()*100);
        if (num < 10){
            this.name = "Asuna Y";
        }
        else if (num < 20){
            this.name = "Kazuto K";
        }
        else if (num < 30){
            this.name = "Sinon A";
        }
        else if (num < 40){
            this.name = "Lena M";
        }
        else if (num < 50){
            this.name = "Raiden S";
        }
        else if (num < 60){
            this.name = "Anju E";
        }
        else if (num < 70){
            this.name = "Ruby H";
        }
        else if (num < 80){
            this.name = "Jacob D";
        }
        else if (num < 90){
            this.name = "Akame M";
        }
        else{
            this.name = "Akane K";
        }
        this.order1 = order1;
        this.order2 = order2;
        this.order3 = order3;
    }
    public Customer(String order1, String order2, String order3, String order4) { //runs this constructor as overflow if the customer has 4 orders
        int num = (int)(Math.random()*100);
        if (num < 10){
            this.name = "Asuna Y";
        }
        else if (num < 20){
            this.name = "Kazuto K";
        }
        else if (num < 30){
            this.name = "Sinon A";
        }
        else if (num < 40){
            this.name = "Lena M";
        }
        else if (num < 50){
            this.name = "Shin N";
        }
        else if (num < 60){
            this.name = "Alice Z";
        }
        else if (num < 70){
            this.name = "Ruby H";
        }
        else if (num < 80){
            this.name = "Jacob D";
        }
        else if (num < 90){
            this.name = "Ado G";
        }
        else{
            this.name = "Akane K";
        }
        this.order1 = order1;
        this.order2 = order2;
        this.order3 = order3;
        this.order4 = order4;
    }   

    public String getName() { //method to get the customer name
        return name;
    }

    public String getOrder() { //method to get the first order of the customer
        return order1;
    }

    public void setOrder(String order1) { //method to set the first order
        this.order1 = order1;
    }

    public String getOrder2() { //gets order 2
        return order2;
    }

    public String getOrder3() { //gets order 3
        return order3;
    }

    public String getOrder4() { //gets order 4
        return order4; 
    }
    public void setOrder2(String order2) { //sets order 2
        this.order2 = order2;
    }

    public void setOrder3(String order3) { //sets order 3
        this.order3 = order3;
    }

    public void setOrder4(String order4) { //sets order 4
        this.order4 = order4;
    }

}
