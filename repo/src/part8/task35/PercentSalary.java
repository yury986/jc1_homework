package part8.task35;

public abstract class PercentSalary extends Salary {

    private int sum;

    private int persent;

    public PercentSalary(String jobTitle, int sum, int persent) {
        super(jobTitle);
        this.sum = sum;
        this.persent = persent;
    }

    public int getSum() {
        return sum;
    }

    public int getPersent() {
        return persent;
    }

    public abstract void Percent();

}
