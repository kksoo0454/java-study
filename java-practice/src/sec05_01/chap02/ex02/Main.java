package sec05_01.chap02.ex02;

public class Main {
    public static void main(String[] args) {

        int[] ary1 = {3, 5, 9, 2, 8, 1, 4};
        int[] ary2 = {1, 2, 3};

        IntArrayInfo aryInt1 = new IntArrayInfo(ary1);
        IntArrayInfo aryInt2 = new IntArrayInfo(ary2);

        int ary1Max = aryInt1.max;
        double arg2Avg = aryInt2.average;
        int ary1n2Sum = aryInt1.sum + aryInt2.sum;
    }
}
