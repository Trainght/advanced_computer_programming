package charoenchai.nathachai.lab2;

public class DataTypes {
    public static void main(String[] args) {
        String name = "Nathachai Charoenchai";
        String my_std_id = "653040126-5";
        Character fist_letname = name.charAt(0); //the frist letter of name
        Boolean bol = true;
        int twolast_id = 65;
        String octol = Integer.toOctalString(twolast_id);//change integer to Octal String
        int twolastid_octa = Integer.parseInt(octol);  //change Octal String to integer
        String hexadecimal = Integer.toHexString(twolast_id); //integer to integer in base 16
        int twolastid_hex = Integer.parseInt(hexadecimal); // change tpye HexString to integ
        Float twolastid_Float = 53.65f; 
        double twolastid_double = 53.22d; 
        System.out.println("My name is " + name + "\nMy student id is " + my_std_id);
        System.out.println( fist_letname + " " + bol + " " + twolastid_octa + " " + twolastid_hex ); 
        System.out.print(twolast_id + " " + twolastid_Float + " " + twolastid_double);
    }
}
