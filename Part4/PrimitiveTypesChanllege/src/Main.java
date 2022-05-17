public class Main {
    public static void main(String[] args) {
        //Primitive Types Chanllenge
        byte byteNum = 100;
        short shortNum = 200;
        int intNum = 3000;
        long longNum= 50000L + 10L * (byteNum + shortNum + intNum);
        short shortNumResult = (short)(50000 + 10 * (byteNum + shortNum + intNum));
        //short needs casting
        System.out.println(longNum);

        //MAY16-Day2

       // float - width 32
        // double - width 64 more precise, more memory needed
        float minFloatValue = Float.MIN_VALUE;
        float maxFloatValue = Float.MAX_VALUE;
        double minDoubleValue = Double.MIN_VALUE;
        double maxDoubleValue = Double.MAX_VALUE;
        System.out.println(minFloatValue);//4E-45
        System.out.println(maxFloatValue);//3.4028235E38
        System.out.println(minDoubleValue);//9E-324
        System.out.println(maxDoubleValue);//7976931348623157E308

        int myIntValue = 5/3;
        float myFloatValue = 5f/3f;
        //provides double so need f or (float) to casting
        //double is ok since its default
        //hardware-double is faster to process than float
        double myDoubleValue = 5d/3d;

        System.out.println(myIntValue); //1
        System.out.println(myFloatValue);//1.6666666
        System.out.println(myDoubleValue);//1.6666666666666667

        //Challenge: convert a given number of lbs to kgs
        double poundValue = 200d;
        double kilogramValue = poundValue * 0.45359237d;
        System.out.println(kilogramValue);

        //Char and Boolean Primitive Types
        char myChar = 'D'; //single character
        //occupies 2 bytes of memory/16 bits with Unicode
        char myUnicode = '\u0044';
        System.out.println(myUnicode);

        //Boolean
        boolean myTrueValue = true;
        boolean myFalseValue = false;
        boolean isCustomerOverTwentyOne = true;

        //String - not primitive but a class
        //sequence of characters
        String myString = "This is a string,";
        System.out.println(myString);
        myString = myString + " this is string too. \u00A9";
        System.out.println(myString);
        //strings are immutable, will be changed in memory


        //Operand and Operator
        int myVar = 15+12; //expression
        //15 is operand, + , = is operator
        int result = 0;
        result = result + 1;
        result ++;
        result += 1;

        //IF-THEN statement - conditional logic
        boolean isCar = false;
        if(isCar != false) // (!isCar) (!, ==, >, >=, <, <=, ||, &&)
        {
            System.out.println("It's not a Alien!");
        }
        else{
            System.out.println("It's a Alien!");
        }
        // = Asign  VS == equal to
        //有时候if（isalien = false）也对
        // 是因为返回的值也只有一位，但是不可以这样！

        //Ternary Operator :if true, true, otherwise false
        boolean wasCar = isCar? true: false;
        //IF isCar = true, set wasCar true,
        // otherwise, set wasCar false
        if(wasCar){
            System.out.println("wasCar is true");
        }
        else{
            System.out.println("wasCar is false");
        }
        int ageOfClient = 20;
        boolean isEighteenOrOver = ageOfClient==20?true:false;
        System.out.println(isEighteenOrOver); //true



        //Operator Challenge
        double doubleOne = 20.00d;
        double doubleTwo = 80.00d;
        double doubleResult = (doubleOne + doubleTwo) * 100.000;
        double remainderValue = doubleResult % 40.00;
        boolean isTrue = remainderValue == 0?true:false;
        System.out.println("the boolean value is: " + isTrue);
        if(!isTrue){
            System.out.println("Got some remainder.");
        }

    }
}