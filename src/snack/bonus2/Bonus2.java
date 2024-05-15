package snack.bonus2;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Bonus2 {
    public static void main(String[] args){

        /*
        Data una stringa e un carattere scelto dall'utente, calcolare la
        lunghezza della sequenza più lunga di quel carattere all'interno della
        stringa. Stampare sia la lunghezza trovata, che la posizione (l'indice
        del primo carattere della sequenza) all'interno della stringa.
        ESEMPIO:
        stringa: aaabaabbbbaaaabab  carattere: 'a'    lunghezza massima: 4  indice: 10
        Se esistono due sequenze con la stessa lunghezza massima, restituire i dati relativi all'ultima all'interno della stringa (quella con indice di inizio più alto)
         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Scegli un carattere: ");
        String characterUser = scanner.nextLine();

        char character = characterUser.charAt(0);

        // System.out.println(character);
        String stringToCheck = "aaabaabbbbaaccccccaabab";

        String sequence = "";

        String longerSequence = "";

        int index = 0;

       for(int i = 0; i < stringToCheck.length(); i++){
            if(character == (stringToCheck.charAt(i))) {
                sequence += character;

            }else{
                if(sequence.length() > longerSequence.length()){
                    longerSequence = sequence;
                    index = i - (longerSequence.length());
                }
            sequence = "";
            }

        }

            System.out.println(longerSequence.length());
            System.out.println(index);
    }
}






