package sec05_01.chap08.ex01;

public class YalcoChicken extends YalcoGroup {
    public static String getCREED() {
        return CREED.formatted("튀김옷은");
    }
    protected static int lastNo = 1;

    public YalcoChicken(String name) {
        super(lastNo, name);
        lastNo ++;
    }

    @Override
    public void takeOrder() {
        System.out.printf("얄코치킨 %s 치킨을 주문해주세요.", super.intro());
    }
}

