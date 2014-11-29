package Loops;

import java.util.Scanner;

/**
 * Created by AbidaS on 11/28/2014.
 */
public class UseLoop {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int [] theArray = new int[20];
        for (int i=0; i<5; i++){
            System.out.println("Enter "+i+" : ");
            theArray[i] = input.nextInt();

        }

        System.out.println("The Numbers are: ");
        for (int i=0;i<5; i++){
            System.out.println(theArray[i]);
        }


    }

}
