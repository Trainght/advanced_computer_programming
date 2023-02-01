/**
 * This program is called WorldAthleteV3.
 * 
 * Author: Nathachai Charoenchai
 * ID: 653040126-5
 * sec: 1
 * Date: February 2, 2023
 */
package charoenchai.nathachai.lab6;

import java.util.ArrayList;
import charoenchai.nathachai.lab5.Athlete;

public class WorldAthleteV3 {

    public static void main(String[] args) {
        ArrayList<AthleteV2> athletes = new ArrayList<AthleteV2>(); // create new arraylist in name athletes
        BadmintonPlayerV2 ratchanok = new BadmintonPlayerV2("Ratchanok Intanon", 55.0, 1.68, AthleteV2.Gender.FEMALE,"Thai", "05/02/1995");
        FootballerV2 tom = new FootballerV2("Tom Bardy", 102, 1.93, Athlete.Gender.MALE, "American", "03/08/1977");
        BoxerV2 wisaksil = new BoxerV2("Wisaksil Wangek", 51.5, 1.60, Athlete.Gender.MALE, "Thai", "08/12/1986");
        athletes.add(ratchanok);
        athletes.add(tom);
        athletes.add(wisaksil);

        for (AthleteV2 athlete : athletes) {  
            System.out.println(athlete);
            athlete.practice();
        }
    }
}