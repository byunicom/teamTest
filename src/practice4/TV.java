package practice4;

public class TV {
    private boolean power = false;
    private int channel;

    public void togglePower() {
        power = !power;
        if (power == true) {
            System.out.println("TV가 켜졌습니다.");
        } else {
            System.out.println("TV가 꺼졌습니다.");
        }
    }

    public int changeChannel(int newChannel) {
        if (power == false) {
            if (newChannel > 0) {
                System.out.println("티비를 키세요?...");
                return newChannel;
            }
        }
        channel = newChannel;
        System.out.println(channel + " 채널로 변경했습니다.");
        return channel;
    }

    public void showChannel() {
        System.out.println("현재 채널은 " + channel + " 입니다.");
    }
}
