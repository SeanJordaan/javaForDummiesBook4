/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter2;

/**
 *
 * @author Sean
 */
public class BoboAndTheLockers {

    public static void main(String[] args) {
        // true = open; false = closed
        boolean[] lockers = new boolean[1001];// This line sets up an array of booleans with 1,001 elements
        // close all the lockers
        for (int i = 1; i <= 1000; i++)//This for loop closes all the lockers
        {
            lockers[i] = false;
        }
        for (int skip = 1; skip <= 1000; skip++) //  Every iteration of this loop represents one complete trip through the 
                                                 //hallways opening and closing lockers. The skip variable represents how 
                                                 //many lockers Bobo skips on each trip.
        {
            System.out.println("Bobo is changing every "
                    + skip + " lockers.");
            for (int locker = skip; locker < 1000; //This third expression in the for statement  adds the skip variable to the index variable
                    locker += skip) {
                lockers[locker] = !lockers[locker]; //This statement uses the not operator (!) to reverse the setting of each 
                                                    //locker within the array of lockers 
            }
        }
        System.out.println("Bobo is bored"
                + " now so he's going home.");
        // count and list the open lockers
        String list = "";
        int openCount = 0;
        for (int i = 1; i <= 1000; i++) //    Yet another for loop spins through all the lockers and counts the ones 
                                        //that are open. 
        {
            if (lockers[i]) {
                openCount++;
                list += i + " ";
            }
        }
        System.out.println("Bobo left " + openCount
                + " lockers open.");
        System.out.println("The open lockers are: "
                + list);
    }
}
