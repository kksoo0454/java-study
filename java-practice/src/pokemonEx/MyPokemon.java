package pokemonEx;

public class MyPokemon {

    Pokemon[] pokemons = {
            new Pikachu(),
            new Bulbasaur(),
            new Charmander(),
            new Squirtle()
    };

    Pokemon myPokemon;

    public MyPokemon(Pokemon myPokemon) {
        this.myPokemon = myPokemon;
    }
}
