import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int gachaQuantity = 0;
        String[] gachaList = new String[0];


        while (true) {

            System.out.println("===============");
            System.out.println("메뉴를 선택하세요.");
            System.out.println("===============");
            System.out.println("1. 가챠 등록 | 2. 가챠 뽑기 | 3. 가챠 확인 | 4. 종료");
            int menu = scanner.nextInt();

            switch (menu) {
                case 1:
                    System.out.println("전체 가챠의 개수를 입력하세요.");
                    gachaQuantity = scanner.nextInt();
                    gachaList = new String[gachaQuantity];
                    scanner.nextLine();

                    for (int i = 0; i < gachaQuantity; i++) {
                        System.out.print("등록할 가챠의 이름: ");
                        String gachaName = scanner.nextLine();
                        System.out.print("등록할 가챠의 수량: ");
                        int gachaNum = scanner.nextInt();

                        for (int j = 0; j <= gachaNum - 1; j++) {
                            gachaList[i + j] = gachaName;
                        }
                        i += gachaNum - 1;
                        scanner.nextLine(); //가챠 리스트 생성 완료
                    }
                    break;
                case 2:
                    scanner.nextLine();
                    System.out.print("1를 입력하세요: ");
                    int gachaGo = scanner.nextInt();

                    if (gachaGo == 1) {
                        if (gachaQuantity != 0) {
                            System.out.println("가챠를 돌리는 중 . . .");
                            int randomGachaNum = random.nextInt(gachaList.length);
                            String thisGacha = gachaList[randomGachaNum];
                            System.out.printf("와! %s를 뽑았습니다!\n", gachaList[randomGachaNum]);
                            gachaList[randomGachaNum] = "이미 뽑음";
                            for (int i = 0; i < gachaQuantity; i++) {
                                System.out.print(gachaList[i] + " ");
                            }
                            System.out.println();
                        } else {
                            System.out.println("등록된 가챠가 없습니다.");
                        }
                        break;
                    }
                }
            }
        }
    }
