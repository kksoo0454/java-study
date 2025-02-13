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

    // 배틀 중 공격 메소드
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


    // 배틀 메소드
    static void battle() {
        while (true) {
                if (GameSystem.myPokemon.speed > GameSystem.battleNpc.pokemon.speed) {
                    GameSystem.myPokemon.attack(GameSystem.battleNpc.pokemon);
                    if (GameSystem.battleNpc.pokemon.hp <= 0) {
                        System.out.println("배틀에서 이겼다!");
                        GameSystem.getMoney();
                        break;
                    }
                } else {
                    GameSystem.battleNpc.pokemon.attack(GameSystem.myPokemon);
                    if (GameSystem.myPokemon.hp <= 0) {
                        System.out.println("당신은 눈앞이 캄캄해졌다. . .");
                        break;
                    }
                }
            }
        }
    }
