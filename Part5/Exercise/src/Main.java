public class Main {
    public static void main(String[] args) {

        System.out.println(getDaysInMonth(8,2020));

        System.out.println(sumOdd(1,100));
        System.out.println(sumOdd(-1,100));
        System.out.println(sumOdd(100,100));
        System.out.println(sumOdd(13,13));
        System.out.println(sumOdd(100,-100));
        System.out.println(sumOdd(100,1000));


    }



    //Exercise 1 - Number in Word
    public static void printNumberInWord(int x){
        switch (x){
            case 0:
                System.out.println("ZERO");
                break;
            case 1:
                System.out.println("ONE");
                break;
            case 2:
                System.out.println("TWO");
                break;
            case 3:
                System.out.println("THREE");
                break;
            case 4:
                System.out.println("FOUR");
                break;
            case 5:
                System.out.println("FIVE");
                break;
            case 6:
                System.out.println("SIX");
                break;
            case 7:
                System.out.println("SEVEN");
                break;
            case 8:
                System.out.println("EIGHT");
                break;
            case 9:
                System.out.println("NINE");
                break;
            default:
                System.out.println("OTHER");
                break;
        }
    }

    //Exercise 2 - Number Of Days In Month
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

    public static int getDaysInMonth(int month, int year){
        if(month < 1 || month >12 || year < 1 || year > 9999)
        {
            return -1;
        }
        switch (month){
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return 31;
            case 4: case 6: case 9: case 11:
                return 30;
            case 2:
                if(isLeapYear(year)){
                    return 29;
                }
                else{
                    return 28;
                }
            default:
                return -1;
        }
    }

    //Exercise Sum Odd
    public static int sumOdd(int start, int end) {
        //start end is the range of numbers
        int sum = 0;
        if (end >= start && end > 0 && start > 0) {

            for (int i = start; i <= end; i++) {
                if (isOdd(i)) {
                    sum += i;
                }
            }
            return sum;
        }
        return -1;
    }
    public static boolean isOdd(int number){
        if (number>0 && number%2 != 0) {
            //is odd
            return true;
        }
        else{
            return false;
        }
    }




}
