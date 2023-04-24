package part8.task35;

public abstract class MixedSalary extends Salary {

    private int costHour;

    private int hours;

    private int sum;

    private int persent;

    public MixedSalary(String jobTitle, int costHour, int hours, int sum, int persent) {
        super(jobTitle);
        this.costHour = costHour;
        this.hours = hours;
        this.sum = sum;
        this.persent = persent;
    }

    public int getCostHour() {
        return costHour;
    }

    public int getHours() {
        return hours;
    }

    public int getSum() {
        return sum;
    }

    public int getPersent() {
        return persent;
    }

    public abstract void Mix();

}
