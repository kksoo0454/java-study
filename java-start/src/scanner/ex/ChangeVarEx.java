package scanner.ex;

import java.util.Scanner;

public class ChangeVarEx {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int temp;

        temp = a;
        a = b;
        b = temp;

        System.out.println("a = " + a + "\nb = " + b);
    }
}
