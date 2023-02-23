public class Circle extends Geometry{
  public double r;
  public circle(){
    r=1.0;
    }
  public Circle (double r){
     this.r = r;
     }
  public double area(){
    return PI*r*r;
  }
  public double Circumference(){
     return 2*PI*r;
     }
     
  public double GetRadius(){
      return r;
      
      }
}
