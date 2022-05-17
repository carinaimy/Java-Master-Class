import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        printConversion(10.25); //Part4 -Exercise1
        printMegaBytesAndKiloBytes(5000);//Exercise2
        System.out.println(shouldWakeUp(false, 2)); //Exercise3

        areEqualByThreeDecimalPlaces(3.175, 3.176);
    }
    //Exercise 1
    public static long toMilesPerHour(double kilometersPerHour){
        long milePerHour = 0;
        if(kilometersPerHour < 0){
            return -1;
        }
        else{
            milePerHour = (long)Math.round(kilometersPerHour / 1.609);
        }
        return milePerHour;
    }

    public static void printConversion(double kilometersPerHour){
        long milePerHour = toMilesPerHour(kilometersPerHour);
        if(kilometersPerHour < 0){
            System.out.println("Invalid Value");
        }
        else{
            System.out.println(kilometersPerHour + " km/h = " + milePerHour +" mi/h");
        }
    }

    //Exercise2
    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        if(kiloBytes < 0){
            System.out.println("Invalid Value");
        }
        else{
            int mbCount = kiloBytes/1024;
            int remainingKb = kiloBytes%1024;
            System.out.println(kiloBytes + " KB = " + mbCount + " MB and " + remainingKb + " KB");
        }
    }

    //Exercise3 Barking Dog
    public static boolean shouldWakeUp(boolean isBarking, int hourOfDay){
       if(hourOfDay >= 0 && hourOfDay <24){
           if( isBarking && (hourOfDay < 8 || hourOfDay > 22) ){
               return true;
           }
       }
        return false;
    }

    public static boolean isLeapYear(int year){
        if(year < 1 || year > 9999){
            return false;
        }
        if(year%4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return true; //is a leap year
                }
            }
            else{
                return true;
            }
        }
        return false;
    }


    //Exercise5 Decimal Comparator
    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2){
        int num_one = (int)(num1 * 1000);
        int num_two = (int)(num2 * 1000);
        //System.out.println(num_one+" "+num_two);
        if(num_one == num_two ){
            return true;
        }
        return false;
    }

    //exercise6 Equal Sum Checker
    public static boolean hasEqualSum(int num1, int num2, int num3){
        if(num1 + num2 == num3){
            return true;
        }
        return false;

    }

    //Exercise7 Teen Number Checker
    public static boolean hasTeen(int num1, int num2, int num3){
        if((num1>=13&&num1<=19)||(num2>=13&&num2<=19)||(num3>=13&&num3<=19)){
            return true;
        }
        return false;
    }

    public static boolean isTeen(int num1){
        if(num1>=13&&num1<=19){
            return true;
        }
        return false;
    }

}