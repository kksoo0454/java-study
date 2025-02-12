package pokemonEx2;

public abstract class Pokemon {

    protected String name;
    protected int hp;
    protected int attack;
    protected int speed;
    protected TYPE type;

    protected enum TYPE {
        ELECTRIC("전기"), WATER("물");
        final String typeName;

        TYPE(String type) {
            this.typeName = type;
        }
    }

    public Pokemon(String name, int hp, int attack, int speed, TYPE type) {
        this.name = name;
        this.hp = hp;
        this.attack = attack;
        this.speed = speed;
        this.type = type;
    }

    void attack(Pokemon enemy) {
        System.out.printf("%s의 공격!\n", name);
        System.out.printf("%s의 타입은 %s이고 %s의 타입은 %s이다!\n",
                name, type.typeName, enemy.name, enemy.type.typeName);
        if (enemy.type == TYPE.WATER && type == TYPE.ELECTRIC) {
            System.out.println("효과가 굉장했다!");
            enemy.hp -= attack * 2;
        } else {
            enemy.hp -= attack;
        }
        System.out.printf("%s는 체력이 %d 남았다!\n", enemy.name, enemy.hp);

    }


}
