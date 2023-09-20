package Week1;

import java.util.Scanner;

public class AgeCheck {
    public static void main(String[] args) {
        Scanner ageInput = new Scanner(System.in);
        System.out.println("How old are you?");
        String ageString = ageInput.nextLine();
        int age = Integer.parseInt(ageString);
        if (age > 0 && age < 120) {
            System.out.println("Ok :)");
        }
        else {
            System.out.println("Impossible! :o");
        }
    }
}
