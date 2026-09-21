public class Customer {
    private String name;
    private String order1;
    private String order2;
    private String order3;
    private String order4;

    public Customer(String order1) {
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
    public Customer(String order1, String order2) {
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
    public Customer(String order1, String order2, String order3) {
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
    public Customer(String order1, String order2, String order3, String order4) {
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
            this.name = "Aqua H";
        }
        else{
            this.name = "Akane K";
        }
        this.order1 = order1;
        this.order2 = order2;
        this.order3 = order3;
        this.order4 = order4;
    }   

    public String getName() {
        return name;
    }

    public String getOrder() {
        return order1;
    }

    public void setOrder(String order1) {
        this.order1 = order1;
    }

    public String getOrder2() {
        return order2;
    }

    public String getOrder3() {
        return order3;
    }

    public String getOrder4() {
        return order4;
    }
    public void setOrder2(String order2) {
        this.order2 = order2;
    }

    public void setOrder3(String order3) {
        this.order3 = order3;
    }

    public void setOrder4(String order4) {
        this.order4 = order4;
    }

}
