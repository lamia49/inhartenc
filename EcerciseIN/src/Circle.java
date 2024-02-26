public class Circle extends Shape {
    private double radius=1.0;

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean fiiled, double radius) {
        super(color, fiiled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
       double area=Math.PI*Math.pow(radius,2);
       return area;
    }
    public double getPraimeter(){

        double p= Math.PI*2*radius;
        return p;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                "} " + super.toString();
    }
}
