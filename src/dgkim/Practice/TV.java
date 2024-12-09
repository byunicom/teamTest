package dgkim.Practice;

public class TV {
//    private boolean power;
//    private int channel;

    public void togglePower(boolean onOff){
        if (onOff==true) {
            System.out.println("전원이 켜졌습니다.");;
        }else{
            System.out.println("전원이 꺼졌습니다.");
        }
    }

    public void changeChannel(int newChannel){

        System.out.println("채널을 "+newChannel+"번으로 변경했습니다.");
    }
}
