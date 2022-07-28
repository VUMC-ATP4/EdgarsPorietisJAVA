package homework.classHomework;

import java.util.Scanner;

public class Trijsturis {
Scanner scanner = new Scanner(System.in);
    Trijsturis(){
        System.out.println("Veidoju trijstūri..");
        System.out.println("Laukums pēc Herona formulas");
    }

    int malaA = 5;
    int malaB = 6;
    int malaC = 6;

    int p = ((malaA+malaB+malaC)/2);


    public double laukums () {
        return Math.sqrt(p * (p - malaA) * (p - malaB) * (p - malaC));
    }


    public boolean irVienadmalu(int malaA, int malaB, int malaC) {
        System.out.println(" Vai ir vienādmalu trijstūris?");
        if ((malaA == malaB && malaB == malaC && malaA==malaC) ) {

            return true;
        }
        return false;

    }
        public boolean irVienadSanu(int malaA, int malaB, int malaC) {
            System.out.println("Vai ir vienādsānu trijstūris?");
            if ((malaA == malaB || malaB == malaC||malaA==malaC)) {
                return false;  }
            return true;

    }

    }
