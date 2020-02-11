//Joseph Stowell
import java.lang.Math;
import java.io.*;
import java.util.*;

public class Polyhedron extends Polygon {
  private int sides;
  private int side_lengths;
  private int faces;
  public Polygon(int sides, int side_lengths){
    if(sides < 3 || side_lengths <= 0){
      throw new Exception("This is degenerate you degenerate");
    }
    this.faces = sides;
    this.sides = sides;
    this.side_lengths = side_lengths;
  }
}
  public Polyhedron(){
    this.side_lengths = 1;
    this.sides = 3;
    this.faces = 3;
  }
    public double getFaces(){
      return this.sides;
    }
    public double getVolume(){
    //only works for regular polyhedra, other types are far more complicated
      double lambda = (Math.sin((1 - (2 / this.faces))*Math.PI / this.sides)) * (1 / Math.sqrt((Math.sin(Math.PI / this.sides) * Math.sin(Math.PI / this.sides) - (Math.sin((1 - (2 / this.faces))*Math.PI / this.sides))*Math.sin((1 - (2 / this.faces))*Math.PI / this.sides))));

      double volumePre = (this.faces * this.sides * super.getRadius() * super.getRadius() * super.getRadius() * lambda * Math.tan(Math.PI / this.sides))/(1 + (lambda * lambda) + (Math.tan(Math.PI / this.sides))*(Math.tan(Math.PI / this.sides)));
      return Math.sqrt(volumePre*volumePre*volumePre);
    }
}
