package exercise2;

import java.util.Scanner;

public class GamerTesterDriver {
    public static void main(String[] args) {
        GameTester[] gameTesters = new GameTester[2];
        Scanner in = new Scanner(System.in);
        int hours;

        for (int i = 0; i < gameTesters.length; i++){
            System.out.println("Please, inform what type of Game Tester you want to include: PartTime (PT) or FullTime (FT)");
            String input = in.nextLine();
            if (input.equals("FT")) {
                System.out.println("Please, type the name of the FullTime Game Tester");
                input = in.nextLine();
                gameTesters[i] = new FullTimeGameTester(input);
                gameTesters[i].setSalaryBase();
            }
            else if (input.equals("PT")){
                System.out.println("Please, type the name of the PartTime Game Tester");
                input = in.nextLine();
                System.out.println("Now, enter the amount of hours for the Part Time Game Tester.");
                hours = Integer.parseInt(in.nextLine());
                gameTesters[i] = new PartTimeGameTester(input, hours);
                gameTesters[i].setSalaryBase();
            }
            else {
                System.out.println("Please, provide a valid game tester type");
                i--;
            }
        }

        displayGameTestersInfo(gameTesters);
    }

    public static void displayGameTestersInfo(GameTester[] gameTesters) {
        String msg;
        for (GameTester gm:gameTesters) {
            if (gm.isFullTime()) {
                msg = String.format("Informations about the FullTime Game Tester\n" +
                        "Name: %s\n" +
                        "Salary: %d",
                        gm.getGameTesterName(), gm.getSalary());
            }
            else {
                msg = String.format("Informations about the PartTime Game Tester\n" +
                        "Name: %s\n" +
                        "Salary: %d",
                        gm.getGameTesterName(), gm.getSalary());
            }
            System.out.println(msg);
        }
    }
}
