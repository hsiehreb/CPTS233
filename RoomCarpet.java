package MA1;

public class RoomCarpet {
    private RoomDimension size;
    private double carpetCost;

    public RoomCarpet(RoomDimension dim, double cost) {
        this.size = dim;
        this.carpetCost = cost;
    }

    public double getTotalCost() {
        return (size.getArea() * carpetCost);
    }

    public String toString() {
        return size + "\nCarpet Cost: " + carpetCost + "\nTotal Cost: " + getTotalCost();
    }
}
