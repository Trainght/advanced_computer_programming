package charoenchai.nathachai.lab2;

public class StringAPI {
    public static void main(String[] args) {
        int len_of_args = args.length; // lenght of input
        String schoolName  = args[0]; // set args
        if (len_of_args == 1) {
            if(schoolName.equalsIgnoreCase("university")){ // check string have "university" input args
                System.out.println(schoolName+" is university");
            }
            else if (schoolName.equalsIgnoreCase("college")){ // check string have "college" input args
                System.out.println(schoolName+" is college");
            }
            else{
                System.out.print(schoolName + " is neither a university nor a college"); // if input argument is not have "university" and "college" 
            }
        }
        else{
            System.out.print("Usage: StringAPI '<School name in single or double Quote>' "); // if input but not have "_" or '_'
        }
    }
}