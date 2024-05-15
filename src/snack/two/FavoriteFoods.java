package snack.two;

import java.lang.reflect.Array;
import java.util.Arrays;

public class FavoriteFoods {
    public static void main(String[] args){
        String[] foods = {"pasta", "pizza","verdura", "carne", "pesce", "frutta", "cinese"};

        int arrayLength = foods.length;
        System.out.println("Lunghezza: " + arrayLength);
        System.out.println("Preferito: " + foods[0]);
        System.out.println("end: " +  foods[foods.length -1]);
        System.out.println("mezzo: " + foods[foods.length / 2 -1]);
    // arrotonda per difetto
    }
}

