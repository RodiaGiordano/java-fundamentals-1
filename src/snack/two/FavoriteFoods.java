package snack.two;

import java.util.Scanner;

public class FavoriteFoods {
    public static void main(String[] args){
        String[] foods = {"pasta", "pizza","verdura", "carne", "pesce", "frutta", "cinese"};

        int arrayLength = foods.length;
        System.out.println("Lunghezza: " + arrayLength);
        System.out.println("Preferito: " + foods[0]);
        System.out.println("end: " +  foods[foods.length -1]);
        String half;

        if(foods.length % 2 == 0){

            String smallerHalf = foods[foods.length / 2 -1];
            String olderHalf = foods[foods.length / 2];
            boolean choice = false;
            do{
            System.out.println("scrivi quale preferisci tra: " + smallerHalf + " e " + olderHalf);
            Scanner scanner = new Scanner(System.in);
            half = scanner.nextLine();

            if(half.equals(smallerHalf) || half.equals(olderHalf)){
                choice = true;
            }else{
                System.out.println("Scelta non corretta");
            }
            }while(!choice);

        }else{
            half = foods[foods.length / 2];
        }

        System.out.println("mezzo: " + half);

    }
}

