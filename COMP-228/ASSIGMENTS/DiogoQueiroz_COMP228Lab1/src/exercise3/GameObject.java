package exercise3;

class GameObject {
    private Center center = new Center();
    private double velocity;
    private ObjectState state = new ObjectState();
    private int rotation;

    String getGameObjectInfo() {
        return String.format("" +
                        "GameObject position (%d,%d)\n" +
                        "Speed %.2f per second\n" +
                        "Rotation %d degrees\n" +
                        "and what are your state? %s",
                center.getX(), center.getY(),
                velocity, rotation,
                state.isAliveOrDead());
    }

    GameObject(Center center, double velocity, ObjectState state, int rotation) {
        this.center = center;
        this.velocity = velocity;
        this.state = state;
        this.rotation = rotation;
    }

    GameObject () {
        this.center = new Center();
        this.velocity = 0.0;
        this.state = new ObjectState(1);
        this.rotation = 0;
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
    int getX() {
        return X;
    }
    public void setX(int x) {
        X = x;
    }
    int getY() {
        return Y;
    }
    public void setY(int y) {
        Y = y;
    }
}

class ObjectState {
    private int state;

    ObjectState (int initialState) {
        state = initialState;
    }

    ObjectState () {
        state = 1;
    }

    private int isState() {
        return state;
    }
    String isAliveOrDead() {
        if (isState() != 1) {
            return "I'm Alive";
        }
        else {
            return "Oh no, I'm Dead.";
        }
    }
    public void Die() {
        this.state = 0;
    }
    public void Live() {
        this.state = 1;
    }
}
