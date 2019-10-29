package exercise2;

class PartTimeGameTester extends GameTester {
    // Private attributes
    private int salaryPerHour;
    private int hoursWorked;

    // Constructor
    PartTimeGameTester (String name, int hoursWorked) {
        super(name, false);
        this.hoursWorked = hoursWorked;
    }

    // Override methods
    @Override
    void setSalaryBase() { this.salaryPerHour = 20; }
    public int getSalary() { return salaryPerHour * hoursWorked; }

}
