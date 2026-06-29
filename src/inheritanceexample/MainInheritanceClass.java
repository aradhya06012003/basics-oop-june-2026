package inheritanceexample;

public class MainInheritanceClass {
    public static void main(String[] args){
        System.out.println("---------Vehicle parent class----------");
        Vehicle vehicle = new Vehicle();
        vehicle.start();
        vehicle.stop();
        vehicle.fuel();

        System.out.println("---------Water Vehicle child class----------");
        WaterVehicle waterVehicle = new WaterVehicle();
        waterVehicle.start();
        waterVehicle.stop();
        waterVehicle.fuel();
        waterVehicle.travelsOnWater();

        System.out.println("---------Air Vehicle child class----------");
        AirVehicle airVehicle = new AirVehicle();
        airVehicle.start();
        airVehicle.stop();
        airVehicle.fuel();
        airVehicle.travelsOnAir();

        System.out.println("---------Road Vehicle child class----------");
        RoadVehicle roadVehicle = new RoadVehicle();
        roadVehicle.start();
        roadVehicle.stop();
        roadVehicle.fuel();
        roadVehicle.travelsOnRoad();
    }
}
