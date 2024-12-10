package bangwoo.practice6.vehicle;

public class Car extends Vehicle{
    protected Car(){
        super("테슬라", 200);
    }
    public void drive() {
        System.out.println(name +" 자동차가 " + speed + "km/h로 주행합니다.");
    }
}
