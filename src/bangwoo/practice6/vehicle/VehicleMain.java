package bangwoo.practice6.vehicle;

public class VehicleMain {
    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[2];

        Vehicle tesla = vehicles[0] = new Car();
        Vehicle baemin = vehicles[1] = new Bike("배민" ,300000);

        tesla.drive();
        baemin.drive();
    }
}
