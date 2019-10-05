package exercise2;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            Lotto lotto = new Lotto();
            int input = Integer.parseInt(JOptionPane.showInputDialog(null, "Choose a number between 3 and 27"));
            if (input == lotto.getTotalSumOfLottoValues()) {
                String message = String.format("Nicely done, you got it right\nYour guess: %d\nLotto number: %d", input, lotto.getTotalSumOfLottoValues());
                JOptionPane.showMessageDialog(null, message);
                break;
            } else {
                String message = String.format("Ohhh, that's bad, you didn't get it right, keep trying!\nYour guess: %d\nLotto number: %d", input, lotto.getTotalSumOfLottoValues());
                JOptionPane.showMessageDialog(null, message);
            }
        }
    }
}
