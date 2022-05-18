import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        printConversion(10.25); //Part4 -Exercise1
        printMegaBytesAndKiloBytes(5000);//Exercise2
        System.out.println(shouldWakeUp(false, 2)); //Exercise3

        areEqualByThreeDecimalPlaces(3.175, 3.176);
        printYearsAndDays(561600);
        printYearsAndDays(525600);
        printYearsAndDays(1051200);
        printYearsAndDays(-1);

        printEqual(1,1,1);
        printEqual(1,1,2);
        printEqual(-1,-1,-1);
        printEqual(1,2,3);

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

    //Exercise8 - Area Calculator

    public static double area(double radius){
        if(radius<0){
            return -1.0;
        }
        //calculate circle area
        return radius*radius*Math.PI;
    }

    public static double area(double x, double y){
        //x,y represent the two sides of a rectangle
        if(x<0||y<0){
            return -1.0;
        }
        return x * y;
    }

    //Exercise9 - Minutes to Years and Days Calculator
    public static void printYearsAndDays(long minutes){
        //calculate the years and days from minutes
        if(minutes<0){
            System.out.println("Invalid Value");
        }
        else{
            long hours = minutes/60;
            long days = hours/24;
            long years = days/365;
            long remainingDays = days%365;
            System.out.println(minutes+" min = " +years +" y and " + remainingDays +" d");
        }
    }

    //Exercise10 -Equality Printer
    public static void printEqual(int x, int y, int z){
        if(x<0 ||y<0 || z<0){
            System.out.println("Invalid Value");
        }
        else if(x == y || y == z || x == z){
            if (x != y || y != z || x != z){
                System.out.println("Neither all are equal or different");
            }
            else{
                System.out.println("All numbers are equal");
            }
        }
        else{
            System.out.println("All numbers are different");
        }
    }


    //Exercise11 - Playing Cat
    public static boolean isCatPlaying(boolean summer, int temperature) {
        if (summer) {
            if (temperature >= 25 && temperature <= 45) {
                return true;
            }
        }
        else if (temperature >= 25 && temperature <= 35) {
            return true;
        }

        return false;
    }


}