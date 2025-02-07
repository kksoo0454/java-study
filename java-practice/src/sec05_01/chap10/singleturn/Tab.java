package sec05_01.chap10.singleturn;

public class Tab {
    Setting setting = Setting.getinstance();

    public Setting getSetting() {
        return setting;
    }
}
