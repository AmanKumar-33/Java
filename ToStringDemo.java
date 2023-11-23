// ToString() method is used to get the string representation of the object.
// The toString() method returns the string representation of the object.
// If you print any object, java compiler internally invokes the toString() method on the object.
// So overriding the toString() method, returns the desired output, it can be the state of an object etc.
// By overriding the toString() method of the Object class, we can return values of the object, so we don't need to write much code.
// Signature: public String toString()
// The toString() method returns the string representation of the object.
// If you print any object, java compiler internally invokes the toString() method on the object.
// So overriding the toString() method, returns the desired output, it can be the state of an object etc.
public class ToStringDemo {
    
    public static void main(String[] args) {
        double d = 858.48;
        String s = Double.toString(d);
        
        int dot = s.indexOf('.');
        
        System.out.println(dot + " digits " +
            "before decimal point.");
        System.out.println( (s.length() - dot - 1) +
            " digits after decimal point.");
    }
}