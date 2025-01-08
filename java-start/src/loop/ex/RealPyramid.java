package loop.ex;

public class RealPyramid {

    public static void main(String[] args) {
        int rows = 7;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.printf(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.printf("*");
            }
            System.out.println();
        }
    }
}