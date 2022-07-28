package classroomFour;

public class House {
    String ielasNosaukums;
    int majasNumurs;
    int stavuSkaits;
    int ieejuSkaits;
    int istabuSkaits;
    double platiba;
    Cena cena;
    boolean irStavvieta;

   float f;

//    public void printetAdresi() {
//        switch ();
//        System.out.println("Mājas adrese ir:" + ielasNosaukums + " " + majasNumurs);
//    }



    public void printetVisu() {
        System.out.println("Mājas adrese ir: " + ielasNosaukums + " " + majasNumurs);
        System.out.println("Stāvu skaits ir: " + stavuSkaits);
        System.out.println("Istabu skaits ir: " + istabuSkaits);
        System.out.println("Ieeju skaits: " + ieejuSkaits);
        System.out.println("Platība: " + platiba);
        System.out.println("Cena: " + cena);
        System.out.println("Ir stāvvieta? " + irStavvieta);

    }
}