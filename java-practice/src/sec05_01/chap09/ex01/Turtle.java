package sec05_01.chap09.ex01;

public class Turtle extends Mammal implements Swimmer {
    public Turtle() {
        super(true);
    }

    @Override
    public void swim() {
        System.out.println("팔다리로 수영");
    }
}
