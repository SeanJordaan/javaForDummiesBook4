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

public class GenQueue<E>// The class declaration specifies the formal type parameter <E>.
{

    private LinkedList<E> list = new LinkedList<E>();// this class uses a private LinkedList object list 
                                                    //to keep its items

    public void enqueue(E item) //The enqueue method accepts a parameter of type E
    {
        list.addLast(item);
    }

    public E dequeue() //The dequeue method returns a value of type E
    {
        return list.poll();
    }

    public boolean hasItems() // The hasItems method returns the opposite of the linked list’s isEmpty
    //method
    {
        return !list.isEmpty();
    }

    public int size()//The size method returns the result of the linked list’s size method
    {
        return list.size();
    }

    public void addItems(GenQueue<? extends E> q) //The addItems method accepts a parameter that must be another 
                                                 //GenQueue object whose element type is either the same type
    {
        while (q.hasItems()) {
            list.addLast(q.dequeue());
        }
    }
}
