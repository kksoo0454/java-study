package scope;

public class Casting1 {

    public static void main(String[] args) {
        int intValue = 10;
        long longValue;
        double doublevalue;

        longValue = intValue; // int -> long
        System.out.println("longValue = " + longValue);

        doublevalue = intValue; //int -> double
        System.out.println("doubleValue = " + doublevalue);

        doublevalue = 20L; //long -> double
        System.out.println("doubleValue2 = " + doublevalue);
        }
    }

