package inheritanceexample;

public class AirVehicle extends Vehicle{

    public void travelsOnAir(){
        System.out.println("these travel on Air");
    }
    @Override
    public void start(){
        System.out.println("Air vehicle started");
    }
    @Override
    public void stop(){
        System.out.println("Air vehicle stopped");
    }
    @Override
    public void fuel(){
        System.out.println("Air vehicle fueled");
    }
}
