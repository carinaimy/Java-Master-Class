public class Main {
    public static void main(String[] args) {

//        System.out.println(getDaysInMonth(8,2020));
//
//        System.out.println(sumOdd(1,100));
//        System.out.println(sumOdd(-1,100));
//        System.out.println(sumOdd(100,100));
//        System.out.println(sumOdd(13,13));
//        System.out.println(sumOdd(100,-100));
//        System.out.println(sumOdd(100,1000));

        //System.out.println(isPalindrome(11212));
        //System.out.println(sumFirstAndLastDigit(5));

        //System.out.println(getEvenDigitSum(123456789));

        //System.out.println(hasSharedDigit(12, 13));
//        System.out.println(hasSameLastDigit(22,23,34));
//        System.out.println(isValid(10));
        //System.out.println(getGreatestCommonDivisor(9,18));
        //printFactors(10);
        //isPerfectNumber(6);

        //numberToWords(1);
        //System.out.println(getDigitCount(-12));
        System.out.println(reverse(001));

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

    //Exercise Number Palindrome
    public static boolean isPalindrome (int number){
        int tempNum = Math.abs(number);
        int reverse = 0;
        String digitsStr = "";

        if(number>0 && number<10){
            //number is 0-9;
            return true;
        }
        else{
            while(tempNum > 0){
                int lastDigit = tempNum % 10;
                digitsStr = digitsStr + lastDigit;
                tempNum = tempNum / 10;
                //System.out.println("last digit is "+ lastDigit);
                //System.out.println("Digit String is "+ digitsStr);
            }
            reverse = Integer.valueOf(digitsStr);
            if(reverse == Math.abs(number)){
                return true;
                //it's a palindrome
            }
            else{
                return false;
            }
        }

    }



    //Exercise First And Last Digit Sum
    public static int sumFirstAndLastDigit(int number){
        if(number < 0){
            return -1;
        }
        else if (number>0 && number < 10){
            return number+number;
        }
        int lastDigit = number%10;
        int tempFirstDigit = 0;
        do{
            tempFirstDigit = number%10;
            number = number/10;
        }while(number != 0);
        //System.out.println("First Digit is " + tempFirstDigit);
        //System.out.println("Last Digit " + lastDigit);
        return lastDigit + tempFirstDigit;
    }

    //Exercise get Even Digit Sum
    public static int getEvenDigitSum (int number){
        if(number < 0)
        {
            return -1;
        }
        if(number>0 && number<10){
            if(number % 2 == 0){
                return number;
            }
        }
        int sum = 0;
        while(number > 0){
            int currLastDigit = number % 10;
            if(currLastDigit % 2 == 0){
                sum = sum + currLastDigit;
            }
            number = number / 10;
        }
        return sum;
    }

    //Exercise Shared Digit
    public static boolean hasSharedDigit (int num1, int num2){
        if(num1 <10 || num1 >99 ||num2 <10 || num2 >99 ){
            return false;
        }
        do{
            int currNum1 = num1%10;
            //System.out.println("current num1 is " + currNum1);
            int tempNum2 = num2;
            while(tempNum2 != 0){
                int currNum2 = tempNum2%10;
                //System.out.println("Curr num2 is "+ currNum2);
                if(currNum2 == currNum1){
                    //System.out.println("num1 " + currNum1 + "is equal to "+currNum2);
                    return true;
                }
                tempNum2 = tempNum2/10;
            }
            num1 = num1 /10;
        }while(num1 != 0 );
        return false;
    }

    //Last Digit Checker
    public static boolean hasSameLastDigit (int num1, int num2, int num3 ){
        if(!isValid(num1)||!isValid(num2)||!isValid(num3)){
            return false;
        }
        int lastDigit1 = num1%10;
        int lastDigit2 = num2%10;
        int lastDigit3 = num3%10;
        if(lastDigit1 ==lastDigit2||lastDigit2==lastDigit3||lastDigit1 ==lastDigit3){
            return true;
        }
        return false;
    }

    public static boolean isValid (int number){
        if(number<10 || number>1000){
            return false;
        }
        return true;
    }

    //Greatest Common Divisor
    public static int getGreatestCommonDivisor(int first, int second){
        if(first < 10 || second < 10){
            return -1;
        }
        for(int i = first; i>0; i--){
            if(first%i == 0 && second%i == 0){
                return i;
            }
        }
        return -1;
    }

    //All Factors
    public static void printFactors (int number){
        if (number <1){
            System.out.println("Invalid Value");
        }
        for(int i=1; i<=number; i++){
            if(number%i==0){
                System.out.println(i);
            }
        }
    }

    public static boolean isPerfectNumber(int number){
        if(number<1){
            return false;
        }
        int sum = 0;
        for(int i = 1; i<number; i++){
            if(number%i == 0){
                sum += i;
            }
            if(sum == number){
                return true;
            }

        }
        return false;
    }

    public static void numberToWords(int number){
        if(number<0 ){
            System.out.println("Invalid Value");
        }
        int tempNumber = reverse(number);
        int currDigit = 0;
        for(int i= 0; i<getDigitCount(number); i++){
            currDigit = tempNumber%10;
            //System.out.println("current digit is "+ currDigit);
            switch (currDigit){
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
                default:
                    break;
            }
            tempNumber = tempNumber/10;
        }
    }

    public static int reverse(int number){
        String reverseStr = "0";
        int currDigit = 0;
        int reverseNum = 0;
        int tempNumber = Math.abs(number);
        while(tempNumber!=0) {
            currDigit = tempNumber % 10;
            reverseStr = reverseStr + currDigit;
            tempNumber /= 10;
        }
        reverseNum = Integer.valueOf(reverseStr);

        String negStr = "-";
        if(number<0){
            negStr = negStr + reverseNum;
            int negNum = Integer.valueOf(negStr);
            return negNum;
        }
        else{
            return reverseNum;
        }
    }


    public static int getDigitCount(int number){
        int count = 0;
        if(number<0){
            return -1;
        }
        else if (number == 0){
            return 1;
        }
        while(number!=0) {
            number /= 10;
            count ++;
        }
        return count;
    }

}
