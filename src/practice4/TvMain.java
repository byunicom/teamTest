package practice4;

public class TvMain {
    public static void main(String[] args) {
        TV tv = new TV();

        tv.togglePower();
        //tv.togglePower();

        tv.changeChannel(13);
        tv.changeChannel(28);
        tv.changeChannel(32);

        tv.showChannel();

    }
}
