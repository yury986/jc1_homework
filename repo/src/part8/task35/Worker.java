package part8.task35;

public class Worker extends TimeSalary{

    private String firstname;

    private String lastname;

    public Worker(String jobTitle, int costHour, int hours, String firstname, String lastname) {
        super(jobTitle, costHour, hours);
        this.firstname = firstname;
        this.lastname = lastname;
    }

    @Override
    public void Time() {
        System.out.println(super.getJobTitle() + " " + lastname  + " " +  firstname +  ":" + " to get " + super.getCostHour() * super.getHours() + " " + "rubles.");
    }

}
