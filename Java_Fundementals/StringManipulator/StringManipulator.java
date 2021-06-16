public class StringManipulator{
    public String trimAndConcat(String word1, String word2){
        // String firstWord = word1.trim();
        // String secondWord = word2.trim();
        // String wholeWord = firstWord.concat(secondWord);
        // return wholeWord;
        return word1.trim()+word2.trim();
    }
    public int getIndexOrNull(String word, char letter){

        return word.indexOf(letter);
    }

    public int getIndexOrNull(String word, String subString){

        return word.indexOf(subString);
    }
    public String concatSubstring(String word1, int start, int end, String word2){
        return word1.substring(start,end)+" "+word2;     //substring is builtin method // ممكن اعملهم بأكثر من سطر
    }
}