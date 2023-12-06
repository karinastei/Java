package Week7.Dictionary;

import java.util.ArrayList;
import java.util.HashMap;

public class Dictionary {

    private HashMap<String, String> wordPairs;

    public Dictionary() {
        this.wordPairs = new HashMap<>();
    }

    public String translate(String word) {
        return wordPairs.getOrDefault(word, null);
    }

    public void add(String word, String translation) {
        wordPairs.put(word, translation);
    }

    public int amountOfWords() {
        return wordPairs.size();
    }

    public ArrayList<String> translationList() {
        ArrayList<String> translations = new ArrayList<>();
        for (String key : wordPairs.keySet()) {
            String value = wordPairs.get(key);
            translations.add(key + " = " + value);
        }
        return translations;
    }
}
