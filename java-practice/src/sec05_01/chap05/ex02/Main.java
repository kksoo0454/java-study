package sec05_01.chap05.ex02;

public class Main {
    public static void main(String[] args) {

        Button enterButton = new Button("Enter");
        ShutDownButton stdnButton = new ShutDownButton();
        ToggleButton tglButton = new ToggleButton("CapsLock", false);

        enterButton.func();

        stdnButton.func();

        tglButton.func();
        tglButton.func();
        tglButton.func();
    }
}
