package models;

public class Fan {
    public final static int SLOW = 1;
    public final static int MEDIUM = 2;
    public final static int FAST = 3;

    private boolean on = false;
    private double radius = 5;
    private String color = "blue";
    private int speed = SLOW;

    public Fan(boolean on, double radius, String color, int speed) {
        this.on = on;
        this.radius = radius;
        this.color = color;
        this.speed = speed;
    }
    public Fan(){

    }

    public boolean getOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Status: " + getOn() + "\nspeed: " + getSpeed() + " \ncolor: " + getColor() + "\nradius: " + getRadius();
    }
}
