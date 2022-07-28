package homework;

import java.util.Scanner;
import java.util.stream.IntStream;

public class LoopHomework {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1. UZDEVUMS");
        int i = 0;
        while (i <= 100) {
            System.out.println("I ir : " + i);
            i = i + 1;
        }
        System.out.println("Gatavs");
        System.out.println(" ");

        System.out.println("2. UZDEVUMS");

        System.out.println("Ievadi skaitli");
        int num = scanner.nextInt(),
                Y = 2;
        boolean flag = false;
        while (Y <= num / 2) {
            if (num % Y == 0) {
                flag = true;
                break;
            }

            ++Y;
        }

        if (!flag)
            System.out.println(num + " Ir pirmskaitlis.");
        else
            System.out.println(num + " Nav pirmskaitlis.");

        System.out.println(" ");

        System.out.println("3. UZDEVUMS");

        String[] gadalaiki = {"Pavasaris", "Vasara", "Rudens", "Ziema"};
        int[] menesaSkaitlis = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        char[] laikapstakli = {'A', 'B', 'C', 'D'};

        System.out.println("Izvests ar while");

        printStringArray(gadalaiki);

        printIntArray(menesaSkaitlis);

        //printCharArray(laikapstakli);

//        int skaititajs = 0;
//        while (skaititajs < gadalaiki.length) ;
//        {
//            System.out.println(gadalaiki[skaititajs]);
//            skaititajs++;


            int skaititajs1 = 0;
            while (skaititajs1 < menesaSkaitlis.length) {
                System.out.println(menesaSkaitlis[skaititajs1]);
                skaititajs1++;

                int skaititajs2 = 0;
                while (skaititajs2 < laikapstakli.length) {
                    System.out.println(laikapstakli[skaititajs2]);
                    skaititajs2++;


                    System.out.println("Izvests ar Do While");


                    int vieniba = 1;
                    do {
                        System.out.println(menesaSkaitlis);
                        vieniba++;
                    } while (vieniba < menesaSkaitlis.length);


                    System.out.println("izvests ar for");

                    for (int j = 0; j < gadalaiki.length; j++) {
                        System.out.println(gadalaiki[j]);
                    }
                    for (int j = 0; j < menesaSkaitlis.length; j++) {
                        System.out.println(menesaSkaitlis[j]);
                    }
                    for (int j = 0; j < laikapstakli.length; j++) {
                        System.out.println(laikapstakli[j]);
                    }


                    for (String gadal : gadalaiki) {
                        System.out.println(gadal);
                    }
                }


                System.out.println("4. UZDEVUMS");

                for (int j = 2; j <= 100; j = j + 2) {
                    if (j % 2 == 0) {
                        System.out.print(j);
                    }
                }
                System.out.println(" ");


                System.out.println("5.UZDEVUMS");




                System.out.println("6.UZDEVUMS");

                final int PASSWORD = 123456;
                final int MAX_PASS_ATTEMPS = 3;
                boolean isLoggedIn = false;
                int passAttemps = 0;
                while (passAttemps < MAX_PASS_ATTEMPS && !isLoggedIn) {
                    System.out.print("Ievadiet PIN kodu: ");
                    Scanner input = new Scanner(System.in);
                    String inputPass = input.nextLine();

                    if (!(inputPass.equals(PASSWORD))) {
                        System.out.println("Nepareiz PIN, mēģiniet vēlreiz");
                        passAttemps++;
                    } else {
                        System.out.println("PIN ir pieņemts, laipni lūdzam atpakaļ!");
                        isLoggedIn = true;
                        break;


                    }

                }


            }
        }


     public static boolean irPirmskaitlis(int a) {
        if (a <= 1) {
            return false;
        }
        for (int i = 2; i < Math.sqrt(a); i++) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;
    }


    static void printIntArray(int[] randomMasivs) {
        int counter = 0;
        while (counter < randomMasivs.length) {
            System.out.println(randomMasivs[counter]);
            counter++;
        }
    }

    static void printStringArray(String[] randomMasivs) {
        int counter = 0;
        while (counter < randomMasivs.length) {
            System.out.println(randomMasivs[counter]);
            counter++;
        }
    }
}
//                static void printCharArray ( char[] randomMasivs){
//                    int counter = 0;
//                    while (counter < randomMasivs.length) {
//                        System.out.println(randomMasivs[counter]);
//                        counter++;
//                    }

//                }
