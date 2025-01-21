package array.ex;

import java.util.Scanner;

public class ArrayEx7_1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] score = new int[4][3];
        int[] grade = new int[3];
        int[] sum = new int[4];

        //[ [],[] ]
        //[ [],[] ]
        //[ [],[] ]
        //[ [],[] ]

        for (int i = 0; i < score.length; i++) {
            System.out.println((i + 1) + "번 학생의 성적을 입력하세요:");
            System.out.print("국어 점수: ");
            score[i][0] = input.nextInt();
            System.out.print("영어 점수: ");
            score[i][1] = input.nextInt();
            System.out.print("수학 점수: ");
            score[i][2] = input.nextInt();

            for (int j = 0; j < sum.length; j++) {
                sum[j] = score[j][0] + score[j][1] + score[j][2];
                }
            }

            for (int i = 0; i < score.length; i++) {
                System.out.println(i + "번 학생의 총점: " + sum[i] + ", 평균: " + ((double) sum[i] / 3));
        }
    }
}