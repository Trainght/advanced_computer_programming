/**
 * This program is interface BadmintonPlayable.
 * 
 * Author: Nathachai Charoenchai
 * ID: 653040126-5
 * sec: 1
 * Date: February 2, 2023
 */
package charoenchai.nathachai.lab6;

public interface BadmintonPlayable {

    double racketLength = 0; // variable
    int worldRanking = 0; // variable

    public double getRacketLength();

    public void setRacketLength(double RacketLength);

    public double getWorldRanking();

    public void setWorldRanking(int WorldRanking);
}
