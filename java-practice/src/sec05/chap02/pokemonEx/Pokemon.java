package sec05.chap02.pokemonEx;

public class Pokemon {
    String name;
    double hp;
    int attack;
    double defence;

    Pokemon(String name, double hp, int attack, double defence) {
        this.name = name;
        this.hp = hp;
        this.attack = attack;
        this.defence = defence;
    }

    void attack(Pokemon enemy) {
        enemy.hp -= attack * (1 - defence);
        System.out.printf("%s의 공격!\n%f의 데미지를 줬다!\n", this.name, attack * (1 - defence));
        System.out.printf("%s의 체력은 %f이다\n", enemy.name, enemy.hp);
    }
}
