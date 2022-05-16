public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Edgars JAVA 1 Lekcija");

        int x = 5;
        int y = 10;
    //Komentārs

        // System.out.println("x ir vienāds ar:");
        System.out.println(x);
        System.out.println("y ir vienāds ar:");
        System.out.println(y);
        System.out.println("x+y ir vienāds ar:");
        System.out.println(x+y);

        //[Mainīgā tips] [mainīgā nosaukums] = [Vērtība];
        //Vārdi un teikumi JAVA valodā tiek saglabāti mainīgā tipā "String"

        String sunaVards = "Reksis";
        //Veseli skaitļi tiek definēti ar mainīgā tipu INT
        int sunaVecums = 10;

        //Daļskaitļi tiek definēti ar maiņīgā tpu Double vai Float
        double sunaSvars = 15.5;

        String sunaSkirne = "VAS";

        //Jā(true) nē(false) jautājums tiek definēts ar mainīgā tipu boolean
        boolean sunsIzsalcis = true;
        //Vienu simbolu definē ar mainīgā tipu 'char'
        char sunaDzimums = 'V';
        int sunaCena = 100;
        char currency = '$';

        System.out.println("Suņa Vārds:" + sunaVards);
        System.out.println("Suņa Vecums:" + sunaVecums);
        System.out.println("Suņa Svars:" + sunaSvars);
        System.out.println("Suņa Skirne:" + sunaSkirne);
        System.out.println("Suņa Izsalcis suns?:" + sunsIzsalcis);
        System.out.println("Suņa Dzimums:" + sunaDzimums);
        System.out.println("Suņa kucēni maksā: " + sunaCena + currency);

        int summa;
        int pirmaisSkaitlis = 20;
        int otraisSkaitlis = 10;

        int starpiba = pirmaisSkaitlis - otraisSkaitlis;

        int summa = pirmaisSkaitlis + otraisSkaitlis;
        int dalijums = pirmaisSkaitlis / otraisSkaitlis;
        int reizinajums = pirmaisSkaitlis * otraisSkaitlis;
        int atlikums = pirmaisSkaitlis % otraisSkaitlis;


        System.out.println("starpība"+starpiba);
        System.out.println("summa"+summa);
        System.out.println("dalijums"+dalijums);
        System.out.println("reizinājums"+reizinajums);
        System.out.println("atlikums"+atlikums);



        summa = pirmaisSkaitlis + otraisSkaitlis;
        System.out.println(pirmaisSkaitlis + "+" + "(" + otraisSkaitlis + ")" + "=" + summa);






    }


}
