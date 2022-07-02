package WileyEdge;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
/**
 *
 * @author Yonathan
 */
// Goal is to solve the program within 100 lines 
public class DogGenetics {
   public static void main(String[] args) {
       // Declare variables
       // Scanner object when the question is asked
       Scanner inputReader = new Scanner(System.in);
       // Object
       String dogName;
       // Random object to make random numbers & to select random DNA backgrounds with
       Random rnd = new Random();

       // Array of options for the dog breeds (Minimum of 8 dog breeds so there's a variety)
       List<String> strList = new ArrayList<>();
       strList.add("Beagle");
       strList.add("Corgi");
       strList.add("Bulldog");
       strList.add("Poodle");
       strList.add("Terrier");
       strList.add("Boxer");
       strList.add("Pug");
       strList.add("Great Dane");
       

           double randomNumb1 = rnd.nextDouble() * (29 - -1) + - 1;
           double randomNumb2 = rnd.nextDouble() * (29 - -1) + - 1;
           double randomNumb3 = rnd.nextDouble() * (29 - -1) + - 1;
           double randomNumb4 = rnd.nextDouble() * (29 - -1) + - 1;
       
           // To limit the array to pulling 5 breeds only & remove the breeds used
           String randomBreed1 = strList.get(rnd.nextInt(strList.size()));
           strList.remove(randomBreed1);
           String randomBreed2 = strList.get(rnd.nextInt(strList.size()));
           strList.remove(randomBreed2);
           String randomBreed3 =  strList.get(rnd.nextInt(strList.size()));
           strList.remove(randomBreed3);
           String randomBreed4 =  strList.get(rnd.nextInt(strList.size()));
           strList.remove(randomBreed4);
           String randomBreed5 =  strList.get(rnd.nextInt(strList.size()));
           strList.remove(randomBreed5);
        // Generate 4 random #'s and after take the sum of the 4 to have it subtrated and that will provide the 5th number
        double randomNumSum = randomNumb1 + randomNumb2 + randomNumb3 + randomNumb4;
        
        double fifthNumb = 100 - randomNumSum;
        // Question to start the program
        System.out.println("What is your dog's name?");
        dogName = inputReader.nextLine();
         // Getting an issue limiting the range so that the random #'s HAVE to equal 100 when added together 
            // All the print statements for the results
            System.out.println("Well then, I have this highly reliable report on " + dogName + "'s prestigious background right here.\n");
            System.out.println(dogName + " is:\n");
            System.out.println(randomNumb1 + "% " + randomBreed1);
            System.out.println(randomNumb2 + "% " + randomBreed2);
            System.out.println(randomNumb3 + "% " + randomBreed3);
            System.out.println(randomNumb4 + "% " + randomBreed4);
            System.out.println(fifthNumb + "% " + randomBreed5);
            System.out.println("\nWow, that's QUITE the dog!");
  }
 } 