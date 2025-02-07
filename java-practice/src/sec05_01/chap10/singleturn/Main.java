package sec05_01.chap10.singleturn;

public class Main {
    public static void main(String[] args) {
        Tab tab1 = new Tab();
        Tab tab2 = new Tab();
        Tab tab3 = new Tab();

        System.out.println(tab1.getSetting().getVolume());
        System.out.println(tab1.getSetting().getVolume());
        System.out.println(tab1.getSetting().getVolume());

        tab1.getSetting().volumeinc();
        tab1.getSetting().volumeinc();

        System.out.println(tab1.getSetting().getVolume());
        System.out.println(tab1.getSetting().getVolume());
        System.out.println(tab1.getSetting().getVolume());
    }
}
