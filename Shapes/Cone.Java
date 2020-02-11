//Joseph Stowell
import java.lang.Math;
import java.io.*;
import java.util.*;

public class Cone extends Ellipse {
    private int rad1;
    private int rad2;
    private int height;
    private int rad3;
    private int rad4;
    public Cone(int rad1, int rad2, int rad3, int rad4, int height){
      //set rad3 and rad4 to zero for cone
      this.rad1 = rad1;
      this.rad2 = rad2;
      this.height = height;
      this.rad3 = rad3;
      this.rad4 = rad4;
    }
    public Cone(){
        this.rad1 = 1;
        this.rad2 = 1;
        this.height = 1;
        this.rad3 = 1;
        this.rad4 = 1;
    }
    public double getSurfaceArea(){
      return (Math.PI * this.rad1 * (this.rad1 + Math.sqrt(this.rad1 * this.rad 2 + this.height * this.height)));
    }
    public double getVolume(){
      return (1 / 3 * Math.PI * this.rad1 * this.rad2);
  }
