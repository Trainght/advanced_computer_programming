/**
 * This program is called AFFChampionship extends from Competition.
 * 
 * Author: Nathachai Charoenchai
 * ID: 653040126-5
 * sec: 1
 * Date: February 2, 2023
 */
package charoenchai.nathachai.lab6;

import java.util.ArrayList;

public class AFFChampionship extends Competition {

    String teamA, teamB; // variables 

    public AFFChampionship(String name, String teamA, String teamB) { // Get value
        this.teamA = teamA; // set value
        this.teamB = teamB; // set value
        this.name = name; // set value
    }

    public void setPlaces(ArrayList<String> places) { // Method setPlaces get ArrayList
        System.out.println(this.name + " plays at these stadiums " + "\n" + places);
    }

    @Override // Override Method toString
    public String toString() { 
        return this.name + " in the final round was the game between " + teamA + " vs " + teamB;
    }

    @Override // Override Method setDescription
    void setDescription() {
    }

    @Override // Override Method setSponsorship get ArrayList and use if-else
    void setSponsorship(ArrayList<String> sponsors) {
        if (sponsors.size() == 1) {
            System.out.println(sponsors.get(0) + " is a sponsor of " + this.name);
        } else {
            System.out.println("Sponsors of " + this.name + " are " + sponsors);
        }
    }
}
