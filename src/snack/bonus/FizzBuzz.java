package snack.bonus;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        String[] guestList = { "Jennifer Lopez", "Zendaya", "Chris Hemsworth", "Bad Bunny", "Cara Delevingne", "Kendall Jenner", "Uma Thurman", "Damiano David", "Luca Guadagnino"};
        System.out.println("nominativo?");
        String name = scanner.nextLine();

        String response = name + " Non è nella lista";

        for(int i = 0; i < guestList.length; i++){
            if(name.equals(guestList[i])) {
                response = name + " E' nella lista";
                break;
            }
        }

        System.out.println(response);

    }
}
