package sec07.chap03.ex04;

public class Main {
    public static void main(String[] args) {

        FormClicker<Button> fc1 = new FormClicker<>(new Button());
        FormClicker<Switch> fc2 = new FormClicker<>(new Switch(true));

        fc1.printElemMode();
        fc2.clickElem();
        fc1.clickElem();

//        FormClicker<TextInput> fc3 = new FormClicker<>(new TextInput());
//        FormElement<HyperLink> fc4 = new FormClicker<>(new HyperLink());

    }
}
