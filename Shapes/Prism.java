//Joseph Stowell
import java.lang.Math;
import java.io.*;
import java.util.*;

public class Prism extends Polygon {
  private int sides;
  private int depth;
  private int side_lengths;
  public Polygon(int depth, int sides, int side_lengths){
    if(sides < 3 || side_lengths <= 0 || depth <= 0){
      throw new Exception("This is degenerate you degenerate");
    }
    this.sides = sides;
    this.side_lengths = side_lengths;
    this.depth = depth;
  }
}
  public Shapes(){
    this.side_lengths = 1;
    this.sides = 3;
    this.depth = 1;
  }
    public double getSurfaceArea(){
      return (super.getArea() * 2) + (this.sides * this.depth * this.side_lengths);
    }
    public double getVolume(){
      return this.depth * (this.side_lengths * this.side_lengths * this.sides) / (4 * Math.tan(180 / this.sides));
    }
}
