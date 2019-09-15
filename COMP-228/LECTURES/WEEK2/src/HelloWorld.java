import java.awt.*;
import java.util.Scanner;
import javax.swing.JOptionPane;

class HelloWorld {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Hello worlds!!");

        Student Diogo = new Student();
        Diogo.setName("Diogo Queiroz");
        Diogo.setId(1);

        Student Lucas = new Student();
        Lucas.setName("Lucas Bitten");
        Lucas.setId(2);

        Student Bernardo = new Student();
        Bernardo.setName("Bernardo Castro");
        Bernardo.setId(3);

        System.out.printf("The Student ID %d and Name %s%n", Diogo.getId(), Diogo.getName());
        System.out.printf("The Student ID %d and Name %s%n", Lucas.getId(), Lucas.getName());
        System.out.printf("The Student ID %d and Name %s%n", Bernardo.getId(), Bernardo.getName());

        String name = JOptionPane.showInputDialog("Student name");
        String course = JOptionPane.showInputDialog("Course name?");
        String strId = JOptionPane.showInputDialog("Student Id?");
        String strBal = JOptionPane.showInputDialog("Student balance? ");

        int id = Integer.parseInt(strId);
        double bal = Double.parseDouble(strBal);

        Student st1 = new Student(name, id, course, bal);

        String message = String.format("NAME {%s], COURSE {%s], ID [%d], BALANCE [%.2f]", st1.getName(), st1.getCourseId(), st1.getId(), st1.getBalance());

        JOptionPane.showMessageDialog(null, message);

        System.out.println("this is the first greeting");

        /*int num1;
        int num2;
        int num3;
        int result;

        System.out.println("Enter the first number");
        num1 = input.nextInt();

        System.out.println("Enter the second number");
        num2 = input.nextInt();

        System.out.println("Enter the third number");
        num3 = input.nextInt();

        result = num1 + num2 + num3;
        System.out.printf("The sum is %d%n", result);*/
    }
}

class Student {
    // Privates variables and/or methods
    private String name;
    private int id;
    private double balance;
    private String courseId;

    Student (String str, int inid, String cid, double bal) {
        id = inid;
        name = str;
        courseId = cid;
        balance = bal;
    }

    Student () {
        id = 0;
        name = "";
    }

    private int encryptId() {
        int seed = id+100;
        return seed;
    }

    // Setters
    void setBalance(double balance) {
        this.balance = balance;
    }
    void setCourseId(String courseId) {
        this.courseId = courseId;
    }
    void setName(String name) {
        this.name = name;
    }
    void setId(int id) {
        int temp = 10;
        this.id = id+temp;
    }

    // Getters
    double getBalance() { return balance; }
    String getCourseId() { return courseId; }
    String getName() { return name; }
    int getId() {
        int idEncrypted = encryptId();
        return idEncrypted;
    }
}