package part8.task33;

public abstract class Household {

    protected String brandname;
    public Household(String brandname) {
        this.brandname = brandname;
    }


    public abstract void on ();

    public abstract void off ();


}
