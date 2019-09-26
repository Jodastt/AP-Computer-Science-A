public class Ch2Proj1 {
    public static void main(String[] args) {

      starsLines();

    }

    public static void starsLines() {
        int a = 6;
        int b = 6;
        int c = 12;
        int d = 0;
        int nbsp = 1;
        int nbsp2 = 1;
        
        for(int i=0; i<6; i++) {

            for (int ii = 1; ii<=a; ii++) {
                System.out.print("*"); 
            }
            a -= 1;
            
            for (int iii=1; iii<=nbsp; iii++) {
                System.out.print(" ");
            }
            nbsp += 1;
            
            for (int iiii=1;iiii<=c; iiii++) {
                System.out.print("/");

            }
            c -= 1;
            
            
 
            for (int iiiii=1; iiiii<=d; iiiii++) {
                System.out.print("\\");
            }
            d += 1;
            
            for (int iiiiii=1; iiiiii<=nbsp2; iiiiii++) {
                System.out.print(" ");
            }
            nbsp2 += 1;
            
            for (int iiiiiii = 1; iiiiiii<=b; iiiiiii++) {
                System.out.print("*"); 
            }
            b -= 1;

            System.out.println();
        }
    }
}
