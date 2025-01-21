package method.ex;

public class MethodEx2Ref {

    public static void main(String[] args) {
        int count = 3;
        message("hello", 5);
    }

    public static void message(String message, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(message);
        }
    }
}
