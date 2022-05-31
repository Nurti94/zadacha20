package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String a= scanner.nextLine();
        switch (a.toUpperCase()){
            case "MONDAY":
                System.out.println(DAYS.MONDAY.getSabak());
                break;
                case "TUESDAY":
                    System.out.println(DAYS.TUESDAY.getSabak());
                break;
            case "WEDNESDAY":
                System.out.println(DAYS.WEDNESDAY.getSabak());
                break;
            case "THURSDAY":
                System.out.println(DAYS.THURSDAY.getSabak());
                break;
            case "FRIDAY":
                System.out.println(DAYS.FRIDAY.getSabak());
                break;
            case "SATUDAY":
                System.out.println(DAYS.SATUDAY.getSabak());
                break;
            case "SUNDAY":
                System.out.println(DAYS.SUNDAY.getSabak());
                break;
            default:
                System.out.println("Myndai kun jok");

        }


    }
}
