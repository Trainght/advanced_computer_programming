/**
 * This program is called BoxerV2 extends from AthleteV2.
 * 
 * Author: Nathachai Charoenchai
 * ID: 653040126-5
 * sec: 1
 * Date: February 2, 2023
 */
package charoenchai.nathachai.lab6;

public class BoxerV2 extends AthleteV2 {

    public BoxerV2(String name, double weight, double height, Gender gender, String nationality, String birthdate) {
        super(name, weight, height, gender, nationality, birthdate); // Use Method from AthleteV2
    }

    @Override // Override Method practice and print " swings arms"
    public void practice() {
        super.practice();
        System.out.println(" swings arms");
    }
}
