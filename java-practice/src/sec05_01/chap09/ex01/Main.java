package sec05_01.chap09.ex01;

public class Main {
    public static void main(String[] args) {
        Polarbear polarbear = new Polarbear();
        Mammal mammal1 = polarbear;
        Swimmer swimmer1 = polarbear;

        Penguin penguin1 = new Penguin();
        penguin1.repriduce();

        GlidingLizard glidingLizard = new GlidingLizard();
        Eagle eagle = new Eagle();

        Hunter[] hunters = {
                polarbear, glidingLizard, eagle
        };

        for (Hunter hunter : hunters) {
            hunter.hunt();
        }
    }
}
