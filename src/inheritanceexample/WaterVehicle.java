package inheritanceexample;

public class WaterVehicle extends Vehicle{

    public void travelsOnWater(){
        System.out.println("these travel on Water");
    }
    @Override
    public void start(){
        System.out.println("Water vehicle started");
    }
    @Override
    public void stop(){
        System.out.println("Water vehicle stopped");
    }
    @Override
    public void fuel(){
        System.out.println("Water vehicle fueled");
    }
}
