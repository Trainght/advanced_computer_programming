/**
* This BasicStatMethod program to get numbers amount less than or equal 10 numbers to sort and find minimum, maximum, average, median
* and standard deviation.
*
* Author: Nathachai Charoenchai
* ID: 653040126-5
* Sec: 1
* Date: January 5, 2023
*
**/

package charoenchai.nathachai.lab3;

import java.util.Scanner;
import java.util.Arrays;

public class BasicStatMethod {

    static final int i = 0;
    static Scanner input_user = new Scanner(System.in);

    public static void main(String[] args) { // main method
        String input = getInput();
        calculateStat(input);
        input_user.close();
    }
        
    static String getInput() { // getInput method
        System.out.print("Enter numbers (separated by space): ");
        String num_string = input_user.nextLine();
        return num_string;
    }

    static void calculateStat(String input) { // calculateStat method
        String input_num = input; // input_num same input from getInput method
        if(input_num != ""){
            String[] numsplit = input_num.split(" "); // list from input_num but split " "
            double[] numDouble = new double[numsplit.length];
            if(numsplit.length>10){
                System.out.println("There are no more than 10 numbers to be enter"); // If you in put over than 10 number
            }
            else{
                for (int i = 0; i < numDouble.length; i++) {
                numDouble[i] = Double.parseDouble(numsplit[i]); // change string to double
                }
                System.out.print("Sorted numbers are ");
                Arrays.sort(numDouble); // sort number in list numDouble
                for (Double outnumsort : numDouble) {
                    System.out.print(outnumsort + " ");    
                }
                //////////////// The minimum ////////////////
                System.out.printf("\nMinimum: %.2f", numDouble[0]); //output Minimum
                //////////////// The maximum ////////////////
                int last = numDouble.length;
                System.out.printf("\nMaximum: %.2f", numDouble[last-1]); // output Maximum
                //////////////// The average ////////////////
                double number_sum = 0;
                for (int i = 0; i < numDouble.length; i++) {
                    number_sum += numDouble[i];
                }
                double AvgNum = number_sum/numDouble.length ;
                System.out.printf("\nAverage: %.2f",AvgNum); // output Average
                //////////////// The median (odd and even) ////////////////
                if (numsplit.length % 2 == 0) {
                    double num_med = (numDouble[(numDouble.length / 2) - 1] + numDouble[numDouble.length / 2]) / 2;
                    System.out.printf("\nMedian: %.2f", num_med); // output Median in even number
                } else {
                    System.out.printf("\nMedian: %.2f", AvgNum); // output Median in odd number
                }
                //////////////// The standard deviation ////////////////
                double num_standard = 0;
                for (int i = 0; i < numDouble.length; i++) {
                    num_standard += Math.pow(numDouble[i] - AvgNum, 2); 
                }
                double standard = num_standard / numDouble.length;
                System.out.printf("\nStandard deviation: %.2f", Math.sqrt(standard)); // output Standard deviation
            }
        }
        else{
            System.out.println("Please enter at least one number."); // If you not input something or not a number.
        }
    }
}

