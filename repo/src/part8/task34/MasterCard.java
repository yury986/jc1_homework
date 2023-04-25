package part8.task34;

public class MasterCard extends CreditCard{

    private String name;

    private String date;

    private String number;

    public MasterCard(String brand, String name, String date, String number) {
        super(brand);
        this.name = name;
        this.date = date;
        this.number = number;
    }


    @Override
    public void getCreditCard() {
        System.out.println("Карта"+" "+ super.getBrand()+" "+ " "+ "номер:"+ " "+number+ " " + "на имя"+" "+ name
                + " " + "сроком до" + " " + date+ " " + "года, c возможностью снятия наличных в кредит.");
    }
}
