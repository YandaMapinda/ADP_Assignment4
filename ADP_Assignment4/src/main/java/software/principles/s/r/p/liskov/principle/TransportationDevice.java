package software.principles.s.r.p.liskov.principle;

import org.apache.catalina.Engine;

public class TransportationDevice {
    String name;
    double speed;
    Engine engine;

    public String getName() {
        return name;
    }

    public Engine getEngine() {
        return engine;
    }

    public double getSpeed() {
        return speed;
    }
    public void startEngine(){
        System.out.println("Start engine");
    }
}
class Car extends TransportationDevice{
    @Override
    public void startEngine(){
        System.out.println("Start engine");
    }
}
class Bicycle extends TransportationDevice{
    @Override
    public void startEngine(){
        System.out.println("Start engine");
    }
}



