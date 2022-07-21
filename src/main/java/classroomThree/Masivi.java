package classroomThree;

import java.util.Scanner;


public class Masivi {

    public static void main(String[] args) {

        String[] gadalaiki = {"Pavasaris", "Vasara", "Rudens", "Ziema"};
        int[] fibonacciNumbers = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34};
        double[] randomSkaitli = {21.3, 323.23, 412.32};

//        / noskaidrot masīva garumu
        System.out.println("masīva garums ir " + gadalaiki.length);

        System.out.println(gadalaiki[0]);
        System.out.println(gadalaiki[1]);
        System.out.println(gadalaiki[3]);
        System.out.println(gadalaiki[3]);

        System.out.println(fibonacciNumbers[1]);
        System.out.println(fibonacciNumbers[2]);
        System.out.println(fibonacciNumbers[3]);
        System.out.println(fibonacciNumbers[4]);


//Masīvs ar cilvēku vārdiem
//        String[] cilvēki = {"Juris", "Pēteris", "Anna"};
//        int[] vecums = {33, 40, 28};
//        System.out.println("Vārds:" + cilvēki[0] + "\n" + "Vecums: " + vecums[0]);
//
//
//        int[] mansMasivs = generateArray();
//        System.out.println(mansMasivs[0] + "" + mansMasivs[1] + "" + mansMasivs[2]);


        int i = 0;
        while (i < 5) {
            System.out.println("I ir : " + i);
            i = i + 1;

        }
        System.out.println("Cikla izeja");

        int q = 10;
        while (q>1){
            System.out.println("Q ir: " + q);
            q--; //tas pats kas q = -1
        }

        int[]bingoLotoLaimigieSkaitli={3,4,48,7,6,31};
        int counter = 0;
        while (counter < bingoLotoLaimigieSkaitli.length){
            System.out.println(bingoLotoLaimigieSkaitli[counter]);
            counter++;
        }

//        String [] kartis = {"Pīķa dūzis","Ercena kalps","Kārava dāma"};
//        int karts = 0;
//        System.out.println(String.format("Man rokā ir %s kārtis ", kartis.length));
//        while(karts<kartis.length){
//            System.out.println(kartis[karts]);
//            karts++;
//        }
//
//        static int sumPositiveNumbers() {
//            Scanner scanner = new Scanner(System.in);
//            System.out.println("Ieraksti skaitli");
//            int number = scanner.nextInt();
//            int summa = 0;
//            while (number >= 0){
//                summa = summa + number;
//                System.out.println("Ieraksti skaitli");
//                number = scanner.nextInt();
//            }
//            System.out.println("Pozitīvo skaitļu summa ir: " + summa);
//            return summa;
//        }


Scanner scanner = new Scanner((System.in));

//        String parole = "Parole123";
//        String lietotajaParole;
//        do {
//            System.out.println("Ievadi paroli");
//            lietotajaParole = scanner.nextLine(); //Parole123
//            System.out.println("Pārbaudām paroli");
//        } while (!lietotajaParole.equals(parole));
//        System.out.println("Pareiza parole");
//
//        for (int j = 0; j < 10 ; j++) {
//            System.out.println(j);
//
//        }
//        for (int j = 0; j < 10 ; j=j+2) {
//            System.out.println(j);

//        }
    for (int j = 0; j < gadalaiki.length ; j++) {
           System.out.println(gadalaiki[j]);

    }


        // Šobrīd ciematā ir iespēja iegādāties mājas ar mājas numuriem no 1 līdz 50.
        // Pircējs  vēlas iegādāties māju ciematā, bet viņš nevēlas māju, kuras numurs dalās ar 3 vai 5.
        // Cik māju numuri atbilst prasībām?

        for (int j = 1; j <=50 ; j++) {
            if((j%3==0)||(j%5==0)){
                System.out.println("Šis numurs mums neder " + j);
            }else{
                System.out.println("Šis numurs mums der " + j);
            }
        }
        int[] skaitlos = {1, 3, 4, 6, 1, 2, 3, 5, 1, 2, 5};
        int summa =0;
        //for each
        for (int skaitlis : skaitlos) {
            summa = summa + skaitlis;
        }
        System.out.println(summa);

        String[] vardi = {"ābols","bumbieris","Burkāns"};
        for (String vards : vardi ){
            System.out.println(vards);
        }

        for (int j = 0; j < 10 ; j++) {
            if(j==5){
                break;
            }
            System.out.println(j);
        }

        System.out.println("=========================================");
        int[] skaitluMasivs = {1,2,3,4,5,6,7,2,3,4,5,6,-3,5,4};

        for (int j = 0; j < skaitluMasivs.length; j++) {
            if(skaitluMasivs[j]==-3){
                System.out.println(skaitluMasivs[j]);
                break;
            }
            System.out.println(skaitluMasivs[j]);
        }




//    static int[] generateArray() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Ievadi pirmo skaitli...");
//        int a = scanner.nextInt();
//        System.out.println("Ievadi otro skaitli...");
//        int b = scanner.nextInt();
//        System.out.println("Ievadi trešo skaitli...");
//        int c = scanner.nextInt();
//        int[] skaitluMasivs = {a, b, c};
//        return skaitluMasivs;


    }



}
