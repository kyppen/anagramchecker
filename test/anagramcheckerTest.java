import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

import static org.junit.Assert.assertEquals;

public class anagramcheckerTest {

    ArrayList<String> listOfWords = new ArrayList<>();
    String[] words = {"eat", "tea", "hat"};

    @Test
    void testingtest(){
        fillarrayList();
        printArrayList();
        anagramchecker check = new anagramchecker();
        check.anagramcheck(listOfWords);
        HashMap<String, ArrayList<String>> myHashMap = new HashMap<>();

    }

    public void fillarrayList(){
        Collections.addAll(listOfWords, words);
    }
    public void printArrayList(){
        for (String word : listOfWords) {
            System.out.println(word);
        }
    }

}
