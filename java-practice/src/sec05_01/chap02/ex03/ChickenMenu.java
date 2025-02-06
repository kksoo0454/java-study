package sec05_01.chap02.ex03;

public class ChickenMenu {
    String name;
    int price;
    String cook = "FRY";

    ChickenMenu(String name, int price) {
        this.name = name;
        this.price = price;
    }

    ChickenMenu(String name, int price, String cook) {
        this.name = name;
        this.price = price;
        this.cook = cook;
    }
}
