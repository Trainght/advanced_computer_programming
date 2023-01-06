/**
* This SicBo program will be give you 2 options, option 1 is choose high or low numbers and option 2 is choose number between 1-6
* if you choose some number and typing high and low or number 1-6 this program will random 3 dice and tell you win 20 bath or loose 10 bath.
*
* Author: Nathachai Charoenchai
* ID: 653040126-5
* Sec: 1
* Date: January 5, 2023
*
**/

package charoenchai.nathachai.lab3;

import java.util.Scanner; // Import scanner to use in program
import java.lang.Math; // Import math to use in program

public class SicBo {
    public static void main(String[] args) {
        System.out.println("Choose how you want to bet:\nType 1 for choosing high or low numbers.\nType 2 for choosing number between 1-6."); // Output text to tell user how to input
        System.out.print("Enter yourchoice: "); // Output text to tell user
        Scanner choice = new Scanner(System.in); // Create a Scanner object
        int check_choice; // Set input to integer
        check_choice = choice.nextInt(); // Read user input
        Integer dice1 = 1+(int)(Math.random()*((6-1)+1)); // Random dice1
        Integer dice2 = 1+(int)(Math.random()*((6-1)+1)); // Random dice2
        Integer dice3 = 1+(int)(Math.random()*((6-1)+1)); // Random dice3
        Integer total = dice1+dice2+dice3; // Total dice of 3
        if (check_choice == 1){ // User choose Type 1
            System.out.print("Type in h for high and l for low: "); // Output text to tell user to choose "h" high or "l" low 
            String hl_input = choice.next(); // Read user input "l" "h" or other
            if(hl_input.equalsIgnoreCase("h")){ // If input is h and run below the program 
                System.out.println("Dice 1 : "+ dice1 +", Dice 2 : "+ dice2 +", Dice 3 : "+ dice3 ); // Output result 3 dice
                System.out.println("Total is "+total); // Output total dice of 3
                if(total>0 && total <=9){ // If the total is over 0 but less than or equal to 9
                    System.out.println("You loose 10 Bath");
                }
                else{ // More than 9 is equal high you win
                    System.out.println("You win 20 Bath");
                }   
            }
            else if(hl_input.equalsIgnoreCase("l")){ // If input is l and run below the program 
                System.out.println("Dice 1 : "+ dice1 +", Dice 2 : "+ dice2 +", Dice 3 : "+ dice3 ); // Output result 3 dice
                System.out.println("Total is "+total); // Output total dice of 3
                if(total>0 && total <=9){ // If the total is over 0 but less than or equal to 9 you win 20 Bath
                    System.out.println("You win 20 Bath");
                }
                else{ // More than 9 is equal high but you loose cus you choose low
                    System.out.println("You loose 10 Bath");
                }
            }
            else{ // If user input other not "l" and "h"
                System.out.println("Incorrect input. Enter h for high and l for low only.");
            }
        }
        else if(check_choice == 2){ //If user choose Type 2
            System.out.print("Type in a number to bet on (1-6): "); // Output text to tell user to choose number between 1 and 6
            String num_input = choice.next(); // Read user input
            Integer num_check = Integer.parseInt(num_input); // Change string to integer 
            int[] dice = new int[3]; // Create list dice
            dice[0] = dice1; // Set position 0 equal dice 1
            dice[1] = dice2; // Set position 1 equal dice 2
            dice[2] = dice3; // Set position 2 equal dice 3
            Integer total_money = 0 ; // set total_money equal 0
            if(num_check>6 || num_check<0){
                System.out.println("Incorrect input. Enter 1 - 6 only.");
            }
            else {
                for (int i = 0; i < 3; i++) { // Loop check if input user have in list add 30 to total_money
                    if(num_check == dice[i]){
                        total_money +=30;
                    }
                }
                if(total_money == 0){ // If user input not equal to all of the dice
                    System.out.println("Dice 1 : "+ dice1 +", Dice 2 : "+ dice2 +", Dice 3 : "+ dice3 ); // Output result 3 dice
                    System.out.println("You loose 10 Bath.");
                }
                else{
                    System.out.println("Dice 1 : "+ dice1 +", Dice 2 : "+ dice2 +", Dice 3 : "+ dice3 ); // Output result 3 dice
                    System.out.println("You win "+ total_money+" Bath.");
                }
            }
        }
        else { // If user input other that are not 1 and 2
            System.out.print("Incorrect input. Enter 1 or 2 only.");
        }
    }
}