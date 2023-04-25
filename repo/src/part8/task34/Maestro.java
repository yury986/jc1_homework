package part8.task34;

public class Maestro extends OverdraftCard {

    private String name;

    private String date;

    private String number;

    public Maestro(String brand, String name, String date, String number) {
        super(brand);
        this.name = name;
        this.date = date;
        this.number = number;
    }


    @Override
    public void getOverdraftCard() {
        System.out.println("Карта"+" "+ super.getBrand()+" "+ " "+ "номер:"+ " "+number+ " " + "на имя"+" "+ name
                + " " + "сроком до" + " " + date+ " " + "года, c возможностью снятия наличных с отридцательным балансом в кредит.");
    }
}
