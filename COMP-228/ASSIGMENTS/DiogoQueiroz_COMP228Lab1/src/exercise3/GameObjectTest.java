package exercise3;

import javax.swing.JOptionPane;

public class GameObjectTest {
    public static void main(String[] args) {
        int coordX;
        int coordY;
        int rotation;
        double velocity;
        int state;

        coordX = Integer.parseInt(JOptionPane.showInputDialog("X Coordinate?"));
        coordY = Integer.parseInt(JOptionPane.showInputDialog("Y Coordinate?"));
        rotation = Integer.parseInt(JOptionPane.showInputDialog("What is your rotation?"));
        velocity = Double.parseDouble(JOptionPane.showInputDialog("Your speed?"));
        state = JOptionPane.showConfirmDialog(null, "Are you alive?");

        ObjectState objState = new ObjectState(state);
        Center center = new Center(coordX, coordY);

        GameObject gameObject = new GameObject(center, velocity, objState, rotation);

        JOptionPane.showMessageDialog(null, gameObject.getGameObjectInfo());
    }
}
