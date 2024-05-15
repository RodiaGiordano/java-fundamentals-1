package snack.bonus2;

import java.util.Scanner;

public class Bonus2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Scegli un carattere: ");
        String characterUser = scanner.nextLine();

        char character = characterUser.charAt(0);

        // System.out.println(character);
        String stringToCheck = "aaabbbsssfnncwiwiaa";

        String sequence = "";

        String longerSequence = "";

        int index = 0;

        for (int i = 0; i < stringToCheck.length(); i++) {

            if (character == stringToCheck.charAt(i)) {
                sequence += character;
                if(sequence.length() > longerSequence.length()) {
                    longerSequence = sequence;
                    index = i - longerSequence.length() +1;
                }else if(sequence.length() == longerSequence.length()){
                    index = i - longerSequence.length() +1;
                }
            }else{
                sequence = "";
            }
        }
        System.out.println(longerSequence);
        System.out.println(index);
    }
}






