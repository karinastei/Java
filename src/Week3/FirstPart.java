package Week3;

import java.util.Scanner;

public class FirstPart {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a word: ");
        String word = reader.nextLine();
        System.out.println("Length of the first part: ");
        String length = reader.nextLine();

        System.out.println(word.substring(0, Integer.parseInt(length)));
    }
}
