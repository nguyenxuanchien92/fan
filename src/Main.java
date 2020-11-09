import models.Fan;

public class Main {
    public static void main(String[] args) {

        Fan fan1 = new Fan(true, 10, "yellow", Fan.FAST);
        System.out.println("Fan 1 \n" + fan1.toString() + "\n");

        Fan fan2 = new Fan();
        fan2.setSpeed(Fan.MEDIUM);
        System.out.println("Fan 2 \n" + fan2.toString());
    }
}
