package sec05_01.chap06.ex01;

public class Button {

    private String print;

    public Button(String print) {
        this.print = print;
    }

    public void func() {
        System.out.println(print + " 입력 적용");
    }
}
