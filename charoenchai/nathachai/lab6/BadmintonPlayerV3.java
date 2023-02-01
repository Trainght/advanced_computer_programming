/**
 * This program is called BadmintonPlayerV3 extends from BadmintonPlayerV2 and implements from BadmintonPlayable and Sprinter.
 * 
 * Author: Nathachai Charoenchai
 * ID: 653040126-5
 * sec: 1
 * Date: February 2, 2023
 */
package charoenchai.nathachai.lab6;

public class BadmintonPlayerV3 extends BadmintonPlayerV2 implements BadmintonPlayable, Sprinter {

    protected int worldRanking; // variable
    protected double speed, racketLength; // variable

    public BadmintonPlayerV3(String name, double weight, double height, Gender gender, String nationality,
            String stringDob) {
        super(name, weight, height, gender, nationality, stringDob); // Use Method from BadmintonPlayerV2
    }

    @Override // Override Method toString
    public String toString() {
        return super.toString() + "\n" + this.name + " is a Badminton player whose world ranking is "
                + this.worldRanking + " and has sprint speed as " + this.speed;
    }

    @Override // Override Method setSpeed get value type Double
    public void setSpeed(double Speed) {
        this.speed = Speed;
    }

    @Override // Override Method getSpeed
    public double getSpeed() {
        return this.speed;
    }

    @Override // Override Method getRacketLength
    public double getRacketLength() {
        return this.racketLength;
    }

    @Override // Override Method setRacketLength get value type Double
    public void setRacketLength(double RacketLength) {
        this.racketLength = RacketLength;
    }

    @Override // Override Method getWorldRanking
    public double getWorldRanking() {
        return this.worldRanking;
    }

    @Override // Override Method setWorldRanking get value type Integer
    public void setWorldRanking(int WorldRanking) {
        this.worldRanking = WorldRanking;
    }
    
}
