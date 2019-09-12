/*  Joseph Stowell
*   Unit 1 Project 2
*   Period 3 Sovick AP CS
*/

public class Main {
    
    public static void main(String[] args) {
        
        letter1();
        letter2();
        letter3();
        
    }
    
    public static void letter1(){
        
        letterTemplate("University of Washington", "Joseph Stowell", "I would like to be considered by you for your exceptional Paul Allen School of Computer Science.");
        
    }
    
    public static void letter2(){
        
        letterTemplate("Mr. Chee", "Joseph Stowell", "I would greatly appreciate it if you could write me a letter of reccomendation for the colleges I am applying to.  Thanks!");
        
    }

    public static void letter3(){
        
        letterTemplate("The IRS", "Saul Goodman", "Under the provisions of Public laws 95-109 and 99-361, known collectively as the Fair Debt Collections Practices Act (FDCPA), I formally notify you to cease all communications with me in regard to this debt, or any other debts that you allege I owe.");
        
    }
    
    public static void letterTemplate(String recipient, String from, String myMessage) {
        
        //template that writes boilerplate letter stuff, along with variables to be filled with information
        System.out.println("Dear " + recipient + ",");
        System.out.println(myMessage);
        System.out.println("I appreciate your taking the time to read this letter.  Please reply promptly and enthusiastically.  I would love it if you could reply with a positive result for me if possible as well.");
        System.out.println("Sincerely, " + from + "\n");

    }
    
}
