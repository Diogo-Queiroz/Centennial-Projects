package exercise2;

abstract class GameTester {
    protected String gameTesterName;
    protected boolean isFullTime;

    GameTester (String name, boolean isFullTime) {
        this.gameTesterName = name;
        this.isFullTime = isFullTime;
    }

    public String getGameTesterName() { return gameTesterName; }
    public boolean isFullTime() { return isFullTime; }
    abstract void setSalaryBase();
    abstract int getSalary();
}

class FullTimeGameTester extends GameTester {
    private int salaryBase;

    FullTimeGameTester (String name) { super(name, true); }

    @Override
    void setSalaryBase() { this.salaryBase = 3000; }
    public int getSalary() { return salaryBase; }
}

class PartTimeGameTester extends GameTester {
    private int salaryPerHour;
    private int hoursWorked;

    PartTimeGameTester (String name, int hoursWorked) {
        super(name, false);
        this.hoursWorked = hoursWorked;
    }

    @Override
    void setSalaryBase() { this.salaryPerHour = 20; }
    public int getSalary() { return salaryPerHour * hoursWorked; }

}
