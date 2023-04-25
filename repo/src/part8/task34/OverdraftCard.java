package part8.task34;

public abstract class OverdraftCard  extends BankCards{

    public OverdraftCard(String brand) {
        super(brand);
    }

    public abstract void getOverdraftCard();

}
