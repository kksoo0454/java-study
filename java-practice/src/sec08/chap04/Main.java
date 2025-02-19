package sec08.chap04;

import sec07.chap04.*;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Map<Integer, String> numNameMap = new HashMap<>();
        //  💡 put 메소드를 사용하여 키와 값 삽입
        numNameMap.put(1, "홍길동");
        numNameMap.put(2, "전우치");
        numNameMap.put(3, "임꺽정");

        Map<String, Double> nameHeightMap = new HashMap<>();
        nameHeightMap.put("김철수", 176.8);
        nameHeightMap.put("이장신", 187.4);
        nameHeightMap.put("박숏달", 152.3);
        nameHeightMap.put("정기준", 171.2);

        Map<Side, ArrayList<Unit>> sideUnitsMap = new HashMap<>();
        sideUnitsMap.put(
                Side.BLUE,
                new ArrayList<>(
                        Arrays.asList(
                                new Swordman(Side.BLUE),
                                new Knight(Side.BLUE),
                                new MagicKnight(Side.BLUE))
                )
        );
        sideUnitsMap.put(
                Side.RED,
                new ArrayList<>(
                        Arrays.asList(
                                new Knight(Side.RED),
                                new Knight(Side.RED),
                                new Knight(Side.RED))
                )
        );

        //  💡 putAll : 대상 맵으로부터 전부 가져옴
        Map<Integer, String> numNameMapClone = new HashMap<>();
        numNameMapClone.putAll(numNameMap);

        //  💡 get 메소드에 키를 넣어 값 접근
        String no2 = numNameMap.get(2);
        Double leeHeight = nameHeightMap.get("이장신");
        //  ⚠️ 잘못된 키 입력시 null 반환
        String wrong1 = numNameMap.get(0);
        Double wrong2 = nameHeightMap.get(3);

        //  💡 keySet 메소드 - 키들의 Set(인터페이스) 반환
        Set<Integer> numSet = numNameMap.keySet();
        Set<Integer> numHSet = new HashSet<>();
        numHSet.addAll(numSet);

        //  keySet을 활용한 for-each
        for (var n : numNameMap.keySet()) {
            System.out.println(numNameMap.get(n));
        }
        for (var side : sideUnitsMap.keySet()) {
            for (var unit : sideUnitsMap.get(side)) {
                System.out.println(unit);
            }
        }

        // 💡 containsKey / containsValue : 키 / 값 포함되는 쌍 있는지 확인
        boolean contain1 = nameHeightMap.containsKey("박숏달");
        boolean contain2 = nameHeightMap.containsKey("장롱달");
        boolean contain3 = nameHeightMap.containsValue(171.2);

        System.out.println("\n- - - - -\n");

        Map<Attacker, Horse> atkHrsMap = new HashMap<>();

        Swordman kenshin = new Swordman(Side.RED);
        Knight lancelot = new Knight(Side.BLUE);

        atkHrsMap.put(kenshin, new Horse<>(40));
        atkHrsMap.put(lancelot, new Horse<>(50));
        atkHrsMap.put(new MagicKnight(Side.BLUE), new Horse<>(60));

        //  ⭐️ 키의 값이 참조형일 경우 변수 등에 저장되어 있어야 함
        Horse kenshinHorse = atkHrsMap.get(kenshin);
        Horse lancelotHorse = atkHrsMap.get(lancelot);
        //  ⚠️ 일반적인 방법으로는 꺼낼 수 없음
        Horse wrongHorse = atkHrsMap.get(new MagicKnight(Side.BLUE));

        //  이런 식으로밖에 꺼낼 수 없음
        for (var u : atkHrsMap.keySet()) {
            System.out.println(u + " : " + atkHrsMap.get(u));
        }

        //  💡 getOrDefault : 키에 해당하는 쌍이 없을 시 지정한 디폴트 값 반환
        String defName = numNameMap.getOrDefault(10, "김대타");
        Horse defHorse = atkHrsMap.getOrDefault(new MagicKnight(Side.BLUE), new Horse(40));

        //  💡 Entry 인터페이스 : 맵의 각 요소, 키와 값을 가짐
        //  - 클래스 살펴볼 것
        Set<Map.Entry<Integer, String>> numNameES = numNameMap.entrySet();
        for (var entry : numNameES) {
            int key = entry.getKey();
            String value = entry.getValue();
            System.out.printf("k: %d, v: %s\n", key, value);
            System.out.println(entry);
        }

        //  remove, clear, inEmpty 메소드들

        numNameMap.remove(1); //  주어진 키가 있다면 삭제
        numNameMap.remove(2, "황대장"); //  주어진 키와 값의 쌍이 있다면 삭제

        boolean isEmpty1 = nameHeightMap.isEmpty();
        nameHeightMap.clear();
        boolean isEmpty2 = nameHeightMap.isEmpty();

        //  ⭐️ 키 순으로 정렬됨 확인
        TreeMap<Integer, String[]> classKidsTMap = new TreeMap<>();
        classKidsTMap.put(3, new String[] {"서아", "이준", "아린"});
        classKidsTMap.put(9, new String[] {"하윤", "서준", "지호"});
        classKidsTMap.put(1, new String[] {"이서", "하준", "아윤"});
        classKidsTMap.put(7, new String[] {"지안", "은우", "예준"});
        classKidsTMap.put(5, new String[] {"서윤", "시우", "하은"});

        //  트리 전용 메소드들
        int firstKey = classKidsTMap.firstKey();
        int lastKey = classKidsTMap.lastKey();

        Map.Entry<Integer, String[]> firstEntry = classKidsTMap.firstEntry();
        Map.Entry<Integer, String[]> lastEntry = classKidsTMap.lastEntry();

        int ceil4 = classKidsTMap.ceilingKey(4);
        Map.Entry<Integer, String[]> floor4 = classKidsTMap.floorEntry(4);

        Map.Entry<Integer, String[]> pollF1 = classKidsTMap.pollFirstEntry();
        Map.Entry<Integer, String[]> pollF2 = classKidsTMap.pollFirstEntry();
        Map.Entry<Integer, String[]> pollL1 = classKidsTMap.pollLastEntry();
        Map.Entry<Integer, String[]> pollL2 = classKidsTMap.pollLastEntry();
    }
}
