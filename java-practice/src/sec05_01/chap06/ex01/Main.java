package sec05_01.chap06.ex01;

public class Main {
    public static void main(String[] args) {

        Button[] buttons = {
                new Button("Enter"),
                new ShutDownButton(),
                new ToggleButton("CapsLock", false)
        };

        for (Button button : buttons) {
            button.func();
        }

        Button button = new Button("버튼");
        ToggleButton toggleButton = new ToggleButton("토글", true);
        ShutDownButton shutDownButton = new ShutDownButton();

        boolean typeCheck1 = button instanceof Button;
        boolean typeCheck2 = toggleButton instanceof Button;
        boolean typeCheck3 = shutDownButton instanceof Button;

        boolean typeCheck4 = button instanceof ShutDownButton;
        boolean typeCheck5 = button instanceof ToggleButton;

//        boolean typeCheck6 = shutDownButton instanceof ToggleButton;
//        boolean typeCheck7 = toggleButton instanceof ShutDownButton;

        Button[] buttons1 = {
                new Button("Space"),
                new ToggleButton("NumLock", false),
                new ShutDownButton()
        };

        for (Button btn : buttons1) {
            if (btn instanceof ShutDownButton) continue;
            btn.func();
        }
    }
}
