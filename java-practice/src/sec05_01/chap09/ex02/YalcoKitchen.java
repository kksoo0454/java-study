package sec05_01.chap09.ex02;

public class YalcoKitchen implements FoodSafety {
    @Override
    public void cleanKitchen() {
        System.out.println("매일 주방 청소");
    }

    @Override
    public void employeeEducation() {
        System.out.println("직원 위생 교육");
    }
}
