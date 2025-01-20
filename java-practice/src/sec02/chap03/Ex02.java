package sec02.chap03;

public class Ex02 {

    public static void main(String[] args) {

        System.out.println("원주율: " + 3.14);
        System.out.println("원의 둘레: 지름 X " + 3.14);
        System.out.println("원의 넓이: 반지름의 제곱 X " + 3.14);
        System.out.println("구의 부피: 반지름의 세제곱 X 4/3 X " + 3.14);

        System.out.println("\n- - - - \n"); // \n : 줄바꿈

        double pi = 3.14;

        System.out.println("원주율: " + pi);
        System.out.println("원의 둘레: 지름 X " + pi);
        System.out.println("원의 넓이: 반지름의 제곱 X " + pi);
        System.out.println("구의 부피: 반지름의 세제곱 X 4/3 X " + pi);

        System.out.println("\n- - - - \n"); // \n : 줄바꿈

        pi = 3.141592;

        System.out.println("원주율: " + pi);
        System.out.println("원의 둘레: 지름 X " + pi);
        System.out.println("원의 넓이: 반지름의 제곱 X " + pi);
        System.out.println("구의 부피: 반지름의 세제곱 X 4/3 X " + pi);

        //자바의 변수: 앞에 담을 데이터의 자료형을 명시
        // - (이후 배울 var 제외)
        int age; // 변수 선언: 주머니 만들기

        age = 20;

        // 아직 값이 없으므로 사용할 수는 없음
        System.out.println(age);

    }
}
