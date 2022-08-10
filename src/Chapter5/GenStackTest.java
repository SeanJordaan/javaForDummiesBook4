/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter5;

/**
 *
 * @author Sean
 *
 * this class is to see if the genStack class is working
 */
public class GenStackTest {

    public static void main(String[] args) {
        GenStack<String> gs = new GenStack<String>();
        System.out.println(
                "Pushing four items onto the stack.");
        gs.push("One");
        gs.push("Two");
        gs.push("Three");
        gs.push("Four");//This program creates a GenStack object that can hold String objects. It then 
                        //pushes four strings onto the stack and prints the number of items in the stack
        System.out.println("There are "
                + gs.size() + " items in the stack.\n");
        System.out.println("The top item is: "
                + gs.peek() + "\n");
        System.out.println("There are still "
                + gs.size() + " items in the stack.\n");
        System.out.println("Popping everything:");
        while (gs.hasItems()) {
            System.out.println(gs.pop());
        }
        System.out.println("There are now "
                + gs.size() + " items in the stack.\n");
        System.out.println("The top item is: "
                + gs.peek() + "\n");
    }
}
