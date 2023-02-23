import java.util.*;
  class Point2D{
   int x;
   int y;
   void display(){
     System.out.println("x and y is:" +x +"&" +y);
    }
  }
  class Point3D extends Point2D{
   int z;
   
   void display(){
     System.out.println("x and y is:" +x +"&" +y);
    }
  }
 
public class SimpleSingleInheritance{
 public static void main(String args[]){
  Point2D = new P1();
  Point3D = new P2();
  P1.x = 10;
  P1.y = 20;
  System.out.println("point2D display" +p1.display());
//  p2.x = 5;
//  p2.y = 6;
  //p2.z = 7;
  //System.out.println("point3D in p2 is :" +p2.display());
  }
}
