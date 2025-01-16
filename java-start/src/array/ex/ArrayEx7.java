package array.ex;

import java.util.Scanner;

public class ArrayEx7 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] score = new int[4][2];
        int[] sumAndAverage = new int[2];

        //[ [],[] ]
        //[ [],[] ]
        //[ [],[] ]
        //[ [],[] ]

        for (int i = 0; i <= 3; i++) {
            System.out.println((i + 1) + "번 학생의 성적을 입력하세요:");
            System.out.print("국어 점수: ");
            int language = input.nextInt();
            System.out.print("영어 점수: ");
            int english = input.nextInt();
            System.out.print("수학 점수: ");
            int math = input.nextInt();

            int sum = language + english + math;
            double average = (double) sum / 3;

            score [i][0] = sum;
            score [i][1] = (int) average;
            }

            for (int i = 0; i < score.length; i++) {
                System.out.println(i + "번 학생의 총점: " + score[i][0] + ", 평균: " + score[i][1]);
        }
    }
}