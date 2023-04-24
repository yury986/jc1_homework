package part8.task33;

public class Radio extends ConsumerElectronics {


    public Radio(String brandname, int voltage) {

        super(brandname, voltage);
    }

    @Override
    public void on() {
        System.out.println("Radio" + " " + brandname + " "  + "is turned on");
    }

    @Override
    public void off() {
        System.out.println("Radio" + " " + brandname + "is turned off");
    }
}
