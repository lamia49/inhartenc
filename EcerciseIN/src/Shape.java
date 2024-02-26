public class Shape {
    private String color;
    private boolean fiiled;
    public Shape() {
    }

    public Shape(String color, boolean fiiled) {
        this.color = color;
        this.fiiled = fiiled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFiiled() {
            return fiiled;

    }

    public void setFiiled(boolean fiiled) {
        if(color!=null) {
            this.fiiled = fiiled;
        }
    }

    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                ", fiiled=" + fiiled +
                '}';
    }
}
