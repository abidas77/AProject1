package oop;

/**
 * Created by AbidaS on 11/28/2014.
 */
public abstract class MotorVehicle {

    private int speed;

    public MotorVehicle (){
    }

    public int getSpeed(){
        return speed;
    }

    public void setSpeed(int speed){
        this.speed = speed;
    }
    public abstract void echo();
}
