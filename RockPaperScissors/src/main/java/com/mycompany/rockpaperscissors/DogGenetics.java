/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rockpaperscissors;
import java.util.Scanner;
import java.util.Random;

public class DogGenetics {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rng = new Random();
        
        
        //Get users string input
        System.out.println("What is your dogs name?: ");
        String name = input.nextLine();
        System.out.println("Well then, I have this highly reliable report on " + name + "'s prestigious background right here.");
        System.out.println(name + " is:");
        
        //Gives a random percentage to 5 different breeds adding to a total of 100%. Since we
        //want to add to 100%, the last index of the array(breed 5) is set to the remaining % left.
        int max = 100, min = 0;
        int[] breeds = new int[5];
        for(int i = 0; i < breeds.length - 1; i++){
            breeds[i] = rng.nextInt(max);
            max = max - breeds[i];
        }
        breeds[4] = max;
        
        //Print results to user
        System.out.println(breeds[0] + "% St. Bernard");
        System.out.println(breeds[1] + "% Chihuahua");
        System.out.println(breeds[2] + "% Dramatic Rednosed Asian Pug");
        System.out.println(breeds[3] + "% Common Cur");
        System.out.println(breeds[4] + "% King Doberman\n\n\n");
        System.out.println("Wow thats quite the dog!");
        
    }
}
