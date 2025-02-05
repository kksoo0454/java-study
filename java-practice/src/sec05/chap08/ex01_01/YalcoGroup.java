package sec05.chap08.ex01_01;

public abstract class YalcoGroup {
    protected static final String CREED = "우리의 %s 얄팍하다.";

    protected final int no;
    protected  final String name;

    public YalcoGroup (int no, String name) {
        this.no = no;
        this.name = name;
    }

    public String intro () {
        return "%d호 %s점입니다.".formatted(no, name);
    }

    public abstract void takeOrder ();
}
