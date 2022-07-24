package homework.classHomework;

import java.util.Scanner;

public class Trijsturis {
Scanner scanner = new Scanner(System.in);
    Trijsturis(){
        System.out.println("Veidoju trijstūri..");
    }

    int malaA = 5;
    int malaB = 9;
    int malaC = 8;

    int p = ((malaA+malaB+malaC)/2);

    public double laukums () {
        return Math.sqrt(p * (p - malaA) * (p - malaB) * (p - malaC));
    }


    public boolean irVienadmalu(int malaA, int malaB, int malaC) {
        if ((malaA == malaB && malaB == malaC) || (malaA == malaC && malaB == malaC)) {
            return true;
        }
        return false;

    }
        public boolean irVienadSanu(int malaA, int malaB, int malaC) {
            if ((malaA == malaB && malaB == malaC)||(malaB==malaA && malaA==malaC)) {
                return false;  }
            return true;

    }

    }