package sec05_01.chap06.ex03;

import sec05_01.chap05.ex03.FireSlime;
import sec05_01.chap06.ex01.ShutDownButton;
import sec05_01.chap06.ex02.YalcoChicken;

public class Main {
    public static void main(String[] args) {

        Object obj1 = new Object();

        Object obj2 = new YalcoChicken(3, "판교");
        Object obj3 = new ShutDownButton();
        Object obj4 = new FireSlime();

        Object obj5 = true;
        Object obj6 = 1;
        Object obj7 = "Hello";

        Object[] objs = {
                obj1, obj2, obj3, obj4, obj5, obj6, obj7
        };

        for (Object obj : objs) {
            System.out.println(obj);
        }
    }
}
