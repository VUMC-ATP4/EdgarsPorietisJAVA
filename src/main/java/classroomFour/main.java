package classroomFour;

public class main {
    public static void main(String[] args) {
        House majaViens = new House();
        majaViens.majasNumurs = 1;
        majaViens.ielasNosaukums = "Brīvības iela";
        majaViens.stavuSkaits = 2;
        majaViens.ieejuSkaits = 1;
        majaViens.istabuSkaits = 5;
        majaViens.platiba = 250;
//        majaViens.cena = 150000;
        majaViens.irStavvieta = true;
//        majaViens.valuta = '$';



        House majaDivi = new House();
        majaDivi.majasNumurs = 2;
        majaDivi.ielasNosaukums = "Ģertrūdes iela";
        majaDivi.stavuSkaits = 3;
        majaDivi.istabuSkaits = 4;
        majaDivi.ieejuSkaits = 2;
        majaDivi.platiba = 165.3;
        Cena cena1 = new Cena();
        cena1.cena=30000;
        cena1.valuta = '$';
        majaViens.cena = cena1;

        majaDivi.cena = new Cena();
        majaDivi.irStavvieta = true;
//        majaDivi.valuta = '$';
        majaDivi.printetVisu();

        Velosipeds velosipeds1 = new Velosipeds();
        Velosipeds velosipeds2 = new Velosipeds();
        velosipeds2.bremzuTips = "Disku";
        velosipeds2.spiedPedalus();
        velosipeds2.spiedPedalus();
        velosipeds2.spiedPedalus();
        System.out.println("Velosipēda 2 ātrums ir = " + velosipeds2.atrums);
        velosipeds2.bremze();
        velosipeds2.bremze();
        System.out.println("Velosipēda 2 ātrums ir = " + velosipeds2.atrums);
        System.out.println(velosipeds1.atrumi);
        System.out.println(velosipeds1.nosaukums);
        velosipeds1.atrumi = 28;
        System.out.println(velosipeds1.atrumi);

        Kakis kakisViens = new Kakis();
        kakisViens.printetKakis();


        Rinkis rinkis1 = new Rinkis();
        Rinkis rinkis2 = new Rinkis();

        rinkis1.radiuss = 5.34;
        rinkis2.radiuss = 15.30;

        System.out.println(rinkis1.rinkaLaukums());
        System.out.println(rinkis2.rinkaLaukums());

        System.out.println(rinkis1.rinkaLaukums());
        System.out.println(rinkis2.rinkaLaukums());




    }
}


