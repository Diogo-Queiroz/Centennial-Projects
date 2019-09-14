import javax.swing.JOptionPane;
import java.util.Scanner;

class AccountExec {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Account myAccount = new Account();

        System.out.println("Please, fulfill your name:");
        //String theName = input.nextLine();
        String theName = JOptionPane.showInputDialog("What's your name??");
        String message = String.format("Thank you %s, please fell free to ask me anything.", theName);
        myAccount.setName(theName);

        JOptionPane.showMessageDialog(null, message);
        System.out.printf("The name of the Account is %s%n", myAccount.getName());
    }
}

public class Account {
    private String Name;

    void setName(String name) {
        this.Name = name;
    }

    String getName() {
        return this.Name;
    }
}
