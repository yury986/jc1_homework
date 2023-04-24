package part8.task35;

public class Main {
    public static void main(String[] args) {
        Worker worker = new Worker("Worker", 8, 165, "Ivan", "Ivanov" );

        worker.Time();

        SalesManager salesManager = new SalesManager("Sales manager", 6000, 40, "Sergey", "Sidorov");

        salesManager.Percent();

        TopSalesManager topSalesManager = new TopSalesManager("Top sales manager",12,168,6000,60
        ,"Evgeniy Ivanovich", "Petrov");

        topSalesManager.Mix();
    }
}
