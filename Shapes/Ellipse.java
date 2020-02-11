//Joseph Stowell
import java.lang.Math;
import java.io.*;
import java.util.*;

public class Ellipse {
    private int rad1;
    private int rad2;
    public Ellipse(int rad1, int rad2){
      this.rad1 = rad1;
      this.rad2 = rad2;
    }
    public Ellipse(){
        this.rad1 = 1;
        this.rad2 = 1;
    }
    public double getCircumference(){
      //Ramanujan approximation
      return (Math.PI * ((3 * (this.rad1 + this.rad2)) - Math.sqrt((3*this.rad1 + this.rad2*(this.rad1 + 3*this.rad2))));
    }
    public double getArea(){
      return Math.PI * this.rad1 * this.rad2;
      }
  }
