package part8.task35;

public class TopSalesManager extends MixedSalary{

    private String firstname;

    private String lastname;

    public TopSalesManager(String jobTitle, int costHour, int hours, int sum, int persent, String firstname, String lastname) {
        super(jobTitle, costHour, hours, sum, persent);
        this.firstname = firstname;
        this.lastname = lastname;
    }

    @Override
    public void Mix() {
        System.out.println(super.getJobTitle() + " " + lastname + " " + firstname + ":" + " " + "to get" + " " + (super.getCostHour()*
                super.getHours() + super.getSum() / 100 * super.getPersent()) + " " + "rubles.");
    }
}
