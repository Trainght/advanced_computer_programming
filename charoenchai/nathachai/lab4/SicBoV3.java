package charoenchai.nathachai.lab4;

import java.util.Scanner;

/**
 * <b> This program calls SicBoV3 </b> <br>
 * This SicBov2 game start will get input from user 1 or 2 <br>
 * Type 1 for game choosing high or low numbers <br>
 * Type 2 form game choosing betweem 1 to 6 <br>
 * Game 1 is choosing h for high or l for low guess the total number of 3 dice <br>
 * Game 2 is choosing between a number 1 to 6 guess the number of 3 dice <br>
 * If wrong type will be type again <br>
 * Show the result is you win or loose and ask user for play again <br>
 *  
 * @author Nathachai Charoenchai
 * @version 1.0 13/1/2023
 */
public class SicBoV3 {

    static Scanner inputUser = new Scanner(System.in); // Create a Scanner object
    static Integer dice1 = 1+(int)(Math.random()*((6-1)+1)); // Random dice1
    static Integer dice2 = 1+(int)(Math.random()*((6-1)+1)); // Random dice2
    static Integer dice3 = 1+(int)(Math.random()*((6-1)+1)); // Random dice3
    static Integer total = dice1+dice2+dice3; // Total dice of 3

    /**
     * <b> This is main method </b> <br>
     * Use while loop for check error and get choice 1 or 2 and check play again <br>
     * 
     * @param args <br>
     */
    public static void main(String[] args) {
        boolean checkPlay = true; //set Boolean for use in while loop
        System.setProperty("file.encoding", "UTF-8");

        while (checkPlay) {
            System.out.println("\nWellcome to ณทชัย เจริญชัย (653040126-5) Game:");
            yourChoice();
            System.out.println("Press A to play again. Press the other keys to exit");
            String inputAgain = inputUser.next();
            if (inputAgain.equalsIgnoreCase("a")) { // check input A or a
            } 
            else {
                System.out.println("Good Bye!"); // if other key
                checkPlay = false;
            }
        } inputUser.close(); // close scanner
    }

    /**
     * <b> This is playGame method </b> <br>
     * Check choice if choice is 1 will use method gameOne or choice is 2 will use method gameTwo <br>
     * 
     * @param playGameNum is get value from scanner input in method yourChoice <br>
     */
    public static void playGame(double playGameNum){ 
        if (playGameNum == 1) { // if get number from playGame is 1
            gameOne();
        }
        else if(playGameNum == 2){ // if get number from playGame is 2
            gameTwo();
        }
    }

     /**
      * <b> This is yourChoice method </b> <br>
      * For get input user and sent that value to method playGame <br>
      */
    public static void yourChoice() {
        Boolean yourChoiceBoo = true; //set Boolean for use in while loop
        while (yourChoiceBoo) {
            System.out.println("Type 1 for choosing high or low numbers.\nType 2 for choosing number between 1-6."); // Output text to tell user how to input
            System.out.print("Enter yourchoice: "); // Output text to tell user
            String inputChoice = inputUser.next();
            if (inputChoice.equals("1") || inputChoice.equals("2")) { // inputChoice from scanner is 1 or 2  
                Double playGameChoice = Double.parseDouble(inputChoice); // change type string inputChoice to typr double in value playGameChoice
                playGame(playGameChoice); // put value playGameChoice to method playGame();
                yourChoiceBoo = false;
            } else {
                System.out.println("Enter only 1 or 2:");
            }
        }
    }

     /**
     * <b> This is gameOne method </b> <br>
     * Type h or l and check if input is not h or l will sent 1 to method playGame for restart <br>
     * Show the result guess win or loose <br>
     */
    public static void gameOne(){
        boolean gameOneBoo = true; //set Boolean for use in while loop
        while (gameOneBoo) {
            System.out.print("Type in h for high and l for low: "); // Output text to tell user to choose "h" high or "l" low 
            String hl_input = inputUser.next(); // Read user input "l" "h" or other
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
                System.out.println("Incorrect input. Enter h for high and l for low only."); playGame(1); // put 1 to method playGame(); for restart game 1
            }
            gameOneBoo = false;
        }
    }

    /**
     * <b> This is gameTwo method </b> <br>
     * Will guess the number of 3 dice is match <br>
     * Type a number 1 to 6 and check if input is not a number 1 to 6 will sent 2 to method playGame for restart <br>
     * Show win is guess the number is match in some dice is multiply the num of match <br>
     */
    public static void gameTwo(){
        boolean gameTwoBoo = true;
        int[] dice = new int[3]; // Create list dice
        dice[0] = dice1; // Set position 0 equal dice 1
        dice[1] = dice2; // Set position 1 equal dice 2
        dice[2] = dice3; // Set position 2 equal dice 3
        Integer totalDiceMatch = 0 ; // set total_money equal 0
        System.out.print("Type in a number to bet on (1-6): "); // Output text to tell user to choose number between 1 and 6
        String num_input = inputUser.next(); // Read user input
        while (gameTwoBoo) {
            try { // try to run program below
                Integer num_check = Integer.parseInt(num_input); // Change string to integer
                if(num_check < 7 && num_check > 0 ){ // if input is 1 to 6
                    for (int i = 0; i < 3; i++) { // Loop check if input user have in list add 30 to total_money
                        if(num_check == dice[i]){
                            totalDiceMatch += 1;
                        }
                    }
                    Integer totalMoney = 10*totalDiceMatch*(5%6); // calculate from problem
                    if(totalMoney == 0){ // If user input not equal to all of the dice
                        System.out.println("Dice 1 : "+ dice1 +", Dice 2 : "+ dice2 +", Dice 3 : "+ dice3 ); // Output result 3 dice
                        System.out.println("You loose 10 Bath.");
                    }
                    else{
                        System.out.println("Dice 1 : "+ dice1 +", Dice 2 : "+ dice2 +", Dice 3 : "+ dice3 ); // Output result 3 dice
                        System.out.println("You win "+ totalMoney+" Bath.");
                    }
                }
                else { // if input is not 1 to 6
                    System.out.println("Incorrect input. Enter 1 - 6 only."); playGame(2); // put 2 to method playGame(); for restart game 2
                }
            } catch (Exception e) { // if error it will catch and show below
                System.out.println("Incorrect input. Enter 1 - 6 only."); playGame(2); // put 2 to method playGame(); for restart game 2
            }
            gameTwoBoo = false;
        }
    }
}