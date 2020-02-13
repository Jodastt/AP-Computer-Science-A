public class Ticket {
    private int number;
    private int price;
    public Ticket(int number, int price){
        this.number = number;
        this.price = price;
    }
    public int getPrice(){
        return price;
    }
    public void printTicket(){
        System.out.println("Number: " + number + ", Price: $" + price);
    }
}
