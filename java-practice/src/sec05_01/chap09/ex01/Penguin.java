package sec05_01.chap09.ex01;

public class Penguin extends Bird implements Swimmer, Hunter {
    @Override
    public void swim() {
        System.out.println("날개로 수영");
    }

    @Override
    public void hunt() {
        System.out.println("물고기 사냥");
    }
}
