package exercise2;

class FullTimeGameTester extends GameTester {
    // Private attributes
    private int salaryBase;

    // Constructor
    FullTimeGameTester (String name) { super(name, true); }

    // Override methods
    @Override
    void setSalaryBase() { this.salaryBase = 3000; }
    public int getSalary() { return salaryBase; }
}
