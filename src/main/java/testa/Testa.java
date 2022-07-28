package testa;

import java.util.Scanner;

public class Testa {
    public static void main(String[] args) {
        enterPin();
    }


    public static void enterPin() {
        Scanner scanner = new Scanner(System.in);
        int PIN = 1234;
        int meginajumuSkaits = 0;

        while (meginajumuSkaits < 3) {
            System.out.println("Ievadi PIN");
            if (PIN == scanner.nextInt()) {
                System.out.println("PIN ir pieņemts, laipni lūdzam atpakaļ");
                break;
            }
            if (meginajumuSkaits == 3) {
                System.out.println("Atvainojiet, bet jūs esat bloķēts");
                break;
            }
            System.out.println("Nepareizs PIN, mēģiniet vēlreiz");
            meginajumuSkaits++;
        }

    }
}