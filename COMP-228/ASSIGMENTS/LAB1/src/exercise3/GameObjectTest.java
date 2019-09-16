package exercise3;

import javax.swing.*;
import java.awt.*;

public class GameObjectTest {
    public static void main(String[] args) {
        int coordX;
        int coordY;
        int rotation;
        double velocity;
        boolean state;

        coordX = Integer.parseInt(JOptionPane.showInputDialog("X Coordinate?"));
        coordY = Integer.parseInt(JOptionPane.showInputDialog("Y Coordinate?"));
        rotation = Integer.parseInt(JOptionPane.showInputDialog("What is your rotation?"));
        velocity = Double.parseDouble(JOptionPane.showInputDialog("Your speed?"));
        state = Boolean.parseBoolean("Are you alive?");

        ObjectState objState = new ObjectState(state);
        Center center = new Center(coordX, coordY);

        GameObject gameObject = new GameObject();
    }
}
