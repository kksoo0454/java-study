package sec05_01.chap09.ex02;

import sec05.chap09.ex02.YalcoChicken;

public class Main {
    public static void main(String[] args) {

        FoodSafety.announcement();

        YalcoChicken store1 = new YalcoChicken();

        store1.regularInspection();
        store1.cleanKitchen();
        store1.employeeEducation();
    }
}

