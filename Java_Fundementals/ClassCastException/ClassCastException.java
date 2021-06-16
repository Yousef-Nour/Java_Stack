import java.util.*;
public class ClassCastException{
    public static void main (String[] args){
        ArrayList<Object> myList = new ArrayList<Object>();
        myList.add("13");
        myList.add("hello world");
        myList.add(48);
        myList.add("Goodbye World");
        try{
            for(Object value : myList){
            System.out.println((Integer) value);
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
            System.out.println("This exiption has occured because that is falt in casting !");


        }

        
        System.out.println("every thing is okay");
    }
}