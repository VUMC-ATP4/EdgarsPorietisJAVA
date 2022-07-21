package homework;

import jdk.swing.interop.SwingInterOpUtils;

public class FirstClass {



    public static void main(String[] args) {
        System.out.println("This is Homework");

        Valsts latvija = new Valsts();
        latvija.valstsNosaukums = "Latvija";
        latvija.iedzSkaits = 1875757;
        latvija.platiba = 64589;
        latvija.galvaspilseta = "Rīga";
        latvija.valoda = "latviešu";
        latvija.irESdalibvalsts = true;
        latvija.valuta = '€';


        latvija.printetValsts();

        // Konkatanācija
        latvija.printetKonkatanaciju1();


        int pirmaisSkaitlis = 350;
        int otraisSkaitlis = 600;
        int tresaisSkaitlis = 10;
        int ceturtaisSkaitlis = 25;
        double piektaisSkaitlis = 30.50;
        double sestaisSkaitlis = 32.5;

        int summa = pirmaisSkaitlis+otraisSkaitlis;
        int summa2 = otraisSkaitlis + ceturtaisSkaitlis;
        int summa3 = pirmaisSkaitlis + ceturtaisSkaitlis;

        int dalijums = otraisSkaitlis/tresaisSkaitlis;
        int dalijums2 = pirmaisSkaitlis/tresaisSkaitlis;
        int dalijums3 = otraisSkaitlis/ceturtaisSkaitlis;

        int reizinajums1 = pirmaisSkaitlis*tresaisSkaitlis;
        int reizinajums2 = otraisSkaitlis*pirmaisSkaitlis;
        int reizinajums3 = ceturtaisSkaitlis*tresaisSkaitlis;

        int atlikums = otraisSkaitlis % tresaisSkaitlis;
        int atlikums2 = pirmaisSkaitlis % tresaisSkaitlis;
        int atlikums3 = otraisSkaitlis % ceturtaisSkaitlis;

        System.out.println("Summa1"+ summa);
        System.out.println("Summa2"+ summa2);
        System.out.println("Summa3"+ summa3);
        System.out.println("Dalījums"+ dalijums);
        System.out.println("Dalījums2"+ dalijums2);
        System.out.println("Dalījums3"+ dalijums3);
        System.out.println("Reizinājums1"+ reizinajums1);
        System.out.println("Reizinājums2"+ reizinajums2);
        System.out.println("Reizinājums3"+ reizinajums3);
        System.out.println("Atlikums"+ atlikums);
        System.out.println("Atlikums2"+ atlikums2);
        System.out.println("Atlikums3"+ atlikums3);
    }
}
