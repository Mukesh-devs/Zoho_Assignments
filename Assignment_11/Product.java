abstract class Product{
    abstract String getPrice();
    abstract String getDescription();
    abstract String getDemandRating();
}

class Biscuit extends Product{
    int price;
    String description;
    int demandRating;
    int numberOfBiscuits;

    public Biscuit(int price, String description, int demandRating, int numberOfBiscuits) {
        this.price = price;
        this.description = description;
        this.demandRating = demandRating;
        this.numberOfBiscuits = numberOfBiscuits;
    }

    public String getPrice(){
        return "The price of the biscuit is: "+ this.price;
    }

    public String getDescription(){
        return this.description;
    }

    public String getDemandRating(){
        return "The product has a demand rating of "+ this.demandRating+" out of 5 in the market";
    }
    public String getNumberOfBiscuits(){
        return "This Biscuit comes with "+ this.numberOfBiscuits+ " biscuits in a packet";
    }
}

class Chocolate extends Product{
    int price;
    String description;
    int demandRating;
    int quantity;

    public Chocolate(int price, String description, int demandRating, int quantity) {
        this.price = price;
        this.description = description;
        this.demandRating = demandRating;
        this.quantity = quantity;
    }

    public String getPrice(){
        return "The price of the Chocolate  is: "+ this.price;
    }

    public String getDescription(){
        return this.description;
    }

    public String getDemandRating(){
        return "The product has a demand rating of "+ this.demandRating+" out of 5 in the market";
    }
    public String getQuantity(){
        return "This Chocolate comes with "+ this.quantity+ "grams in a packet";
    }
}



class Q2 {
    public static void main(String[] args){
        Biscuit goodDay = new Biscuit(10, "This is a 10 ruppee goodday biscuit from britannia", 4, 10);
        System.out.println(goodDay.getPrice());
        System.out.println(goodDay.getDemandRating());
        System.out.println(goodDay.getDescription());
        System.out.println(goodDay.getNumberOfBiscuits());


        System.out.println("----------------------------------------------------------------------------------");

        Chocolate diaryMilk = new Chocolate(150, "This is a 150 ruppee Chocolate from cadbury diary milk", 5, 250);
        System.out.println(diaryMilk.getPrice());
        System.out.println(diaryMilk.getDemandRating());
        System.out.println(diaryMilk.getDescription());
        System.out.println(diaryMilk.getQuantity());
    
    }
}
