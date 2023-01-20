/**
 * This is program Boxer get value infomation from worldAthele.
 * 
 * Author: Nathachai Charoenchai
 * ID: 653040126-5
 * sec: 1
 * Date: January 20, 2023
 */

package charoenchai.nathachai.lab5;

public class Boxer extends Athlete { // This is class Boxer extends from Athlete.
    static String sport = "Boxing";
    private String division ;
    private String golveSize ;
    public Boxer(String name, double weight, double height, Gender gender, String nationality, String birthdate, String division, String golveSize) {
        super(name, weight, height, gender, nationality, birthdate);
        this.division = division ;
        this.golveSize = golveSize;
    }
    //this is override using twostring method for this play the name weight height gender nationnality birthdate sport division and goleSize.
    @Override
    public String toString() {
        return name + ", " + weight + "kg, " + height +"m, " + gender + ", " + nationality + ", " + birthdate + ", " + sport + ", " + division + ", " + golveSize ;
    }
}