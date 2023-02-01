/**
 * This program is called AthleteV2 extends from Athlete.
 * 
 * Author: Nathachai Charoenchai
 * ID: 653040126-5
 * sec: 1
 * Date: February 2, 2023
 */
package charoenchai.nathachai.lab6;

import charoenchai.nathachai.lab5.Athlete;

public class AthleteV2 extends Athlete {

    public AthleteV2(String name, double weight, double height, Gender gender, String nationality, String birthdate) {
        super(name, weight, height, gender, nationality, birthdate); // Use Method from Athlete
    }

    public void practice() { // Method practice
        System.out.print(name + " runs for 10 and");
    }
}