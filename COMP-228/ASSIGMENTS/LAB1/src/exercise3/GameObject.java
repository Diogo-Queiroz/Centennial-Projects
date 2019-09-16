package exercise3;

import javax.swing.*;

public class GameObject {
    private int x;
    private int y;
    private Center center = new Center();
    private double velocity;
    private ObjectState state = new ObjectState();
    private int rotation;

    public void getGameObjectInfo() {
        String message = String.format("GameObject position (%d,%d) , Speed %.2f per second, Rotation %d, and what are your state? %s",
                center.getX(), center.getY(),
                velocity, rotation,
                state.isAliveOrDead());
        JOptionPane.showMessageDialog(null, message);
    }

    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }
    public Center getCenter() {
        return center;
    }
    public void setCenter(Center center) {
        this.center = center;
    }
    public double getVelocity() {
        return velocity;
    }
    public void setVelocity(double velocity) {
        this.velocity = velocity;
    }
    public ObjectState getState() {
        return state;
    }
    public void setState(ObjectState state) {
        this.state = state;
    }
    public int getRotation() {
        return rotation;
    }
    public void setRotation(int rotation) {
        this.rotation = rotation;
    }
}

class Center {
    private int X;
    private int Y;

    Center(int x, int y) {
        X = x;
        Y = y;
    }

    Center() {
        X = 0;
        Y = 0;
    }

    // Getters and Setters
    public int getX() {
        return X;
    }
    public void setX(int x) {
        X = x;
    }
    public int getY() {
        return Y;
    }
    public void setY(int y) {
        Y = y;
    }
}

class ObjectState {
    private boolean state;

    ObjectState (boolean initialState) {
        state = initialState;
    }

    ObjectState () {
        state = true;
    }

    private boolean isState() {
        return state;
    }
    public String isAliveOrDead() {
        if (isState()) {
            return "I'm Alive";
        }
        else {
            return "Oh no, I'm Dead.";
        }
    }
    public void Die() {
        this.state = false;
    }
    public void Live() {
        this.state = true;
    }
}
