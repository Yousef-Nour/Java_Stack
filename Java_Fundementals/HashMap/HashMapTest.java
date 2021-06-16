import java.util.*;
public class HashMapTest{
    public static void main(String[] args){
        HashMap<String,String> trackList = new HashMap <String, String>();
        trackList.put("Hello", "Hello it is me");
        trackList.put("InAn", "InAn Qad Ana Awanoh");
        trackList.put("Berlin", "A7la mn Berlin");
        trackList.put("Donia", "Donia Dawara");
        System.out.println(trackList.get("Donia"));
        System.out.println("____________________________");
        // for (String i : trackList.keySet()){ //i is the key 
        //    // System.out.println(trackList.get(i));
        //     System.out.println(i);

        // }
        for (String songKey : trackList.keySet()){
            System.out.println("The songs name are "+ songKey + "and the Lyricses are " + trackList.get(songKey));
        }
    }
}