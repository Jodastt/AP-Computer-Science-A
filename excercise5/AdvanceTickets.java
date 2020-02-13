//Joseph Stowell
import java.lang.Math;

public class AdvanceTickets extends Ticket{
        super((int) Math.random() * 10, thePrice);
        public AdvanceTickets(int days){
        int thePrice = -1;
        if(days > 9){
            thePrice = 30;
        } else {
            thePrice = 40;
        }
    }
}
