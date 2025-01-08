package loop.ex;

public class WhileEx2 {

    public static void main(String[] args) {
        int num = 0;
        int i = 0;

        while (i < 10) {
            num = num + 1;
            if (num % 2 == 0) {
                System.out.println(num);
                i++;
            }else {
                continue;
            }
        }
    }
}
