public class Main {
    public static void main(String[] args) {
        //Integer -32 bits
        int myValue = 1_000_000;
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxValue = Integer.MAX_VALUE;
        System.out.println(myMinIntValue); //-2147483648
        System.out.println(myMaxValue);//2147483647

        //Byte -small integer- A byte = 8 bits
        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println(myMinByteValue);//-128
        System.out.println(myMaxByteValue);//127

        //short = 16 bits
        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println(myMinShortValue);//-32768
        System.out.println(myMaxShortValue);//32767


        //long = large integers
        long myLongValue = 1_000_000_000_000L; //add long if excess integer length
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println(myMinLongValue);//-9223372036854775808
        System.out.println(myMaxLongValue);//9223372036854775807

        //Casting
        int myNewInt = myMinIntValue / 2;
        byte myNewByteValue = (byte) (myMinByteValue / 2);
        //treat it as byte not int by adding (byte)





    }
}