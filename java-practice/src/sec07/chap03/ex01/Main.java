package sec07.chap03.ex01;

import sec05.chap08.ex01.YalcoChicken;

public class Main {

    public static void main(String[] args) {
        int randNum = pickRandom(123, 456);
        boolean randbool = pickRandom(true, false);
        String randStr = pickRandom("마루치", "아라치");

        YalcoChicken store1 = new YalcoChicken("판교");
        YalcoChicken store2 = new YalcoChicken("역삼");
        YalcoChicken randStore = pickRandom(store1, store2);

        //  ⚠️ 타입이 일관되지 않고 묵시적 변환 불가하면 오류
//        double randFit = pickRandom("hello", "world");
        double randDb1 = pickRandom(12, 34);

        Double[] array1 = new Double[] {
                1.2, 2.3, 3.4, 4.5, 5.6, 6.7, 7.8
        };
        Character[] array2 = new Character[]{
                'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K'
        };

        arraySwap(array1, 3, 5);
        arraySwap(array2, 2, 7);

    }

    // 제네릭 메소드
    // T : 타입변수, 원하는 어떤 이름으로든 명명 가능

    public static <T> T pickRandom(T a, T b) {
        return Math.random() > 0.5 ? a : b;
    }

    public static <T> void arraySwap(T[] array, int a, int b) {
        if (array.length <= Math.max(a, b)) return;
        T temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }


}
