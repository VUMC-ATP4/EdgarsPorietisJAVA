package clasroomFive.inheritance;

public class Example {
    public static void main(String[] args) {
        Dog dog1 = new Dog(4, "Reksis");
        Octopus octopus1 = new Octopus(8, "Astoņkājs");
        Chicken chicken1 = new Chicken(2, "Baltā vista");

        dog1.printLegCount();
        octopus1.printLegCount();


        System.out.println(octopus1.waterType);
        octopus1.printWaterType();

        Fox lapsa = new Fox("Kūmiņš",4);


        Animal[] dzivnieki = {dog1, octopus1, chicken1};

        for (int i = 0; i< dzivnieki.length; i++){
            dzivnieki[i].printLegCount();
        }
        dog1.makeSound();
        chicken1.makeSound();
        octopus1.makeSound();

    }



}
