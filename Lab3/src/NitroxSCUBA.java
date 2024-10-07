import java.util.Scanner;

public class NitroxSCUBA {
    public static final Scanner scanner = new Scanner(System.in);
    public static final int FEET_PER_ATMOSPHERE = 33;
    public static final double MAX_02_PRESSURE = 1.4;
    public static final double CONTINGENCY_O2_PRESSURE = 1.6;
    public static void main(String[] args) {

//----define
        double ambientPressure;
        double O2_PRESSURE;
        double depth;
        double percentageO2;
        char oxygenGroup;

 //----calculate
        System.out.print("Enter depth and percentage O2    : ");
        depth = scanner.nextDouble();
        percentageO2 = scanner.nextDouble();

        ambientPressure = (depth / FEET_PER_ATMOSPHERE + 1);
        O2_PRESSURE = ((percentageO2 / 100) * ambientPressure);
        oxygenGroup = (char) ((int) (O2_PRESSURE * 10) + (int) 'A');

//----Exceeds
        boolean exceedsMaxPressure = O2_PRESSURE > MAX_02_PRESSURE;
        boolean exceedsContingencyPressure = O2_PRESSURE > CONTINGENCY_O2_PRESSURE;

//----Display the results
        System.out.println("Ambient pressure: " + ambientPressure);
        System.out.println("O2 Pressure: " + O2_PRESSURE);
        System.out.println("O2 Group: " + oxygenGroup);
        System.out.println("Exceeds maximal O2 Pressure: " + exceedsMaxPressure);
        System.out.println("Exceeds contigency O2 Pressure: " + exceedsContingencyPressure);

    }
}


