import java.lang.*;   //default libraly from Java
public class Pythagorean {
    public static double calculateHypotenuse(int legA, int legB) {
        // the hypotenuse is the side across from the right angle. 
        // calculate the value of c given legA and legB
        double c =Math.sqrt(Math.pow(legA,2) + Math.pow(legB,2)) ;
        return c;
        
    }
    // public static void main(String[] args) {    //we can solve without another file
    //     System.out.println("Hello World");
    //     calculateHypotenuse(2,3);
    // }
}
