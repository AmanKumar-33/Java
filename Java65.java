import java.util.*;
class Box {
 private double length;
 private double breath;
 private double height;
 
 
 //constructor used when all dimension are used
 Box(double l, double b, double h ){
   length = l;
   breath = b;
   height = h;
   }
   //compute the volune of box
   double Volume(){
    return length*breath*height;
    }
}

//Add weight to the box
class BoxWeight extends Box{
  double weight;
   //constructor when all the thing are specified
   BoxWeight(double l, double b, double h,double w){
      super(l,b,h); //calling the super class constructor
      weight = w;
      }
 }
 
 
 //Adding the sipping cost
 class Shipping extends BoxWeight{
   double cost;
   //calling the super constructr for all thing mentioned
   Shipping(double l, double b, double h,double w,double c){
       super(l,b,h,w); //call the super class constructor
       cost = c;
       
      }
 }
 
 public class Java65{
   public static void main(String args[]){
     Shipping s1 = new Shipping(10,20,30,40,2.34);
     Shipping s2 = new Shipping(20,40,60,80,4.68);
     double vol;
     vol = s1.Volume();
     System.out.println("volume of the shipment is: $" + vol);
     System.out.println("cost of the shipmentv is: $" +s1.cost);
     System.out.println("weight of the shipment is: $" +s1.weight); 
     
     vol = s2.Volume();
     System.out.println("volume of the shipment is: $" + vol);
     System.out.println("cost of the shipmentv is: $" +s2.cost);
     System.out.println("weight of the shipment is: $" +s2.weight); 
     
     
   }
 }
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
      
    
   
