package clasroomFive.encapsulation;

public class Bird {

    private String name;
    private String colour;
public void setKrasa(String krasa) {
    this.colour = krasa;
}
public String getKrasa(){
    return colour;
    }

//   varam piekļūt no citām klasēm
    public void printText(){
        System.out.println("Šī ir publiska metode");
        System.out.println("Printēju putni");
        printTextSpecial();
    }
//    varam piekļūt tikai no šīs klases
    private void printTextSpecial(){
        System.out.println("Šī ir privāte metode");
    }

//    varam piekļūt tikai pakotnes ietvaros
void defaultMethodExample(){
    System.out.println("Šī ir default metode");
}

}
