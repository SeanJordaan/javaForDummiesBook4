/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter5;

/**
 *
 * @author Sean
 */
import java.util.*;

public class GenStack<E>// The class declaration specifies the formal type parameter <E>. Thus 
                        // users of this class can specify the type for the stack’s elements.
{

    private LinkedList<E> list = new LinkedList<E>();// This class uses a private LinkedList object list to keep the items stored 
                                                     // in the stack

    public void push(E item)// The push method accepts a parameter of type E. It uses the linked list’s 
                            // addFirst method to add the item to the beginning of the list
    {
        list.addFirst(item);
    }

    public E pop()// The pop method returns a value of type E
    {
        return list.poll();// It uses the linked list’s poll
                           // method, which removes and returns the first element in the linked list.
    }

    public E peek()// The peek method also returns a value of type E. It simply returns the 
                   // result of the linked list’s peek method.(it returns the top item without removing it)
    {
        return list.peek();
    }

    public boolean hasItems()// The hasItems method returns the opposite of the linked list’s isEmpty method
    {
        return !list.isEmpty();
    }

    public int size()// The size method simply returns the result of the linked list’s size method.
    {
        return list.size();
    }
}
