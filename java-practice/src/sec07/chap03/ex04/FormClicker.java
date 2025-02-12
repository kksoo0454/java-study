package sec07.chap03.ex04;

public class FormClicker<T extends FormElement & Clickable> {
    private T formClick;

    public FormClicker(T formClick) {
        this.formClick = formClick;
    }

    //  ⭐️ 조건의 클래스와 인터페이스의 기능 사용 가능
    //  - 자료형의 범위를 특정해주므로

    public void printElemMode() {
        formClick.printMode();
    }

    public void clickElem() {
        formClick.onClick(); // 이 부분이 Clickable의 메소드
    }
}
