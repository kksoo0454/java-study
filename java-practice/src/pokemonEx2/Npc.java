package pokemonEx2;

public abstract class Npc extends GameSystem{
    protected String name;
    protected int npcMoney;
    protected Pokemon pokemon;
    int money = super.money;

    public Npc(String npcName, int npcMoney, Pokemon npcPokemon) {
        this.name = npcName;
        this.money = npcMoney;
        this.pokemon = npcPokemon;
    }

    public abstract void givemoney();

}
