public class Main {
    public static void main(String[] args) {
        //Control flow statements

        //Switch
//        int value = 1;
//        if(value == 1){
//            System.out.println("value was 1");
//        }
//        else if (value ==2){
//            System.out.println("value was 2");
//        }
//        else{
//            System.out.println("was not 1 or 2");
//        }

        //can be express in switch statement
        int switchValue = 3;
        switch(switchValue){
            case 1:
                System.out.println("value was 1");
                break; //come down to more code
            case 2:
                System.out.println("value was 2");
                break;
            case 3: case 4: case 5:
                System.out.println("was a 3, 4, or 5");
                break;
            default:
                System.out.println("was not 1, 2, 3, 4 or 5");
                break;
        }
        //More code here
        //Challenge
        char switchChar ='A';
        switch (switchChar){
            case 'A':
                System.out.println("value is A");
                break;
            case 'B':
                System.out.println("value is B");
            case 'C':case 'D':case 'E':
                System.out.println("value is "+switchChar);
                break;
            default:
                System.out.println("Not found");

        }

        String month = "JaNUARY";
        //use to lowercase to make it recognized
        switch(month.toLowerCase()){
            case "january":
                System.out.println("January");
                break;
            default:
                System.out.println("default");
                break;
        }


        printDayOfTheWeek(5);

        System.out.println("10,000 at 2% interest = " + calculateInterest(10000, 2.0));

        //FOR STATEMNT
        // for(init;termination;increment){};
        for(int i = 0; i < 5; i++){
            System.out.println(i);
        }
        //challenge
        for(int i= 8; i>=2; i--){
            System.out.println("with interest rate "+ i +" the total is "+ String.format("%.2f",calculateInterest(10000.0, i)));
        }

        //Challenge
        int count = 0;
        for(int j = 1; j <10; j++){
            if(isPrime(j)){
                count ++;
                System.out.println("Prime number: "+ j +". Count is "+count);
            }
            if(count == 3){
                System.out.println("exit");
                break;
            }

        }

        //sum 3 and 5 challenge
        int sum =0;
        int count1 = 0;
        for(int i = 1; i<=100; i++){
            if(i%3==0 && i%5==0){
                sum += i;
                count1 ++;
                System.out.println(i + " is able to sum. Count is "+count1);
            }
            if(count1 == 5){
                System.out.println("The sum is "+sum);
                break;
            }
        }

        //While and Do While
        int count2 = 0;
        while(count2 !=5){
            System.out.println("count value is "+count2);
            count2 ++;
        }
        // Identical to this
        for(int i=0; i<5; i++){
            System.out.println("count value is "+i);
        }
        //also identical to this
        count2 = 0;
        while(true){
            if(count2==5){
                break;
            }
            System.out.println("count value is "+ count2);
            count2 ++;
        }
        //also can do this
        System.out.println("******do while part******");
        count2 = 0;
        do{
            System.out.println("count value is "+ count2);
            count2 ++;
        }while(count2 != 5);

        //Challenge
        int number = 4;
        int finishNumber = 20;
        int count3 = 0;
        while(number <= finishNumber){
            number ++;
            if(!isEvenNumber(number)){
                continue;//skip
            }
            count3 ++;
            System.out.println("Even number " + number);
            if(count3>=5){
                break;//exit
            }
        }
        System.out.println(count3);

        //Digit Sum Challenge
        System.out.println(sumDigits(123));







    }


    public static void printDayOfTheWeek(int day){
        switch (day){
            case 0:
                System.out.println("Monday");
                break;
            case 1:
                System.out.println("Tuesday");
                break;
            case 2:
                System.out.println("Wednesday");
                break;
            case 3:
                System.out.println("Thursday");
                break;
            case 4:
                System.out.println("Friday");
                break;
            case 5:
                System.out.println("Saturday");
                break;
            case 6:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day");
                break;
        }
    }


    //For loop Statement
    public static double calculateInterest(double amount, double interestRate){
        return amount*(interestRate/100);
    }


    public static boolean isPrime(int n){
        if(n==1){
            return false;
        }
        for(int i=2; i<=n/2;i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }


    //challenge
    public static boolean isEvenNumber(int number){
        if(number % 2 == 0) {
            return true;
        }
        return false;
    }




    //Challenge Digit Sum Challenge
    public static int sumDigits(int number){
        int sum = 0;
        if(number < 10){
            return -1;
        }
        //123----123%10 = 3
        //123/10 = 12
        // 12%10 = 2
        //12/10 = 1
        //1%10 = 1
        //1/10 =0 --exit
        while(number>0){
            int digit = number % 10;
            System.out.println("The digit is " +digit );
            sum += digit;
            number/=10;
        }
        return sum ;
    }

}