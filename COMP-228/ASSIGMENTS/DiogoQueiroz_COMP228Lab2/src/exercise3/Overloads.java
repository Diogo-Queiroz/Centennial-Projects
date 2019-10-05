package exercise3;

import javax.swing.*;

class Main {
    public static void main(String[] args) {
        String withoutParam = Overloads.getFullName();
        JOptionPane.showMessageDialog(null, withoutParam);
    }
}


class Overloads {
    private static String firstName;
    private static String lastName;
    private int number;

    public static void setFullName() {
        firstName = "Standard";
        lastName = "O'Donnel";
    }

    public static void setFullName(String fName) {
        firstName = fName;
        lastName = "O'Donnel";
    }

    public static void setFullName(String fName, String lName) {
        firstName = fName;
        lastName = lName;
    }

    public static String getFullName() {
        return firstName + " " + lastName;
    }
}
