package sec05_01.chap04.ex02;

public class Main {
    public static void main(String[] args) {

        Button button1 = new Button('1', 1);

//        Button.mode = "OCEAN";
        Button.switchMode();

//        button1.space = 3;
        button1.setSpace(3);
        button1.setSpace(-1);

//        char button1Print = button1.print;
        String button1Info = button1.getButtonInfo();
    }
}
