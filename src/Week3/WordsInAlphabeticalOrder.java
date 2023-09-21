package Week3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordsInAlphabeticalOrder {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<String>();
        String newWord;
        Scanner reader = new Scanner(System.in);

        while (true) {
            System.out.println("Type a word: ");
            newWord = reader.nextLine();

            if (newWord.isEmpty()) {
                break;
            } else {
                words.add(newWord);
                Collections.sort(words);
            }
        }

        System.out.println("You typed the following words: ");
        for (String word : words) {
            System.out.println(word);
        }
    }
}
