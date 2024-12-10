package bangwoo.practice6.vehicle;

public class Vehicle {
    protected String name;
    protected int speed;

    public Vehicle(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    public void drive() {
        System.out.println("차량을 주행합니다.");
    }
}
