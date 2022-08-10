/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter2;

/**
 *
 * @author Sean
 */
public class Notes {
    public static void main(String[] args) {
        /*
        
        
Understanding Arrays

An array is a set of variables that is referenced by using a single variable name 
combined with an index number
Arrays have a type wich discribes what is in the array 
An int array can contain int
values, for example, and a String array can contain strings.
An array is itself an object
Arrays have a fixed lenght that was set when the array has been greated 
You can’t change the length of an array after you create the array.
You declare an array like this 
        String[] names;
now the array has been declared and the name of the array is names and the array takes
strings as an input 
Use the new keyword followed by the array type, this time with the brackets 
filled in to indicate how many elements the array can hold
    String[] names;
    names = new String[10];

 
       
        
        
Initializing an Array

One way to initialize the values in an array is to simply assign them one by one        
Here each element to be assigned to the array is listed in an array initializer. Here’s 
an example of an array initializer for an int array:
    int[] primes = { 2, 3, 5, 7, 11, 13, 17 };
There is an ulternative to this,
    int[] primes = new int[] { 2, 3, 5, 7, 11, 13, 17 };
To use this type of initializer, you use the new keyword followed by the array type 
and a set of empty brackets. Then you code the initializer.
        




Using for Loops with Arrays

One of the most common ways to process an array is with a for loop. In fact, for
loops were invented specifically to deal with arrays        
You can also use a for loop to print the contents of an array. For example:
    for (int i = 0; i < count; i++)
    System.out.println(players[i]);

        
        
Using Ebhanched For Loops
        
 When it’s used with an array, the enhanced for loop has this 
format:
for (type identifier : array)
{
Statements...
}
the type identifies the type of the elements in the array, and the identifier provides a name for a local variable 
that is used to access each element. array names 
the array you want to process.
String[] days = { "Sunday", "Monday", "Tuesday",
 "Wednesday", "Thursday",
 "Friday", "Saturday" };
for (String day : days)
{
 System.out.println(day);
}

                
Using Arrays with Methods

You can write methods that accept arrays as parameters and return arrays as 
return values

Using Two-Dimensional Arrays

The elements of an array can be any type of object you want, including another 
array.
Two-dimensional arrays are often used to track data in column-and-row format        
        
Creating a two-dimensional array

To declare a two-dimensional array for this sales data, you simply list two sets of 
empty brackets, like this
double sales[][];     
To create the array, you use the new keyword and provide lengths for each set of 
brackets, as in this example:
sales = new double[5][4];


Accessing two-dimensional array elements

To access the elements of a two-dimensional array, you use two indexes. This 
statement sets the 2004 sales for the North region:
sales[0][0] = 23853.0;        
        
        

        
Initializing a two-dimensional array

The technique for initializing arrays by coding the array element values in curly 
braces works for two-dimensional arrays too

Using jagged arrays
When you create an array with an expression such as new int[5][3], you’re 
specifying that each element of the main array is actually an array of type int.
if you create an array with ywo elements that are not the same that is called a jagged array 


Going beyond two dimensions

To declare an array with more 
than two dimensions, you just specify as many sets of empty brackets as you need. 
For example:
int[][][] threeD = new int[3][3][3];
You can also use multiple nested if statements to process an array with three or 
more dimensions.
        

Using the Arrays Class

The final topic for this chapter is the Arrays class, which provides a collection of 
static methods that are useful for working with arrays. The Arrays class is in the 
java.util package


        
Filling an array

The fill method can be handy if you want to prefill an array with values other 
than the default values for the array type. Here’s a routine that creates an array of 
integers and initializes each element to 100:
        int[] startValues = new int[10];
        Arrays.fill(startValues, 100);        

        
Copying an array

In Java 1.6, the Arrays class has some useful new methods. Using the new copyOf
and copyOfRange methods
Look at the copy demo,
The copyOfRange method is even more versatile. If you execute the instructions
        int arrayOriginal[] = {42, 55, 21, 16, 100, 88};
        int arrayNew[] = Arrays.copyOfRange(arrayOriginal, 2, 5);
        the values in arrayNew are
        21 16 100


Sorting an array
The sort method is a quick way to sort an array in sequence. These statements 
create an array with 100 random numbers and then sort the array in sequence so 
that the random numbers are in order:
        int[] lotto = new int[6];
        for (int i = 0; i < 6; i++)
         lotto[i] = (int)(Math.random() * 100) + 1;
        Arrays.sort(lotto);

        
        
        
Seariching an Array

You can search for a value within an array using a for loop or an if statement but yu ,ust use the 
binarySearchh method in doing so eg;
        int lucky = 13;
        int foundAt = Arrays.binarySearch(lotto, lucky);
        if (foundAt > -1)
         System.out.println("My number came up!");
        else
         System.out.println("I'm not lucky today.");


Comparing arrays
If you use the equality operator (==) to compare array variables, the array variables are considered to be equal only if both variables point to exactly the same 
array instance. To compare two arrays element by element, you should use the 
Arrays.equal method instead. For example:
            if (Arrays.equal(array1, array2))
             System.out.println("The arrays are equal!");
If the array has more than one dimension, you can use the deepEquals method 
instead.


Converting arrays to strings
The toString method of the Arrays class is handy if you want to quickly dump the 
contents of an array to the console to see what it contains
Using toString method,
        int[] lotto = new int[6];
        for (int i = 0; i < 6; i++)
         lotto[i] = (int)(Math.random() * 100) + 1;
        System.out.println(Arrays.toString(lotto));
ote that the toString method works only for one-dimensional arrays



        
        
        
        
        
        
        



        
        */
    }
}
