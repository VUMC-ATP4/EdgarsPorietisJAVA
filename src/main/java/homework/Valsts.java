package homework;

import java.sql.SQLOutput;

public class Valsts {

    String valstsNosaukums;
    int iedzSkaits;
    double platiba;
    String galvaspilseta;
    String valoda;
    boolean irESdalibvalsts = true;
    char valuta;

    public void printetValsts(){
        System.out.println("Valsts nosaukums: " + valstsNosaukums);
        System.out.println("Iedzīvotāju skaits: " + iedzSkaits);
        System.out.println("Platība km2: " + platiba);
        System.out.println("Galvaspilsēta : " + galvaspilseta);
        System.out.println("Valsts valoda : " + valoda);
        System.out.println("Vai ir ES dalībvalsts : " + irESdalibvalsts);
        System.out.println("Valsts valūta : " + valuta);
    }

    public void printetKonkatanaciju1(){
        System.out.println("Info par valsti : " + " Nosaukums : " + valstsNosaukums+"," + " Iedzīvotāju skaits : " + iedzSkaits+"," + " Galvaspilsēta : " + galvaspilseta);
    }

    public void printetKonkatanaciju2(){
        System.out.println();
    }


}