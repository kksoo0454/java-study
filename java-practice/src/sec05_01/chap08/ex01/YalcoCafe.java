package sec05_01.chap08.ex01;

public class YalcoCafe extends YalcoGroup {
    public static String getCREED() {
        return (CREED.formatted("원두향은"));
    }

    protected static int lastNo = 1;
    public boolean isTakeout;

    public YalcoCafe(String name, boolean isTakeout) {
        super(lastNo, name);
        lastNo++;
        this.isTakeout = isTakeout;
    }

    @Override
    public void takeOrder() {
        System.out.printf("얄코카페 %s 음료를 주문해주세요."
                .formatted(super.intro()));
        if (!isTakeout) {
            System.out.println(" 매장에서 드시겠어요?");
        }
    }
}
