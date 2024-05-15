package snack.one;

import java.util.Scanner;

public class TickectTrain {
    public static void main(String[] args){

      /*  Scanner scanner = new Scanner(System.in);

        System.out.println("Quanti chilometri vuoi percorrere?");
        float kilometres = Integer.parseInt(scanner.nextLine());
        System.out.println("Quanti anni hai?");
        byte userAge = (byte) Integer.parseInt(scanner.nextLine());

        float ticketPrice = kilometres * 0.21F;

        float finalPrice;

        if(userAge < 18){
            finalPrice = ticketPrice -(ticketPrice * 20 / 100);
            System.out.println(finalPrice);
        }else if (userAge > 64){
            finalPrice = ticketPrice -(ticketPrice * 40 / 100);
        }else{
            finalPrice = ticketPrice;
        }

        System.out.println(finalPrice);
    */
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quanti chilometri vuoi percorrere?");

        float kilometres = Float.parseFloat(scanner.nextLine());
        System.out.println("Quanti anni hai?");
        byte userAge = (byte) Integer.parseInt(scanner.nextLine());

        float ticketPrice = kilometres * 0.21F;

        float discount = 1F;

        if(userAge < 18){
            discount = 0.80F;
        }else if (userAge > 64){
            discount = 0.60F;
        }

        float finalPrice = ticketPrice * discount;
        System.out.println(finalPrice);
        // provare a troncare dopo la seconda decimale
    }
}
