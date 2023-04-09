package part1.task26;

public class Main {
    public static void main(String[] args) {
        Atm atm = new Atm (1000,1000,1000);
        System.out.println(atm.addMoney());
        atm.takeMoney();
    }
}
