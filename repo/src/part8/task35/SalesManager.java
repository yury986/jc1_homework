package part8.task35;

public class SalesManager extends PercentSalary{

    private String firstname;

    private String lastname;

    public SalesManager(String jobTitle, int sum, int persent, String firstname, String lastname) {
        super(jobTitle, sum, persent);
        this.firstname = firstname;
        this.lastname = lastname;
    }

    @Override
    public void Percent() {
        System.out.println(super.getJobTitle() + " " + lastname + " " + firstname + ":" + " " + "to get" + " "
                + super.getSum() / 100 * super.getPersent() + " " + "rubles.");
    }
}
