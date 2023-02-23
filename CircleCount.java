import java.util.*;
public class CircleCount{
 static int Count = 0; //class variable
 public double x,y,r; //instance variable
 public CircleCount(double x, double y,double r){
  this.x = x; this.y = y; this.r =r;
  }
  public CircleCount(double r){
    this(0.0,0.0,r);
    Count++;
    }
  public CircleCount(double c){
    this(c.x,c.y,c.r);
    Count++;
    }
  public CircleCount(){
    this(0.0,0.0,0.1);
    Count++;
    }
  public double Circumference(){
   return (2*3.14*r);
  }
  public double Area(){
   return (3.14*r*r);
   }
   
 public static void main(String args[]){
  circleCount c1 = new CircleCount();
  System.out.println("c1:-" + c1.count);
  circleCount c2 = new CircleCount();
  System.out.println("c2:-" + c2.count);
  circleCount c3 = new CircleCount();
  System.out.println("c3:-" + c3.count);
  }
}
