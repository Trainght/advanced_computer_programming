/**
 * This is program BadmintonPlayer get value infomation from worldAthele.
 * 
 * Author: Nathachai Charoenchai
 * ID: 653040126-5
 * sec: 1
 * Date: January 20, 2023
 */

package charoenchai.nathachai.lab5;

public class BadmintonPlayer extends Athlete { // This is class BatmintonPlayer extends from Athlete
    static String sport = "Badminton";
    private double racketLength ;
    private int worldRanking ;
    public BadmintonPlayer(String name, double weight, double height, Gender gender, String nationality,String birthdate, double racketLength,int worldRanking) {
        super(name, weight, height, gender, nationality, birthdate);
        this.racketLength = racketLength ;
        this.worldRanking = worldRanking ;

    }
//this is override using twostring method for this play the name weight height gender nationnality birthdate  sport racketLenght and worldRankinng.
@Override
public String toString() {
    return name + ", " + weight + "kg, " + height +"m, " + gender + ", " + nationality + ", " + birthdate + ", " + sport + ", " + racketLength + "cm, rank:" + worldRanking;
}

public static String getSport() {
    return sport;
}

}
