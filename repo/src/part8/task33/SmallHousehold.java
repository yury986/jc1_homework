package part8.task33;

public abstract class SmallHousehold extends Household{

    private int weight;

    public SmallHousehold(String brandname, int weight) {
        super(brandname);
        this.weight = weight;
    }
}
