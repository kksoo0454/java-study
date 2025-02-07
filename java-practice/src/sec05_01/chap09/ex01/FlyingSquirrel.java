package sec05_01.chap09.ex01;

public class FlyingSquirrel extends Mammal implements Flyer {
    public FlyingSquirrel() {
        super(true);
    }

    @Override
    public void fly() {
        System.out.println("안아줘요로 비행");
    }
}
