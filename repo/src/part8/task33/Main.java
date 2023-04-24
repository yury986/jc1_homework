package part8.task33;

public class Main {
    public static void main(String[] args) {

        Fridge fridge = new Fridge("Samsung", 40, "RB33A3440WW/WT", 20);
        fridge.on();

        Iron iron = new Iron ("Vitek",1 , 100,2);
        iron.off();

        Radio radio = new Radio("Philips", 12);
        radio.on();

    }
}
