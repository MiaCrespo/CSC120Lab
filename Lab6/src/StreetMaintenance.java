import java.util.Scanner;

/**
 * @author Mia
 * 1st method to stores house numbers and the ages of the people living in each house on a street
 * It calculates the total age of people in each house and then the total age of the street
 */
public class StreetMaintenance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // input the number of houses on the street
        System.out.print("How many houses on the street?   : ");
        int numHouses = scanner.nextInt();
        System.out.println();

        // single array to store the house numbers
        int[] houseNumbers = new int[numHouses];

        // jagged 2D array to store the ages in each house
        int[][] houseAges = new int[numHouses][];

        // for loop to input the house numbers
        for (int i = 0; i < numHouses; i++) {
            System.out.print("What is the next house number?   : ");
            houseNumbers[i] = scanner.nextInt();
        }
        System.out.println();

        // for loop to input the number of people and their ages for each house
        for (int i = 0; i < numHouses; i++) {
            System.out.print("How many people live in number " + houseNumbers[i] + " : ");
            int numPeople = scanner.nextInt();

            // initialize the array for the ages of people in this house
            houseAges[i] = new int[numPeople];

            // input ages of people in the house
            for (int j = 0; j < numPeople; j++) {
                System.out.print("What is the age of person " + (j + 1) + "      : ");
                houseAges[i][j] = scanner.nextInt();
            }
            System.out.println();
        }

        // analyze and print results
        analyzeData(houseNumbers, houseAges);
    }

    /**
     * 2nd method to calculate and display the total age of people in each house
     * also displays the total age of all the people on the street
     *
     * @param houseNumbers array of the the house numbers
     * @param houseAges    jagged 2D array of the ages of people in each house
     */
    public static void analyzeData(int[] houseNumbers, int[][] houseAges) {
        int totalStreetAge = 0;

        // for loop of each house
        for (int i = 0; i < houseNumbers.length; i++) {
            int totalHouseAge = 0;

            // calculate the total age for the current house
            for (int age : houseAges[i]) {
                totalHouseAge += age;
            }

            // print the total calculated age for the current house
            System.out.println("House " + houseNumbers[i] + " has a total age of " + totalHouseAge);
            // add current house's total age to the street's total age
            totalStreetAge += totalHouseAge;
        }
        // print total age for the entire street
        System.out.println("The street has a total age of " + totalStreetAge);
    }
}
