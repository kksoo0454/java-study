package sec05_01.chap10.singleturn;

public class Setting {

    private static Setting setting;

    private Setting() {};

    public static Setting getinstance() {
        if (setting == null) {
            setting = new Setting();
        } return setting;
    }

    int volume = 5;

    public void volumeinc() {
        volume++;
    }

    public void volumedec() {
        volume--;
    }

    public int getVolume() {
        return volume;
    }
}
