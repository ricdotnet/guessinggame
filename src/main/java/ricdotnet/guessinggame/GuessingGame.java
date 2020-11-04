/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ricdotnet.guessinggame;

import java.util.*;
/**
 *
 * @author Ricardo Rocha
 */
public class GuessingGame {
    
    static Scanner input = new Scanner(System.in);
    static Random rand = new Random();
    static int cpu;
    static int user;
    
    //method to generate a new random cpu number
    public static int cpuNumber(){
        return cpu = rand.nextInt(100);
    }
    
    //method to ask the user for an input
    public static int userGuess(){
        System.out.println("Enter a number (0-100): ");
        user = input.nextInt();
        return user;
    }
    
    public static void main(String[] args){
        
        
        
    }//end main method
    
}//end main class
