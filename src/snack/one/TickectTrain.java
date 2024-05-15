package snack.one;

import java.util.Scanner;

public class TickectTrain {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Quanti chilometri vuoi percorrere?");
        int kilometres = Integer.parseInt(scanner.nextLine());
        System.out.println("Quanti anni hai?");
        int userAge = Integer.parseInt(scanner.nextLine());

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

    }
}
