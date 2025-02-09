package pokemonEx;

public class Pokemon {

    public static String LOVE = "포켓몬은 인간을 좋아해";

    public static void love() {
        System.out.println(LOVE);
    }

    protected int level = 1;

    protected String name;
    protected String type;

    protected int hp;
    protected int attack;
    protected int defence;
    protected int spAtk;
    protected int spDef;
    protected int Speed;

    boolean moreEttect;

    public Pokemon(String name, String type, int hp, int attack, int defence, int spAtk, int spDef, int speed) {
        this.name = name;
        this.type = type;
        this.hp = hp * 3;
        this.attack = attack;
        this.defence = defence;
        this.spAtk = spAtk;
        this.spDef = spDef;
        Speed = speed;
    }

    public void attack(Pokemon enemy){
        int demage = attack / 3;
        if (enemy.type.equals("물")) {
            moreEttect = true;
            demage = demage * 2;
        }
        enemy.hp -= demage;
        System.out.printf("%s의 공격! ", name);

        if (moreEttect == true) {
            demage = demage * 2;
            System.out.print("효과가 굉장했다! ");
        }
        System.out.printf("데미지는 %d이다!\n", demage);


        System.out.printf("%s의 체력이 %d가 되었다!\n", enemy.name, enemy.hp);
    }


}
