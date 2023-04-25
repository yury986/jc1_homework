package part8.task34;

public class Main {

    public static void main(String[] args) {

        Visa visa = new Visa("Visa Classic","Иванов Иван", "04.2025", "2365 4785 6985 2365");
        visa.getDebitCard();

        Maestro maestro = new Maestro("Maestro Platinum", "Петров Петр","03.2026", "8547 2365 2569 8745" );
        maestro.getOverdraftCard();

        MasterCard masterCard = new MasterCard("MasterCarg Gold", "Сергеев Сергей", "08.2024", "7458 9658 6523 2541" );
        masterCard.getCreditCard();
    }
}
