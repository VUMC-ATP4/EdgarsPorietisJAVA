package homework.classHomework;

public class Main {
    public static void main(String[] args) {

        Trijsturis trijsturis1 = new Trijsturis();

        trijsturis1.malaA = 10;
        trijsturis1.malaC = 2;
        trijsturis1.malaB = 3;

        System.out.println(trijsturis1.laukums());

        System.out.println(trijsturis1.irVienadmalu(2,2,2));
        System.out.println(trijsturis1.irVienadSanu(5,8,5));



        Trijsturis trijsturis2 = new Trijsturis();

        System.out.println(trijsturis2.laukums());
        System.out.println(trijsturis2.irVienadmalu(10,10,10));
        System.out.println(trijsturis2.irVienadSanu(5,8,5));
    }


}
