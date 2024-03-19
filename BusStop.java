/*
 * Write your program inside the main method to find the order
 * which the bus the student needs to take will arrive
 * according to the assignemnt description. 
 *
 * To compile:
 *        javac BusStop.java
 * 
 * DO NOT change the class name
 * DO NOT use System.exit()
 * DO NOT change add import statements
 * DO NOT add project statement
 * 
 */

        /* INSTRUCTIONS TO SOLVE THE PROBLEM:

        - Read the n-1 characters that are given by the user.
        (this can be done with a for loop and then save those values in an array)

        - then, read the last character and search for that character in the array.
        (by comparing it with a .equals() method)

        - if there is a match, print the position, not the index, where that character is in the array.

        - if not, print -1.
        */

public class BusStop {

    public static void main(String[] args) {

        // WRITE YOUR CODE HERE
        char [] busChar = new char[args.length];

        int position = -1; // position initialized at -1 in case the char is not found.
        char last_char = args[args.length - 1].charAt(0); // save the last char in a variable.
        for (int each_char = 0; each_char < args.length-1; each_char++){ // loop through the n-1 chars given by the user.
            
            busChar[each_char] = args[each_char].charAt(0); // save the n-1 chars in this array.
            
            if (busChar[each_char] == last_char){ // check if the last char matches one of the n - 1 chars.                 
                position = each_char + 1; // update position if the last char is found in the array. 
                break; // stop the loop
            }
        }
        System.out.println(position); // print the position of the char.



    }
}
