package method;

public class MethodVaule3 {

    public static void main(String[] args) {
        int number = 5;
        System.out.println("1. changeNumber 호출 전, number: " + number);
        number = changeNumber(number);
        System.out.println("4. changeNumber 호출 후, number: " + number);
    }

    public static int changeNumber(int number) {
        number = number * 2;
        return number;
    }
}
