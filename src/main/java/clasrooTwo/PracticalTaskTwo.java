package clasrooTwo;

import java.sql.SQLOutput;
import java.util.Scanner;

public class PracticalTaskTwo {
    public static void main(String[] args) {

////    //tips nosaukums deklaracija
// Scanner scanner = new Scanner(System.in);
//        int vecums;
//        boolean drikstBalsot = false;
//
//        System.out.println("Paskaties cilvēka pasē");
//        vecums = scanner.nextInt();
//
//        if (vecums >= 18) {
//            drikstBalsot = true;
//        }
//
//       System.out.println("Vai drikst balsot? " + drikstBalsot);
//
//        int x = 20;
//        int y = 23;
//
//        if (y > x){
//            System.out.println("Y ir lielāks par X");
//        }
//
//        if (y > x && x > 5){
//            System.out.println("y ir lielāks par x un lielāks par 5");
//        }
//
//        if (y > x || x > 25){
//            //ir true, jo izpildās vismaz viens no nosacījumiem
//            System.out.println("šis izpildās ļoti labi");
//        }

//        // If Else
//
//        int skaitlis = 0;
//
//        if (skaitlis > 0) {
//            System.out.println(skaitlis + " ir pozitivs!");
//        } else if (skaitlis < 0) {
//            System.out.println(skaitlis + " ir negativs!");
//        } else{
//            System.out.println(skaitlis + " ir NULLE!");
//        }
//
        int cipars = 20;

        if (cipars == 10) {
            System.out.println("cipars = " + cipars);
        } else if (cipars == 15) {
            System.out.println("cipars = " + cipars);
        } else if (cipars == 20) {
                System.out.println("cipars = " + cipars);
        } else{
            System.out.println("cipars ir nezināms");
        }

        Scanner scanner = new Scanner(System.in);
        int vecums;
        boolean canVote = false;
        System.out.println("Paskaties cilvēka pasē?");
        vecums = scanner.nextInt();
        if (vecums >= 18) {
            canVote = true;
        }

        if(canVote){
            System.out.println("Cilveks var balsot");
        } else{
            System.out.println("Cilveks nevar balsot");
        }


        int month = 4;

        switch (month) {
            case 1:
                System.out.println("janvāris");
                break;
            case 2:
                System.out.println("Februaris");
                break;
            case 12:
                System.out.println("Decembris");
            default:
                System.out.println("Mēnesis " + month + "nav definēts ");
        }

        int cilvekaVecums=65;
        char dzimums = 'V';
        boolean drikstDoties = false;

        if(dzimums=='V' && cilvekaVecums >=65){
            drikstDoties = true;
        } else if(dzimums=='S' && cilvekaVecums>=60){
            drikstDoties=true;
        }

        System.out.println("Cilveks drikst doties pensija " + drikstDoties);


        int skaitlisX = 14;

        if (skaitlisX % 2 == 0) {
            System.out.println("Skaitlis ir pāra");
        } else {
            System.out.println("Skaitlis ir nepāra");
        }



// Scanner scanner = new Scanner(System.in);
//        int vecums;
//        boolean drikstBalsot = false;
//
//        System.out.println("Paskaties cilvēka pasē?");
//        vecums = scanner.nextInt();
//        if (vecums >= 18) {
//            drikstBalsot = true;
//        }
//
//        System.out.println("Vai drikst balsot? " + drikstBalsot);




//        System.out.println("Ievadi savu vārdu");
//
//        String vards = scanner.nextLine();
//
//        System.out.println("Labdien "+vards + "!");
//        System.out.println("Esi sveicināts kalkulatora programmā");
//                int a;
//                int b;
//                int summa;
//
//        System.out.println("ievadi tekstu a");
//                a = scanner.nextInt();
//                System.out.println("ievadi tekstu b");
//                b = scanner.nextInt();
//
//
//        System.out.println("Šeit jābūt nepatiesam: " + (5>10));
//        System.out.println((5<10));
//        System.out.println(6==5); //false
//        System.out.println(5==5);   //true
//        System.out.println(6!=5); //true
//        System.out.println("Šeit jābūt nepatiesam: " + (5 > 10));
//        System.out.println((5 < 10));
//        System.out.println(6 == 5); //false
//        System.out.println(5 == 5);   //true
//        System.out.println(6 != 5); //true
//        System.out.println(5 != 5); //false
//        int vecums = 18;
//        System.out.println(vecums >= 18);
//        int bernaVecums = 5;
//        System.out.println(bernaVecums<=5);
//        System.out.println(vecums>bernaVecums);
//        boolean isEligibleToVote = vecums >= 18;
//        System.out.println("Vai cilvēks drīkst balsot ? " + isEligibleToVote);
//
//        System.out.println("Ievadi X");
//        int x = 4;
//        boolean vaiIrPatiess = (x < 5 && x < 10); //true
//        x = 5;
//        System.out.println((x < 5 && x < 10)); //false
//        System.out.println((x < 5 || x < 10)); //true
//
//
//        System.out.println(vaiIrPatiess);
//
//
//
//
//                //System.out.println(String.format("%s, + %s + %s = %s", vards, a, b, summa));
//
//
//
//
//
//
//
//
//
//       // System.out.println("šī ir otrā java lekcija");
//    //String texts;
//    //String name = "Edgars";
//            //teksts =String.format("Mani sauc %s", name);
//
//
//
//            //System.out.println("a-b = " + (b / a));
//        //System.out.println(String.format("%.2f",(b / a)));
//
//       // String name = "Edgars";
//       // String surname = "Porietis";
//       // String role = "Students";
//      //  double videjaAtzime = 7.544;
//
//
//
//
//        //String concatTeikums = "Mani sauc " + name + "Mans uzcards ir " + surname + "Es esmu " + role;
//      //  String teikums = String.format("Mani sauc %s. Mans uzvārds ir %s. Es esmu %s",name,surname,role,videjaAtzime);
//
//       // System.out.println(teikums);
//       // System.out.println(concatTeikums);
//
//
//
}


}
