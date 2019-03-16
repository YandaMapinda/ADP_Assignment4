package software.principles.s.r.p.liskov.principle.solution;

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
class DeviceWithoutEngines extends TransportationDevice{
    void startMoving(){
        System.out.println("Transport is moving");
    }
}
class DeviceWithEngines extends TransportationDevice{
    Engine engine;
    public Engine getEngine() {
        return engine;
    }

    @Override
    public void startEngine() {
        System.out.println("Start engine");
    }
}
class Car extends DeviceWithEngines{
    @Override
    public void startEngine() {
        System.out.println("Start engine");
    }
}
class Bicycle extends DeviceWithoutEngines {
    @Override
    public void startMoving(){
        System.out.println("Start engine");
    }
}









