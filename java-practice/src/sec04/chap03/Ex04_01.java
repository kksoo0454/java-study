package sec04.chap03;

public class Ex04_01 {

    public static void main(String[] args) {

        String pokemonList[][] = {
                {"이상해씨", "풀타입", "덩굴채찍"},
                {"파이리", "불타입", "화염방사"},
                {"꼬부기", "물타입", "거품광선"}
        };

        for (String[] pokemonStatus : pokemonList) {
            String result = "";
            for (String pokemon : pokemonStatus) {
                result  += pokemon + " ";
            }
            result = result.trim().concat("\n");
            System.out.println(result);
        }
    }
}
