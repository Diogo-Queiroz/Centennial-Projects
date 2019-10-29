package exercise2;

abstract class GameTester {
    // Private attributes
    private final String gameTesterName;
    private final boolean isFullTime;

    // Constructor
    GameTester (String name, boolean isFullTime) {
        this.gameTesterName = name;
        this.isFullTime = isFullTime;
    }

    // Getter and Setter methods
    String getGameTesterName() { return gameTesterName; }
    boolean isFullTime() { return isFullTime; }
    abstract void setSalaryBase();
    abstract int getSalary();
}