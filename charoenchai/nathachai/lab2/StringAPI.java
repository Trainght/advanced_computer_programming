package charoenchai.nathachai.lab2;

public class StringAPI {
    public static void main(String[] args) {
        int len_of_args = args.length; // lenght of input
        String schoolInput  = args[0]; // set args
        String schoolName_lower = schoolInput.toLowerCase();
        if (len_of_args == 1) {
            int check_u = schoolName_lower.indexOf("university");
            int check_c = schoolName_lower.indexOf("college");
            boolean u = (check_u != -1);
            boolean c = (check_c != -1);
            if(u){ // check string have "university" input args
                System.out.println(schoolInput+" is university");
            }
            else if (c){ // check string have "college" input args
                System.out.println(schoolInput+" is college");
            }
            else{
                System.out.print(schoolInput + " is neither a university nor a college"); // if input argument is not have "university" and "college" 
            }
        }
        else{
            System.out.print("Usage: StringAPI '<School name in single or double Quote>' "); // if input but not have "_" or '_'
        }
    }
}