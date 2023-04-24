package part8.task33;

public class Fridge extends LargeHousehold{

    private String model;

    private int power;


    public Fridge(String brandname, int weight,  String model, int power) {
        super(brandname, weight);
        this.model = model;
        this.power = power;
    }

    @Override
    public void on() {
        System.out.println("Fridge" + " " + brandname + " " + "model:" + model  +  " " + "is turned on.");

    }

    @Override
    public void off() {
        System.out.println("Fridge" + " " + brandname + " " + "model: " + model + " " + "is turned off.");

    }
}
