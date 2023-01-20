/**
 * This program is called WorldAthlete to sent infomation to Athlete class  and print out to screen. 
 * 
 * Author: Nathachai Charoenchai
 * ID: 653040126-5
 * sec: 1
 * Date: January 20, 2023
 */

package charoenchai.nathachai.lab5;

import charoenchai.nathachai.lab5.Athlete.Gender;

public class WorldAthlete {
// This is main method.
    public static void main(String[] args) {
    Athlete ratchanok = new Athlete("Rachanok Intanon", 55, 1.68, Gender.FEMALE, 
    "Thai", "05/02/1995");
    Athlete wisaksil = new Athlete("Wisaksil Wangek", 51.1, 1.60, Gender.MALE, 
    "Thai", "08/08/1986");
    Athlete tom = new Athlete("Tom Brady", 102, 1.93, Gender.MALE, 
    "American", "03/08/1977");
    System.out.println(ratchanok.getName()+"'s height is " + ratchanok.getHeight());
    ratchanok.setHeight(1.70);
    System.out.println(ratchanok.getName()+"'s height has increaded to " + ratchanok.getHeight());
    System.out.println(ratchanok);
    System.out.println(wisaksil);
    System.out.println(tom);
    }
}
