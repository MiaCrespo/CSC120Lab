import java.util.Scanner;

public class IAm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder qualities = new StringBuilder();
        String sentence;

        System.out.println("Please enter sentences, . to end.");

        while (true) {
            sentence = scanner.nextLine();  // reads the input sentence

            // check if the input is just a period "."
            if (sentence.equals(".")) {
                break;  // exit the loop if a period is entered
            }

            // to check if the sentence starts with "I am "
            if (sentence.startsWith("I am ")) {
                String quality = sentence.substring(5);

                // add the quality to the continuous list of qualities with a comma after
                if (qualities.length() > 0) {
                    qualities.append(", ");
                }
                qualities.append(quality);
            }
        }

        // output
        System.out.println("The qualities are " + qualities + ".");
    }
}
