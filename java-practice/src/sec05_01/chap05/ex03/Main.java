package sec05_01.chap05.ex03;

public class Main {
    public static void main(String[] args) {

        Slime slime = new Slime();
        FireSlime fireSlime = new FireSlime();

        fireSlime.attack(slime);
    }
}
