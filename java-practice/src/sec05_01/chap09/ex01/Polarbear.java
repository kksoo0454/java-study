package sec05_01.chap09.ex01;

public class Polarbear extends Mammal implements Hunter, Swimmer {
    public Polarbear() {
        super(false);
    }

    @Override
    public void hunt() {
        System.out.println(position + "물범 사냥");
    }

    @Override
    public void swim() {
        System.out.println("앞발로 수영");
    }
}
