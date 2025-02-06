package sec05_01.chap02.ex01;

public class Slime {
    double hp = 50;
    int attack = 8;
    double defence = 0.2;

    void attack(Slime enemy) {
        enemy.hp -= attack * (1 - defence);
        System.out.printf("적의 체력이 %f가 되었다!", enemy.hp);
    }
}
