/**
 * This program is called Athlete that satisfies these requirements.
 * 
 * Author: Nathachai Charoenchai
 * ID: 653040126-5
 * sec: 1
 * Date: January 20, 2023
 */

package charoenchai.nathachai.lab5;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

//Class has protected instance variables to record the following information.
public class Athlete {

    protected String name ;
    protected double weight ;
    protected double height ;
    protected Gender gender ;
    protected String nationality ;
    protected LocalDate birthdate ;
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    // Method information: name, weight, height, gender, nationality, birthdate.
    public Athlete(String name, double weight, double height, Gender gender, String nationality, String birthdate) {
    this.name = name ;
    this.weight = weight ;
    this.height = height ;
    this.gender = gender ;
    this.nationality = nationality ;
    this.birthdate = LocalDate.parse(birthdate, formatter);
    }
    // this method is will set new height from user input.
    public Double setHeight(double inHeight){
        return height =+ inHeight ;
    }
    // Method is will return name in this class.
    public String getName() {
        return this.name;
    }
    // Method is will return weight in this class.   
    public Double getWeight(){
        return this.weight ;
    }
    // Method is will return height in this class.
    public Double getHeight(){
        return this.height ;
    }
    // Method is will return gender in this class.
    public Gender getGnder(){
        return this.gender ;
    }
    // Method is will return nationality in this class.
    public String getNationality(){
        return this.nationality ;
    }
    // Method is will return birthdate in this class.
    public LocalDate getBirthdate (){
        return this.birthdate ;
    }
    // This method is will compare age between two athlet.
    public void compareAge(Athlete B) {
        LocalDate dateBefore = birthdate;
        LocalDate dateAfter = B.getBirthdate();
        int year = (int) ChronoUnit.YEARS.between(dateBefore, dateAfter);
        if (year > 0) {
            System.out.println(B.getName() + " is " + year + " year younger than " + name);
        } else if (year < 0) {
            System.out.println(B.getName() + " is " + -(year) + " year older than " + name);
        } else {
            System.out.println(name + " is as old as " + B.getName());
        }
    }
//this is override using twostring method for this play the name weight height gender nationnality and birthdate. 
@Override
public String toString() {
    return "Athlete ["+ this.name + ","+this.weight+"kg, "+this.height+"m, "+this.gender + ", "+this.nationality+ ", " +this.birthdate+" ]";
}
//class enum gender
public enum Gender {
    MALE, FEMALE
}
}

