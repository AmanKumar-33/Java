import java.util.*;
 class Box{
   double width;
   double heigth;
   double length;
   
   
   Box(){                //default setting by constructor
    width = 0.0;
    heigth = 0.0;
    length = 0.0;
    }
    
    Box(double w, double h, double l){     //parametrize constructor
      width = w;
    heigth = h;
    length = l;
      }
      
   double volume(){
    return width*heigth*length;
    }
 }
 
 class BoxWeigth extends BOX{
   double weigth;
   
   BoxWeigth(double w, double h, double l, double m){
     width = w;
    heigth = h;
    length = l;
    weigth = m;
    }
 }
     
 
public class Java62{
 public static void main(String args[]){
    Box mybox1 = new Box();
    BoxWeigth mybox2 = new BoxWeigth(2,3,4,5);
     double vol;
     vol = mybox1.volume();
     System.out.println("volume of the box is :" + vol);
     System.out.println("\n \n ");
     
     vol = mybox2.volume();
     
     System.out.println("volume of the boxweigth is :" +vol);
     System.out.println("weigth of the Boxweigth is :" +mybox2.weigth);
  }
}
     
  
  
  
  
  
  
  
  
  
    
