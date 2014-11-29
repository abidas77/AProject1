package oop;

/**
 * Created by AbidaS on 11/28/2014.
 */

public class Toyota extends MotorVehicle implements Car {

    public Toyota(int speed) {
        super.setSpeed(speed);
    }
    public void echo() {
        System.out.println("This is a Toyota");
    }

    public void run() {
        System.out.println("It's running at " + getSpeed() + " km/h");
    }
    public void stop() {
        setSpeed(0);
        System.out.println("It stops "
                + "\nThe current speed is " + getSpeed() + " km/h");
    }

}
