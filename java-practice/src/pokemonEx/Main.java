package pokemonEx;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pokemon[] pokemons = {
                new Pikachu(),
                new Bulbasaur(),
                new Charmander(),
                new Squirtle()
        };

        Pokemon[] myPokemon;

        System.out.println("어떤 포켓몬을 데려갈거니?");
        for (Pokemon pokemon : pokemons) {
            System.out.println(pokemon.name);
        }

        String sanner = scanner.nextLine();
        for (Pokemon pokemon : pokemons) {
            if (pokemon.name.equals(sanner)) {
            } else {
                System.out.println("다시 골라주렴"); break;
            }
        }

//        System.out.printf("고른 포켓몬은 %s!", myPokemon.name);
    }
}
