package homeworkTwo;

import java.util.Arrays;
import java.util.Scanner;

public class HomeWorkTwo {
    public static void main(String[] args) {

        System.out.println("1. UZDEVUMS");

        System.out.println("A un B piemeri");


        int cipars = 5;
        boolean irpozitivs = true;
        boolean irnegativs = false;
        if (cipars >= 0) {
            System.out.println("Cipars ir pozitvs" + " = " + irpozitivs);
        }
        if (cipars < 0) {
            System.out.println("Cipars ir negatīvs" + " = " + irnegativs);
        } else {
            System.out.println("Cipars ir negatīvs" + " = " + irnegativs);
        }


        System.out.println("C piemērs");

        int ciparsDivi = 7;
        boolean rezultats = true;
        if (ciparsDivi > 5 && ciparsDivi <= 10) {
            System.out.println(rezultats);
        }


        System.out.println("D piemērs");

        int ciparsTris = 7;
        boolean rezultats1 = true;
        if (ciparsTris >= 5 && ciparsTris <= 10) {
            System.out.println(rezultats1);
        }

        System.out.println("E piemērs");

        int ciparsCetri = 10;
        boolean rezultatsE = false;
        if (ciparsCetri == 0 || ciparsCetri == 10) {
            System.out.println(rezultatsE);
        } else {
            System.out.println("X Nav ne 0 ne 10");
        }

        System.out.println("F piemērs");
        int ciparsPieci = 5;
        boolean rezultatsF = true;
        if (ciparsPieci * ciparsPieci > 10) {
            System.out.println("Reizinājums lielāks par 10" + " " + rezultatsF);
        } else {
            System.out.println("Reizinājums nav lielāks par 10");}


        System.out.println(" 2. UZDEVUMS");

        int month = 7;

        switch (month) {
            case 1:
                System.out.println("Janvāris");
                break;
            case 2:
                System.out.println("Februaris");
                break;
            case 3:
                System.out.println("Marts");
                break;
            case 4:
                System.out.println("Aprīlis");
                break;
            case 5:
                System.out.println("Maijs");
                break;
            case 6:
                System.out.println("Jūnijs");
                break;
            case 7:
                System.out.println("Jūlijs");
                break;
            case 8:
                System.out.println("Augusts");
                break;
            case 9:
                System.out.println("Septembris");
                break;
            case 10:
                System.out.println("Oktobris");
                break;
            case 11:
                System.out.println("Novembris");
                break;
            case 12:
                System.out.println("Decembris");
            default:
                System.out.println("Mēnesis " + month + " " + "nav definēts (jābūt no 1 līdz 12 ");
        }


        System.out.println("3 UZDEVUMS");

        Scanner scanner = new Scanner(System.in);

                int a;
                int b;
                int c;
                int largest;

        System.out.println("ievadi skaitli a");
        a = scanner.nextInt();
                System.out.println("ievadi skaitli b");
        b = scanner.nextInt();
                 System.out.println("ievadi skaitli c");
        c = scanner.nextInt();

        largest = c > (a>b ? a : b)? c : ((a>b)? a :b);
        System.out.println("Lielākais skaitlis ir = " + " " + largest);


        System.out.println("4. UZDEVUMS");

        String krasa = "zaļš";

        System.out.println("ievadi krāsu zaļš/dzeltens/sarkans");
        krasa = scanner.next();
        if (krasa.equals("zaļš")){
            System.out.println("Ej droši");}
            else if (krasa.equals("dzeltens")) {
                System.out.println("ieņem pozīciju");}
            else if (krasa.equals("sarkans")){
            System.out.println("nedrīkst iet");}
            else {
            System.out.println("Skaties pa labi, tad pa kreisi un ja nav mašīnu, skrien pāri");}

        System.out.println("######");


            luksoforsDivi();



        System.out.println("5. UZDEVUMS ");

        printbusinessCard();
        printbusinessCard();
        printbusinessCard();


        System.out.println("6. UZDEVUMS");

        printBusinessCardTwo("Edgars", "Porietis", "+371 25554867", 1989 );
        printBusinessCardTwo("Jānis", "Bērziņš", "+371 5478555", 1995 );
        printBusinessCardTwo("Anna", "Berziņa", "+371 479456699", 1990 );


        System.out.println("7. UZDEVUMS");


        int summa = sum(6,15);
        System.out.println(summa);


        System.out.println("8. UZDEVUMS");

    average();

    }



    static void printbusinessCard(){
        String name = "Edgars";
        String surName = "Porietis";
        String telephone = "+371 55555555";
        String dateOfBirth = "1989";
        System.out.println("Vizītkarte");
        System.out.println("#########");
        System.out.println("Vārds:" + " " + name);
        System.out.println("Uzvārds:" + " "+ surName);
        System.out.println("Tālruņa nr.: "+ " "+ telephone);
        System.out.println("Dzimšanas datums: "+ " " + dateOfBirth);
        System.out.println("##########");
    }

    static int sum(int a, int b){
        return a+b;
    }

    static void average(){
    Scanner scanner = new Scanner(System.in);
    double skaitlis1;
    double skaitlis2;
    double skaitlis3;

    double summa;
    double avg;

        System.out.println("Ievadi 3 decimālskaitļus");
        skaitlis1 = scanner.nextDouble();
        skaitlis2 = scanner.nextDouble();
        skaitlis3 = scanner.nextDouble();

        summa=skaitlis1 + skaitlis2 + skaitlis3;
        avg = summa/3;

        System.out.println(("Vidējais skaitlis:"+" " + avg));
    }




    static void printBusinessCardTwo(String name, String surName, String telephone, int dateOfBirth){

        System.out.println("Vizītkarte");
        System.out.println("#########");
        System.out.println("Vārds:" + " " + name);
        System.out.println("Uzvārds:" + " "+ surName);
        System.out.println("Tālruņa nr.: "+ " "+ telephone);
        System.out.println("Dzimšanas datums: "+ " " + dateOfBirth);
        System.out.println("##########");
    }

    static void luksoforsDivi() {
        Scanner scanner = new Scanner(System.in);
        String zals = "zaļš";
        String dzeltenes = "dzeltens";
        String sarkans = "sarkans";

        System.out.println("Ievadi krāsu luksoforam");
        String krasa = scanner.nextLine();

        boolean isGreen = zals.equals(krasa);
        boolean isYellow = dzeltenes.equals(krasa);
        boolean isRed = sarkans.equals(krasa);

        if (isGreen) {
            System.out.println("Aiziet");
        } else if (isYellow) {
            System.out.println("Gatavojamies");
        } else if (isRed) {
            System.out.println("Stāvi");
        } else {
            System.out.println("Šāda krāsa nav definēta");
        }






        }

    }

