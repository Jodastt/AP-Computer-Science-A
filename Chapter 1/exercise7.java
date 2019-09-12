/*
 Joseph Stowell
 AP Comp Sci unit 1 exercise 7
 */public class exercise7 {
    
    public static void main(String[] args) {
    
        forward();
        block();
        block();
        block();
        block();
    }
    
    public static void block() {
    
        text();
        back();
    
    }
    
    public static void forward() {
        
        System.out.println("//////////////////////");
        
    }
    
    public static void text() {
        
        System.out.println("|| Victory is mine! ||");
        
    }
    
    public static void back() {
        
        System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
        
    }
    
}
