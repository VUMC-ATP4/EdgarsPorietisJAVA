package testa;

import java.util.Scanner;

public class Testa {


    public static void main(String[] args) {

        final int PASSWORD = 123456;
        final int MAX_PASS_ATTEMPS = 3;
        boolean isLoggedIn = false;
        int passAttemps = 0;
        while (passAttemps < MAX_PASS_ATTEMPS && !isLoggedIn) {
            System.out.print("Ievadiet PIN kodu: ");
            Scanner input = new Scanner(System.in);
            String inputPass = input.nextLine();

            System.out.println("PIN ir pieņemts, laipni lūdzam atpakaļ!");
            isLoggedIn = true;
        }
    }
}