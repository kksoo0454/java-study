package method.ex;

import javax.xml.transform.Source;

public class MethodEx3 {

    public static void main(String[] args) {
        int balancd = 10000;

        //입금 500
        int depositAmount = 1000;
        balancd += depositAmount;
        System.out.println(depositAmount + "원을 입금하였습니다. 현재 잔액: " + balancd + "원");

        //출금 200
        int withdrawAmount = 2000;
        if (balancd >= withdrawAmount) {
            balancd = -withdrawAmount;
            System.out.println(withdrawAmount + "원을 출금하였습니다. 현재 잔액: " + balancd + "원");
        } else {
            System.out.println(withdrawAmount + "원을 출금하려 했으나 잔액이 부족합니다.");
        }
        System.out.println("최종 잔액: " + balancd + "원");
    }
}
