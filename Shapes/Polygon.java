//Joseph Stowell
import java.lang.Math;
import java.io.*;
import java.util.*;

public class Polygon {
  private int sides;
  private int side_lengths;
  public Polygon(int sides, int side_lengths){
    if(sides < 3 || side_lengths <= 0){
      throw new Exception("This is degenerate you degenerate");
    }
    this.sides = sides;
    this.side_lengths = side_lengths;
  }
}
  public Polygon(){
    this.side_lengths = 1;
    this.sides = 3;
  }
  public double getPerimeter(){
    return sides * side_lengths;
  }
  public double getArea(){
    return (this.side_lengths * this.side_lengths * this.sides) / (4 * Math.tan(180 / this.sides));
  }
  public double getRadius(){
    return (this.side_lengths / (2 * Math.sin(180 / this.sides)));
  }
}
