package bangwoo.practice6.vehicle;

public class Bike extends Vehicle {
    private String name;
    private int speed;

     Bike(String name, int speed) {
        super(name, speed);
         this.name = name;
         this.speed = speed;
    }

    public void drive() {
        System.out.println(name + " 오토바이가 " + speed + "km/s 로주행합니다.");
    }
}
