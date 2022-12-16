package charoenchai.nathachai.lab2;

public class MoneyProsesser {
public static void main(String[] args) {
    int len = args.length; //lenght of input
        if (len == 4){
            String onethn = args[0], fivehun = args[1], onehun = args[2], twnt = args[3]; //set args position
            float flt_onethn = Float.parseFloat(onethn); //convert string to float
            float flt_fivehun = Float.parseFloat(fivehun); //convert string to float
            float flt_onehun = Float.parseFloat(onehun); //convert string to float
            float flt_twnt = Float.parseFloat(twnt); //convert string to float
            float total = (flt_onethn*1000)+(flt_fivehun*500)+(flt_onehun*100)+(flt_twnt*20); //calculate number from input
            System.out.println("Total Money is "+ total);
        }
        else {
            System.out.println("Usage: MoneyProsesser <# of 1,000 Bath Notes> <# of 500 Bath Notes> <# of 100 Bath Notes> <# of 20 Bath Notes>");
        }
    }
}