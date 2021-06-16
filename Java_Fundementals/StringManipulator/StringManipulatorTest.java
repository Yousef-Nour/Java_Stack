public class StringManipulatorTest{
    public static void main(String[] args){
        StringManipulator sm = new StringManipulator(); //reseve place in memory
        // String word1 = "Yousef";
        // String word2 = "Nour";
        // sm.trimAndConcat(word1,word2);
        // System.out.println(sm.trimAndConcat(word1,word2));

        // System.out.println(sm.getIndexOrNull("Yousef",'o'));

        // int answer = sm.getIndexOrNull("Yousef",'o');
        // if (answer == -1)
        //     return null;
        // else return answer;
        

        // System.out.println(sm.getIndexOrNull("YOUSEF", "OU"));
        System.out.println(sm.concatSubstring("Yousef",1,3,"Nour"));

    }
}