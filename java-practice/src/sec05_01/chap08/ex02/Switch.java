package sec05_01.chap08.ex02;

public class Switch extends FormElement {
    private boolean on;

    public Switch(int space, boolean on) {
        super(space);
        this.on = on;
    }

    @Override
    void func() {
        on = !on;
        System.out.printf("%s로 전환\n", on ? "ON" : "OFF");
    }
}
