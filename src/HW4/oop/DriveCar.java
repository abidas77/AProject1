package oop;

/**
 * Created by AbidaS on 11/28/2014.
 */
public class DriveCar {

    public static void main(String[] args){

        Toyota c = new Toyota(15);
        c.echo();
        c.run();
        System.out.println("");
        System.out.println("The Car starts to move again");
        c.setSpeed(1000);
        c.run();
        c.stop();

    }
}
