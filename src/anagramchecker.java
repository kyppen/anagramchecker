import java.util.HashMap;
import java.util.ArrayList;
import java.util.Collections;

public class anagramchecker {
    public static void main(String[] args) {

    }

    public boolean containsAnagram(){

        return false;
    }

    public HashMap<String, ArrayList<String>> anagramcheck(ArrayList<String> list) {
        ArrayList<String> sortedList = new ArrayList<>();
        HashMap<String, ArrayList<String>> anagramHash = new HashMap<String, ArrayList<String>>();

        for (int i = 0; i < list.size(); i++) {
            sortedList.add(splitWords(list.get(i)));
        }
        for (int i = 0; i < list.size();i++) {
            String word = list.get(i)
            anagramHash.put(word,findAnagram(word, sortedList));
        }
        return anagramHash;
    }
    public ArrayList<String> findAnagram(String word, ArrayList<String> sortedList){
        ArrayList<String> anagramsOfWord = new ArrayList<>();
        for (String e: sortedList){
            if(e.equals(word)){
                anagramsOfWord.add(e);
            }
        }
        return anagramsOfWord;

    }
    public String splitWords(String word){
        ArrayList<String> temp = new ArrayList<>();
        String something[] = word.split("");
        for (String e : something) {
            temp.add(e);
        }
        StringBuilder builder = new StringBuilder("");
        Collections.sort(temp);
        for (String e : temp) {
            builder.append(e);
        }
        return builder.toString();
    }
}
