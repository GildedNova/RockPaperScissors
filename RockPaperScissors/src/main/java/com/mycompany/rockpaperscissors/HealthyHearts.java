/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rockpaperscissors;
import java.util.Scanner;

public class HealthyHearts {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("What is your age?");
        int age = input.nextInt();
        int max = 220 - age;
        int low = max / 2;
        
        //Rounds double up to make an int value since we are multiplying by a percent
        int high = (int)Math.round(max * .85);
        System.out.println("Your maximum heart rate should be " + (max) + " beats per minutes");
        System.out.println("Your maximum HR zone is " + low + " - " + high + " beats per minute");
        
        
    }
}