package MA1;

public class RoomDimension {
    private double length;
    private double width;

    public RoomDimension(double len, double w) {
        this.length = len;
        this.width = w;
    }

    public double getArea() {
        return (width * length);
    }

    public String toString() {
        return "\nLength: " + length + "\nWidth: " + width + "\nArea: " + getArea();
    }
}
