package pokemonEx2;

import java.util.Scanner;

public class GameSystem {
    Scanner scanner = new Scanner(System.in);

    protected int money = 0;
    protected static Pokemon myPokemon;

    protected static Npc[] npcs = {
            new Kid(),
            new Kid()
    };
    protected static Npc battleNpc;

    public GameSystem() {
    }

    // 오프닝, 포켓몬 선택 메소드
    public void opening() {
        System.out.println("- - - - -");
        Pokemon[] pokemons = {
                new Pikachu(),
                new Squirtle()
        };

        System.out.println("데려갈 포켓몬을 선택해주렴!");
        for (Pokemon pokemon : pokemons) {
            System.out.printf("%s ", pokemon.name);
        }
        System.out.println();
        String putPokemonName = scanner.nextLine();

        while (true) {
            for (Pokemon pokemon : pokemons) {
                if (putPokemonName.equals(pokemon.name)) {
                    myPokemon = pokemon;
                    System.out.printf("오! 데려갈 포켓몬은 %s구나!\n",
                            myPokemon.name);
                    break;
                }
            }

            if (myPokemon == null) {
                System.out.println("다시 골라주렴");
                putPokemonName = scanner.nextLine();
            } else if (myPokemon != null) {
                break;
            }
        }
        System.out.println("- - - - -");
    }

    // 승리 시 용돈획득 메소드
    public static void getMoney() {
        System.out.println("- - - - -");
        System.out.printf("와! %s에게 용돈 %d원을 받았다!\n",
                battleNpc.name, battleNpc.money);
        System.out.println("- - - - -");
    }

    // 배틀 시작 알림 메소드
    public void startingBattle() {
        battleNpc = npcs[0];
        System.out.println("- - - - -");
        System.out.printf("%s와 눈이 마주쳤다! 배틀시작!\n", battleNpc.name);
        System.out.println("- - - - -");
        Pokemon.battle();
    }
}


