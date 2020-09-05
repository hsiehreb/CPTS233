package MA1;

import java.util.Scanner;

/**
 * Name: Rebecca Hsieh
 * CptS 233: MicroAssignment #1
 * Date: September 4, 2020
 * gitRepo url:
 */

public class CarpetCalculator {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        System.out.print("Width of Room (ft): ");
        double width = scnr.nextDouble();

        System.out.print("Length of Room (ft): ");
        double length = scnr.nextDouble();

        System.out.print("Price Per Square Foot: ");
        double price = scnr.nextDouble();

        RoomDimension rd = new RoomDimension(length, width);
        RoomCarpet rc = new RoomCarpet(rd, price);

        System.out.println(rc);
    }
}
