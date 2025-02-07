package sec05_01.chap08.ex01;

public class Main {
    public static void main(String[] args) {

//        YalcoGroup yalcoGroup = new YalcoGroup(1, "서울"); //추상클래스 인스턴스 생성 불가

        YalcoChicken ychStore1 = new YalcoChicken("판교");
        YalcoChicken ychStore2 = new YalcoChicken("강남");

        YalcoCafe ycfStore1 = new YalcoCafe("울릉", true);
        YalcoCafe ycfStore2 = new YalcoCafe("강릉", false);

        YalcoGroup[] ycStores = {
                ychStore1, ychStore2, ycfStore1, ycfStore2
        };

        for (YalcoGroup ycstore : ycStores) {
            ycstore.takeOrder();
            System.out.println();
        }

        System.out.println("\n- - - - - \n");

        System.out.println(YalcoChicken.getCREED());
        System.out.println(YalcoCafe.getCREED());
    }
}
