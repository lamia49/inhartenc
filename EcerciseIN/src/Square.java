public class Square extends Rectangle{
    public Square() {
    }

    public Square(String color, boolean fiiled, double width, double length) {
        super(color, fiiled, width, length);
    }

    public Square(double side){
        super.setLength(side);
    }
    public double getSide(){
        return super.getLength();
    }
    public void setSide(double side){

        super.setLength(side);
    }

    @Override
    public double area() {
        double area =Math.pow(getSide(),2);
        return area;
    }

    @Override
    public double peraimeter() {
        double p =getSide()*4;
        return p;
    }

    @Override
    public String toString() {
        return "Square{} " + super.toString();
    }
}
