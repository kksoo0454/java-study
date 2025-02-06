package sec05_01.chap03.ex01;

public class YalcoChicken {
    static String brand = "얄코치킨";

    static String contact() {
        return "%s입니다. 무엇을 도와드릴까요?"
                .formatted(brand);
    }

    int no;
    String name;

    public YalcoChicken(int no, String name) {
        this.no = no;
        this.name = name;
    }

    String intro() {
        return "안녕하세요. %d점 %s호 입니다."
                .formatted(no, name);
    }
}
