/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WileyEdge;
import java.util.*;
/**
 *
 * @author Yonathan
 */
public class SummativeSums {
    //List<Integer> array1 = new ArrayList<Integer> ();
    
    public static int addArray(int[] array1) {
        int elementSum = 0;
        // for loop to iterate & add the elements of the list
        for (int i = 0; i < array1.length; i++) {
            // Issue was the '=+'
            elementSum += array1[i];
       } // Unable to retrieve the 'elementSum' integer created
        return elementSum;
    }
    
    public static void main(String[] args) {
        // Question asking what the user would like to input into the array
        //System.out.println("What would you like to enter into the array?" + array1);
        // He's okay with a static array being used instead of an input from the scanner object
        int arrayExample[] = { 1, 90, -33, -55, 67, -16, 28, -55, 15 };
        // Converting the array1 into something useable is currently an issue here 
        System.out.println("Literal sum of the array: " + addArray(arrayExample));
        /* Goal here is to have the input received from the user and an output should appear since the function created earlier
        should do the work of adding the elements of the array    */
    }
}
