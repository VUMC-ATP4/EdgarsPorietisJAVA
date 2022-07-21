package clasroomFive.encapsulation;



public class Main {
    public static void main(String[] args) {
        Bird putns = new Bird();
        putns.setKrasa("Zila");
        System.out.println(putns.getKrasa());
//        putns.colour = "Zila"; ja nebūtu uztaisījuši setter Bird clasē
//        putns.name = "Pollija"; // nevar izmantot, izmainit jo private
        putns.printText();
        putns.defaultMethodExample();

    Human cilveks = new Human();
    cilveks.setAge(20);
    cilveks.setName("Edgars");
    cilveks.setSurname("Porietis");
    cilveks.setHeight(1.75);
        System.out.println(cilveks.getAge());
        System.out.println(cilveks.getName());
        System.out.println(cilveks.getSurname());
        System.out.println(cilveks.getHeight());
        Matematika matematika = new Matematika();
        matematika.add(30,20);
        matematika.add(1.3, 3.5);
        System.out.println(matematika.add(30,20));
        System.out.println(matematika.add(1.3,3.5));
        matematika.paraditTekstu("Edgars");
        matematika.paraditTekstu("Edgars",true);
        matematika.paraditTekstu("Anna",false);
    }
}