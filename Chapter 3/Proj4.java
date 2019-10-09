import static java.lang.Math.sqrt; 
import static java.lang.Math.acos; 
import static java.lang.Math.pow;
import static java.lang.Math.PI;

class Proj4 {
  public static void main(String[] args) {

    anglesFinder(3, 4, 5);
  
  }

  public static void anglesFinder(int a, int b, int c) {

    double alpha;
    double beta;
    double gamma;
    alpha = (double) Math.acos((Math.pow(b, 2) + Math.pow(c, 2) - Math.pow(a, 2)) / (2 * c * b));
    beta = (double) Math.acos((Math.pow(a, 2) + Math.pow(c, 2) - Math.pow(b, 2)) / (2 * a * c));
    gamma = (double) Math.acos((Math.pow(a, 2) + Math.pow(b, 2) - Math.pow(c, 2)) / (2 * a * b)); 
    System.out.println("angle between a & b is: " + (beta * (180 / Math.PI)));
    System.out.println("angle between a & c is: " + (alpha * (180 / Math.PI)));
    System.out.println("angle between b & c is: " + (gamma * (180 / Math.PI)));
  }
}
