package software.principles.s.r.p.open.and.close.Bettere.solution;

public interface Shape{
    public double calculateArea();
}

class Rectangle implements Shape{
    double length;
    double width;
    public double calculateArea(){
        return length * width;
    }
}

class Circle implements Shape{
    public double radius;
    public double calculateArea(){
        return (22/7)*radius*radius;
    }
}
