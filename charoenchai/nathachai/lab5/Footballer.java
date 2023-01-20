/**
 * This is program Footballer get value infomation from worldAthele.
 * 
 * Author: Nathachai Charoenchai
 * ID: 653040126-5
 * sec: 1
 * Date: January 20, 2023
 */

package charoenchai.nathachai.lab5;

public class Footballer extends Athlete { // This is class Footballer extends from Athlete
    static String sport = "American Football";
    private String position ;
    private String team ;
    public Footballer(String name, double weight, double height, Gender gender, String nationality, String birthdate, String position, String team) {
        super(name, weight, height, gender, nationality, birthdate);
        this.position = position ;
        this.team = team ;
    }
    //this is override using twostring method for this play the name weight height gender nationnality birthdate sport position and team.
    @Override
    public String toString() {
        return name + ", " + weight + "kg, " + height +"m, " + gender + ", " + nationality + ", " + birthdate + ", " + sport + ", " + position + ", " + team;
    }
}
