package sec05.chap08.ex01_01;

public class YalcoChicken extends YalcoGroup {
    public static String gerCreed() {
        return CREED.formatted("튀김옷은");
    }

    protected static int lastNo = 0;

    public YalcoChicken(String name) {
        super(++lastNo, name);

    }

}
