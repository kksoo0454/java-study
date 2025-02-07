package sec05_01.chap05.ex01;

public class Main {
    public static void main(String[] args) {

        YalcoChickenDT dTStore1 = new YalcoChickenDT(108, "철원");

        dTStore1.takeHallOrder();

        dTStore1.takeDTOrder();
        dTStore1.setDriveThruOpen(false);
        dTStore1.takeDTOrder();
    }
}
