package sec05.chap02.pokemonEx;

public class Main {
    public static void main(String[] args) {

        Pokemon pikachu = new Pokemon("피카츄", 20, 5, 0.2);
        Pokemon squirtle = new Pokemon("꼬부기", 20, 5, 0.2);

        pikachu.attack(squirtle);

    }
}
