package part8.task33;

public abstract class ConsumerElectronics extends Household {

    private int voltage;

    public ConsumerElectronics(String brandname, int voltage) {
        super(brandname);
        this.voltage = voltage;
    }
}
