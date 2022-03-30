/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.rockpaperscissors;

import java.util.Random;
import java.util.Scanner;
public class RockPaperScissors {

    public static void main(String[] args) {
        
        Random rng = new Random();
        Scanner input = new Scanner(System.in);

        boolean playing = true;
        
        //Beginning of gameplay loop
        while(playing){
        
        //Asks user for number of rounds they would like to play
        System.out.println("How many rounds would you like to play?");
        int rounds = input.nextInt();
        if (rounds < 1 || rounds > 10){
            System.out.print("Rounds out of range.");
            System.exit(0);
        }
       
        
        
        int persPick = 0;
        int compPick = 0;
        int tieCount = 0;
        int compCount = 0;
        int persCount = 0;
        
        //Begin playing through the amount of rounds the user chose
        for(int i = 0; i < rounds; i++){
            System.out.println("Pick 1: rock, 2: paper, 3: scissors");
            persPick = input.nextInt();
            compPick = rng.nextInt(3) + 1;
            
            if(persPick == compPick){
                System.out.println("Tie");
                tieCount += 1;
            } else if ((persPick == 1 && compPick == 3) || (persPick == 2 && compPick == 1) || (persPick == 3 && compPick == 2)) {
               System.out.println("User win");
               persCount += 1;
            } else {
                System.out.println("Comp win");
                compCount +=1;
            }
        }
        
        //Display results of the rounds played
        System.out.print("Ties = " + tieCount + ", User wins = " + persCount + ", Comp wins = " + compCount +"\n");
        if(persCount == compCount){
            System.out.println("No overall winner :( ");
        } else if(persCount > compCount){
            System.out.println("User is the overall winner!");
        } else {
            System.out.println("Computer is the overall winner!");
        }
        
        //Asks user if they would like to continue, if not, exits gameplay loop
        System.out.println("Would you like to continue playing? (yes) (no) : ");
        String play = input.next();
        switch (play) {
            case "yes":
                playing = true;
                break;
            case "no":
                playing = false;
                break;   
            default:
                playing = false;
                break;
        }
    } //end while
    
    
    
    }    
}
