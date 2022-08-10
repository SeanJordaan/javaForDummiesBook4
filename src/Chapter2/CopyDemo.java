/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter2;

/**
 *
 * @author Sean
 */
import java.util.Arrays;

class CopyDemo {

    public static void main(String args[]) {
        int arrayOriginal[] = {42, 55, 21,54,96,82};// added a few numbers 
        int arrayNew[]
                = Arrays.copyOf(arrayOriginal, 3); //This is the line where you can change the number 3 to something smaller.
                                                   //it only coppies the first 3 elements within the array 
        printIntArray(arrayNew);
    }

    static void printIntArray(int arrayNew[]) {//method that prints the new arrauy out 
        for (int i : arrayNew) {
            System.out.print(i);
            System.out.print(' ');
        }
        System.out.println();
    }
}
