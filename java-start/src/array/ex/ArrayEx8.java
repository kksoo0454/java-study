package array.ex;

import java.util.Scanner;

public class ArrayEx8 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /*
        함수로 학생수 입력받고
        과목 String으로 문자열 리스트 지정해서 반복 출력
        각각 학생의 점수 리스트로 저장 예) student[1] = {10, 20, 30}


         */

        String[] subject = {"국어", "영어", "수학"};
        int studentGlade [][];


        System.out.print("학생 수를 입력하세요: ");
        int studentCount = input.nextInt();

        studentGlade = new int[studentCount][subject.length]; //[3][3]

        for (int i = 0; i < studentCount; i++) {
            System.out.println((i + 1) + "번 학생의 성적을 입력하세요: ");
            for (int j = 0; j < subject.length; j++) {
                System.out.print(subject[j] + "점수: ");
                studentGlade[i][j] = input.nextInt();
            }
        }

        for (int i = 0; i < studentCount; i++) {
            int total = 0;
            for (int j = 0; j < subject.length; j++) {
                total = total + studentGlade[i][j];
            }
            System.out.println((i + 1) + "번 학생의 총점: " + total + ", 평균: " + (double) total / studentCount);
        }
    }
}
