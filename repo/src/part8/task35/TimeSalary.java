package part8.task35;

public abstract class TimeSalary extends Salary {

    private int costHour;

    private int hours;

    public TimeSalary(String jobTitle, int costHour, int hours) {
        super(jobTitle);
        this.costHour = costHour;
        this.hours = hours;
    }

    public int getCostHour() {
        return costHour;
    }

    public int getHours() {
        return hours;
    }

    public abstract void Time();
}
