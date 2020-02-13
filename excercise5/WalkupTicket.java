//Joseph Stowell
import java.lang.Math;

public class WalkupTicket extends Ticket {
    private int number;
    private int price;
    public WalkupTicket(){
        super((int) Math.random() * 10, 50);
    }
    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public void printTicket() {
        super.printTicket();
    }
}
