/**
 * This program is called WorldAthleteV2 to sent infomation to Athlet class and print out that infomation to screen and compar age two athlete. 
 * 
 * Author: Nathachai Charoenchai
 * ID: 653040126-5
 * sec: 1
 * Date: January 20, 2023
 */

package charoenchai.nathachai.lab5;

public class WorldAthleteV2 {
    // This is main method.
    public static void main(String[] args) {
        BadmintonPlayer ratchanok = new BadmintonPlayer("Rachanok Intanon", 55, 1.68, Athlete.Gender.FEMALE, 
            "Thai", "05/02/1995", 66.5, 4);
        Footballer tom = new Footballer("Tom Brady", 102, 1.93, Athlete.Gender.MALE, 
            "American", "03/08/1977", "Quarterback", "New Englang Patriots");
        Boxer wisaksil = new Boxer("Wilsaksil Wangek", 51.5, 1.60, Athlete.Gender.MALE, 
            "Thai", "08/12/1986", "Super Flyweight", "M");
        System.out.println(ratchanok);
        System.out.println(wisaksil);
        System.out.println(tom);

        BadmintonPlayer nitchaon = new BadmintonPlayer("Nitchaon Jindapol", 52, 1.63, Athlete.Gender.FEMALE,
            "Thailand", "31/03/1998", 67, 11);
        System.out.println("Both " + ratchanok.getName() +" and " + nitchaon.getName() + " play " + BadmintonPlayer.getSport());
        ratchanok.compareAge(tom); // call the medthod compareAge to compare age between ratchanok and tom.
        ratchanok.compareAge(nitchaon); // call the medthod compareAge to compare age between ratchanok and nitchaon.

        // if - else (taller)
        if(inTaller(wisaksil, tom)){ // if inTaller is true
            System.out.println(wisaksil.getName() + " is taller than " + tom.getName());
        }
        else { // else false
            System.out.println(wisaksil.getName() + " is not taller than " + tom.getName());
        }
    }

    //Check if - else Athlete taller
    private static boolean inTaller(Athlete a, Athlete b) {
        if(a.getHeight() > b.getHeight()){
            return true ;
        }
        else {
            return false ;
        }
    }
}
