  class Point2D{
   double x, double y;
   Point2D() {x=0.0;y=0.0;}  //default initalisation
   Point2D(float x ,float y)
   {
    this.x = x ; this.y = y;}
  }
  
  class Point3D extends Point2D{
    double z;
    Point3D(){
    super(); z =0.0;}
    Point3D(double x,double y, double z){
     super(x,y);
     this.z = z;
     }
     
  }
  
public class TestCase4{
 public static void main(String args[]){
  Point3D P = new Point3D(2.0, 3.0, 4.0);
  }
}
