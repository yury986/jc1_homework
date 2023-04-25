package part8.task34;

public class Visa extends DebitCard{

    private String name;

    private String date;

    private String number;

    public Visa(String brand, String name, String date, String number) {
        super(brand);
        this.name = name;
        this.date = date;
        this.number = number;
    }


    @Override
    public void getDebitCard() {
        System.out.println("Карта"+" "+ super.getBrand()+" "+ " "+ "номер:"+ " "+number+ " " + "на имя"+" "+ name
                + " " + "сроком до" + " " + date+ " " + "года, c возможностью снятия наличных не превышая баланс.");
    }
}
