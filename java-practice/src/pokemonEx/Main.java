package pokemonEx;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Pokemon[] pokemons = {
                new Pikachu(),
                new Bulbasaur(),
                new Charmander(),
                new Squirtle()
        };

        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < pokemons.length; i++) {
            if (pokemons[i].name.equals(scan)) {
                MyPokemon myPokemon = new MyPokemon(pokemons[i]);
            }
        }





    }
}
