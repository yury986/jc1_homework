package part8.task33;

public class Iron extends SmallHousehold {

    private int temperature;

    private int power;

    public Iron(String brandname, int weight,  int temperature, int power) {
        super(brandname, weight);
        this.temperature = temperature;
        this.power = power;
    }

    @Override
    public void on() {
        System.out.println("Iron" + " " + brandname  +  " " + "is turned on");
    }

    @Override
    public void off() {
        System.out.println("Iron" + " " + brandname  + " " + "is turned off");
    }
}
