package classroomFour;

public class Rinkis {
    double PI = 3.14;
    double radiuss = 4;

    public double rinkaLaukums(){
        return PI * (radiuss*radiuss);
    }
    Rinkis(){
        System.out.println("Veidoju rinķi....");
    }

    Rinkis(double radiuss){
        this.radiuss = radiuss;
    }

    public double diametrs(){
        return radiuss * 2;
    }


}
