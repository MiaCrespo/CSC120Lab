import java.util.Scanner;

public class KangarooRoadkillCalculator {
    public static final Scanner scanner = new Scanner(System.in);
    public static final double ROADKILL_PROBABILITY = 1.47;
    public static final double ROAD_WIDTH = 0.01;
    public static void main(String[] args) {



        // To input side of square, road length, and 'roos
        System.out.print("Enter side of square in km  : ");
        double side = scanner.nextDouble();

        System.out.print("Enter roads length in km    : ");
        double roadLength = scanner.nextDouble();

        System.out.print("Enter number of 'roos       : ");
        int numberOfRoos = scanner.nextInt();

        // Calculations
        double area = side * side;
        double kangarooDensity = numberOfRoos / area;
        double roadSurfaceArea = ROAD_WIDTH * roadLength;

        double expectedKills = kangarooDensity * roadSurfaceArea * ROADKILL_PROBABILITY;

        // Output
        int kills = (int) expectedKills; // Convert to number of kills to integer
        double injuries = expectedKills - kills; // Calculate the number of kills

        System.out.println("Expected number of kills is : " + kills);

        if (injuries > 0) {
            System.out.println("Expected number of injuries : 1");
        } else {
            System.out.println("Expected number of injuries : 0");
        }

        scanner.close();
    }
}
