/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter1;

/**
 *
 * @author Sean
 */
public class Notes {

    public static void main(String[] args) {
        /*
    Working with strings
    
    Strings are reference types, not value types, such as int or boolean
     eg of a string is it must be in a method to compile*/
        String myString = "This is a string";
        System.out.println(myString);
        /*
    Using the String Class
        
    The String class is the class you use to create string objects. It has a whole gaggle 
    of methods that are designed to let you find out information about the string 
    that’s represented by the String class.
    A String object is immutable, which means that it can’t be 
    changed.
    
    Finding the length of a string
    One of the most basic string operations is determining the length of a string. You 
    do that with the length method*/
    String s = "This is a String";
    int len = s.length();
    /*
    Making simple string modifications
Several of the methods of the String class return modified versions of the original 
string. toLowerCase, for example, converts a string to all-lowercase letters: */
String s1 = "Oompa Loompa";
String s2 = s1.toLowerCase();
    /*
the code above will display everything in lowercase and you also get a uppercase veriation of this. 
with that being said you can also use a trim expretion wich means that the unnesacery lines and spaces will be removed from the string.
" Oompa Loompa    "
will then Just be displayed as "Oompa Loompa"
one must remember to do return statements 
if we just say s2.trim(); nothig with happen but if we say s = s2.trim(); now we are cooking;




Extracting characters from a string

You can use the charAt method to extract a character from a specific position in a 
string
See public class CountVowels(the class in the package) 
it shows how a string extracton works and how vowels can be extracted from the string
    


Extracting substrings from a string

extracts a part of a string thats all it can be indicated like this 
String s = "Baseball";
String b = s.substring(2, 6); // "seba"
the above indicates a start and end point for the extraction 


Splitting a string

The split command is especially useful for splitting a string into separate strings 
based on a delimiter character. Suppose you have a string with the parts of an 
address separated by colons, like this:
1500 N. Third Street:Fresno:CA:93722
With the split method, you can easily separate this string into four strings. In the 
process, the colons are discarded
The split method carves a string into an array of strings
a split looks like this 
String address =
 "1500 N. Third Street:Fresno:CA:93722";
String[] parts = address.split(":");
for (int i = 0; i < parts.length; i++)
 System.out.println(parts[i]);
and the output....
1500 N. Third Street
Fresno
CA
93722
look at list of words class to see wht the "\\s+" splitter does 




Replacing parts of a string

You can use the replaceFirst or replaceAll method to replace a part of a string 
that matches a pattern you supply with some other text





Using the StringBuilder and StringBuffer Classes



The StringBuilder and StringBuffer classes are mirror images. Both have the 
same methods and perform the same string manipulations. The only difference 
is that whereas the StringBuffer class is safe to use in applications that work 
with multiple threads, StringBuilder is not safe for threaded applications but is 
more efficient than StringBuffer. As a result, you should use the StringBuilder
class unless your application uses threads


Creating a StringBuilder object

You can’t assign string literals directly to a StringBuilder object, as you can 
with a String object. The StringBuilder class, however, has a constructor that 
accepts a String as a parameter
StringBuilder sb = new StringBuilder("Today is the day!");
Internally, a StringBuilder object maintains a fixed area of memory where it 
stores a string value

Using the CharSequence Interface

The Java API includes a useful interface called CharSequence. All three of 
the classes discussed in this chapter  — String, StringBuilder, and StringBuffer
the CharSequence interface defines four methods:
char charAt(int): Returns the character at the specified position
int length(): Returns the length of the sequence
subSequence(int start, int end): Returns the substring indicated by the start and end parameters.
toString(): Returns a String representation of the sequence
If you’re inclined to use CharSequence as a parameter type for a method so that 
the method works with a String, StringBuilder, or StringBuffer object, be 
advised that you can use only these four methods.















































    
         */
    }

}
