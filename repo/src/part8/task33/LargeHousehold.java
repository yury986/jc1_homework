package part8.task33;

public abstract class LargeHousehold extends Household{

    private int weight;

    public LargeHousehold(String brandname, int weight) {
        super(brandname);
        this.weight = weight;
    }
}
