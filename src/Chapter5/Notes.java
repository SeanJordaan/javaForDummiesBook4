/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter5;

/**
 *
 * @author Sean
 */
public class Notes {/*
    
Creating Generic Collection Classes    
    
Why Generics? Before Java 1.5, collection classes could hold any type of object    
Thus, you could pass any type of object to the add method — and the array list 
gladly accepted it    
    
    
Creating a Generic Class

Generics let you create classes that can be used for any type
specified by the programmer at compile time   
For example, here’s a simplified version of the class declaration for the Array
List class:
    public class ArrayList<E>   
   
    
A Generic Stack Class 

It has 5 methods, 
    1)push: This method adds an object to the top of the stack.
    2)pop: This method retrieves the top item from the stack.
    3)peek: This method lets you peek at the top item on the stack. In other words, 
      it returns the top item without removing it
    4)hasItems: This method returns a boolean value of true if the stack has at 
      least one item in it.
    5)size: This method returns an int value that indicates how many items are in 
      the stack
stacks are sometimes called Last-In, First-Out lists, or LIFO lists, 
  

    
Using Wildcard-Type Parameters 
    
Here the wildcard type parameter <? extends E> simply means that the Array
List can be of type E or any type that extends E    

A Generic Queue Class
    
Queues are commonly used in all sorts of applications, from data processing 
applications to sophisticated networking systems    
Queues have 5 methods,
    1)enqueue: This method adds an object to the end of the queue
    2)dequeue: This method retrieves the first item from the queue
    3)hasItems: This method returns a boolean value of true if the queue has at 
      least one item in it.
    4)size: This method returns an int value that indicates how many items are in 
      the stack.
    5)addItems: This method accepts another GenQueue object as a parameter
The GenQueue class uses a LinkedList to implement its queue    
    
    
Using the Diamond Operator

One of the more annoying things about working with generics is that you have to 
specify the types twice when you create a variable of a generic type, and then use 
the constructor to instantiate an object    
Java 7 introduced a new feature called the diamond operator that lets you skip the 
type when you call the constructor, like this:
    ArrayList<String> nums = new ArrayList<>();
Here’s another example:
    ArrayList<String> nums;
    nums = new ArrayList<>();
The diamond operator simply deduces the correct type based on the variable’s 
type.    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    */
    
}
