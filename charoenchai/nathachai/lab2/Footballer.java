package charoenchai.nathachai.lab2;

public class Footballer{
    public static void main(String[] args) {
        int len = args.length; //lenght of input
        if (len == 3){ //if leght of input is 3
            String footballer_name = args[0];
            String nationality = args[1];
            String clup_name = args[2];
            System.out.println("My favorite football player  is "+footballer_name+"\nHis nationality as "+nationality+"\nHe plays for "+clup_name);
        }
        else { //if lenght of input is not 3
            System.out.println("Usage: Footballer <footballer name> <nationality> <club name>");
        }
    }
}