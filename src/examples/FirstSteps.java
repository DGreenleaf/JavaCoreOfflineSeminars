package examples;

public class FirstSteps {

    private int weight; // вес кота
    private String name; // имя кота
    private String color; //окрас кота

    //кот ест
    public void eat(){
        System.out.print("Eating...\n");
    }

    //кот спит
    public void sleep(){
        System.out.print("Sleeping zz-z-z-z...\n");
    }

    //кот говорит
    public String speak(String words){
        String phrase = words + "...mauu...\n";
        return phrase;
    }

}