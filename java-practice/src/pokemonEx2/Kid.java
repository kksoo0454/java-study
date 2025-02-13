package pokemonEx2;

public class Kid extends Npc {

    public Kid() {
        super("반바지꼬마", 10,
                new Squirtle());
    }

    @Override
    public void givemoney() {
        System.out.println("졌다!! 내 돈을 받아");
        money += npcMoney;
    }
}
