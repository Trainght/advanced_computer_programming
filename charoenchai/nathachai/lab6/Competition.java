/**
 * This  is abstract public class Competition.
 * 
 * Author: Nathachai Charoenchai
 * ID: 653040126-5
 * sec: 1
 * Date: February 2, 2023
 */
package charoenchai.nathachai.lab6;

import java.util.ArrayList;

abstract public class Competition {

    protected String name, region; // variable

    public void getter() {
    }

    public void setter() {
    }

    abstract void setDescription();

    abstract void setSponsorship(ArrayList<String> sponsors);
}
