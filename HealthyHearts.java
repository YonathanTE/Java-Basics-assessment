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
public class HealthyHearts {
    public static void main(String[] args) {
        // Declare variables
        // Scanner object to ask their age
        Scanner inputReader = new Scanner(System.in);                
        
        // All the code to execute the program
        System.out.println("What is your age?");
        
        // User variable to input an age
        String ageString = inputReader.nextLine();
        
        // Variable to take the object and convert it into an integer
        int ageInt = Integer.parseInt(ageString);
        
        // Variable to get the maximum heart rate (220 - age)
        int maxHeartRange = 220 - ageInt;
        String maxStr = Integer.toString(maxHeartRange);
        System.out.println("Your maximum heart rate should be " + maxStr + " beats per minute");
        
        // Variable to get the target heart rate zone (50% - 85% of the max)
        double trgtZoneMin = maxHeartRange/2;
        String trgtMin = Double.toString(trgtZoneMin);
        double trgtZoneMax = maxHeartRange*.85;
        
        String trgtMax = Double.toString(trgtZoneMax);
        System.out.println("Your target HR Zone is " + trgtMin + " - " + trgtMax + " beats per minute");
    }
}