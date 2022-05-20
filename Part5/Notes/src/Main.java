import java.util.Scanner;

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
//        int switchValue = 3;
//        switch(switchValue){
//            case 1:
//                System.out.println("value was 1");
//                break; //come down to more code
//            case 2:
//                System.out.println("value was 2");
//                break;
//            case 3: case 4: case 5:
//                System.out.println("was a 3, 4, or 5");
//                break;
//            default:
//                System.out.println("was not 1, 2, 3, 4 or 5");
//                break;
//        }
//        //More code here
//        //Challenge
//        char switchChar ='A';
//        switch (switchChar){
//            case 'A':
//                System.out.println("value is A");
//                break;
//            case 'B':
//                System.out.println("value is B");
//            case 'C':case 'D':case 'E':
//                System.out.println("value is "+switchChar);
//                break;
//            default:
//                System.out.println("Not found");
//
//        }
//
//        String month = "JaNUARY";
//        //use to lowercase to make it recognized
//        switch(month.toLowerCase()){
//            case "january":
//                System.out.println("January");
//                break;
//            default:
//                System.out.println("default");
//                break;
//        }
//
//
//        printDayOfTheWeek(5);
//
//        System.out.println("10,000 at 2% interest = " + calculateInterest(10000, 2.0));
//
//        //FOR STATEMNT
//        // for(init;termination;increment){};
//        for(int i = 0; i < 5; i++){
//            System.out.println(i);
//        }
//        //challenge
//        for(int i= 8; i>=2; i--){
//            System.out.println("with interest rate "+ i +" the total is "+ String.format("%.2f",calculateInterest(10000.0, i)));
//        }
//
//        //Challenge
//        int count = 0;
//        for(int j = 1; j <10; j++){
//            if(isPrime(j)){
//                count ++;
//                System.out.println("Prime number: "+ j +". Count is "+count);
//            }
//            if(count == 3){
//                System.out.println("exit");
//                break;
//            }
//
//        }
//
//        //sum 3 and 5 challenge
//        int sum =0;
//        int count1 = 0;
//        for(int i = 1; i<=100; i++){
//            if(i%3==0 && i%5==0){
//                sum += i;
//                count1 ++;
//                System.out.println(i + " is able to sum. Count is "+count1);
//            }
//            if(count1 == 5){
//                System.out.println("The sum is "+sum);
//                break;
//            }
//        }
//
//        //While and Do While
//        int count2 = 0;
//        while(count2 !=5){
//            System.out.println("count value is "+count2);
//            count2 ++;
//        }
//        // Identical to this
//        for(int i=0; i<5; i++){
//            System.out.println("count value is "+i);
//        }
//        //also identical to this
//        count2 = 0;
//        while(true){
//            if(count2==5){
//                break;
//            }
//            System.out.println("count value is "+ count2);
//            count2 ++;
//        }
//        //also can do this
//        System.out.println("******do while part******");
//        count2 = 0;
//        do{
//            System.out.println("count value is "+ count2);
//            count2 ++;
//        }while(count2 != 5);
//
//        //Challenge
//        int number = 4;
//        int finishNumber = 20;
//        int count3 = 0;
//        while(number <= finishNumber){
//            number ++;
//            if(!isEvenNumber(number)){
//                continue;//skip
//            }
//            count3 ++;
//            System.out.println("Even number " + number);
//            if(count3>=5){
//                break;//exit
//            }
//        }
//        System.out.println(count3);
//
//        //Digit Sum Challenge
//        System.out.println(sumDigits(123));
//
//        //Parsing Values from a String
//        String numberAsString = "2018";
//        //cannot be 2018a since format error, cannot be parsed to number
//        System.out.println("NumberAsString= " + numberAsString);
//
//        int number1 = Integer.parseInt(numberAsString);
//        double number2 = Double.parseDouble(numberAsString);
//
//        System.out.println(number1);
//        numberAsString += 1;
//        number1 += 1;
//        System.out.println("NumberAsString= " + numberAsString);//20181
//        System.out.println(number1);//2019
//        System.out.println(number2);//2018.0



        //Reading user input - next line, scanner
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter your year of birth:");
//        boolean hasNextInt = scanner.hasNextInt();
//        if(hasNextInt){
//            int yearOfBirth = scanner.nextInt();
//            //after next int need nextline
//            scanner.nextLine();//handle next line character(enter key)
//            System.out.println("Enter your name: ");
//            String name = scanner.nextLine();
//
//            int age = 2022-yearOfBirth;
//            if(age >= 0 && age <= 100){
//                System.out.println("Your name is " + name+" and your age is "+age+" years old.");
//            }
//            else{
//                System.out.println("Invalid age range");
//            }
//        }
//        else{
//            System.out.println("Unable to parse year of birth");
//        }
//        //need to close after use.
//        scanner.close();


        //Reading User Input Challenge
//        Scanner scanner1 = new Scanner(System.in);
//        int sum = 0;
//        int counter = 1;
//        while(counter<=10){
//            System.out.println("Enter number #" + counter+": ");
//            boolean hasNextInt = scanner1.hasNextInt();
//            if(hasNextInt){
//                int tempInput = scanner1.nextInt();
//                //System.out.println("Current number is "+tempInput);
//                sum += tempInput;
//               // System.out.println("Current sum is " + sum);
//                counter+=1;
//            }
//            else{
//                System.out.println("Invalid Number");
//            }
//            scanner1.nextLine();
//        }
//        System.out.println("Total sum is "+ sum);
//        scanner1.close();


        //Challenge - Min and Max Input Challenge

        Scanner scanner2 = new Scanner(System.in);
//        int minNum = 0;
//        int maxNum = 0;
        //if we don't want to use flag, we can use big numbers
        int minNum = Integer.MAX_VALUE;
        int maxNum = Integer.MIN_VALUE;
        //boolean firstFlag = true;

        while(true){
            System.out.println("Please enter number: ");
            boolean hasNextInt = scanner2.hasNextInt();
            if(hasNextInt){
                int tmp = scanner2.nextInt();

                //set flag only for the first number once
//                if(firstFlag){
//                    firstFlag = false;
//                    minNum = tmp;
//                    maxNum = tmp;
//                }
                //or we can use no flag
                //ionstead we set extrem great or extreme small numbers

                if(tmp < minNum){
                    minNum = tmp;
                }
                if(tmp > maxNum){
                    maxNum = tmp;
                }
            }
            else{
                break;
            }
            scanner2.nextLine();
        }
        System.out.println("The Min number is: " + minNum +
                " and the Max number is "+ maxNum);
        scanner2.close();

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