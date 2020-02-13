import java.lang.Math;

public class StudentTicket extends Ticket{
        super((int) Math.random() * 10, thePrice);
    public StudentTicket(int days){
        int thePrice = -1;
        if(days > 9){
            thePrice = 40;
        } else {
            thePrice = 10;
        }
    }
}
