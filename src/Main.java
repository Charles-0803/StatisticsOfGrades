
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Read the number of students
        System.out.print("Enter the number of students: ");
        int number = input.nextInt();

        // Create an array to store the grades
        int[] scores = new int[number];

        // Read the grades and store them in the array
        System.out.println("Enter the grade of student: " );
        for (int i = 0; i < number; i++) {
            scores[i] = input.nextInt();
        }

        // Calculate the maximum, minimum, and average grades
        int maxGrade = Integer.MIN_VALUE;
        int minGrade = Integer.MAX_VALUE;
        int sum = 0;

        for (int score : scores) {
            if (score > maxGrade) {
                maxGrade = score;
            }
            if (score < minGrade) {
                minGrade = score;
            }
            sum += score;
        }

        double averageGrade = (double) sum / number;

        // Display the maximum, minimum, and average grades
        System.out.println("The maximum grade is " + maxGrade);
        System.out.println("The minimum grade is " + minGrade);
        System.out.println("The average grade is " + averageGrade);

        // Establish the stats array
        int[] stats = new int[5];

        for (int score : scores) {
            if (score > 80) {
                stats[4]++;
            } else if (score >= 61) {
                stats[3]++;
            } else if (score >= 41) {
                stats[2]++;
            } else if (score >= 21) {
                stats[1]++;
            } else {
                stats[0]++;
            }
        }

        // Create a bar graph representing the scores array
        System.out.println("Graph:");
        int[] barCounts = new int[5];

        for (int score : scores) {
            if (score > 80) {
                barCounts[4]++;
            } else if (score >= 61) {
                barCounts[3]++;
            } else if (score >= 41) {
                barCounts[2]++;
            } else if (score >= 21) {
                barCounts[1]++;
            } else {
                barCounts[0]++;
            }
        }

        int maxBars = 0;
        for (int count : barCounts) {
            if (count > maxBars) {
                maxBars = count;
            }
        }

        for (int i = maxBars; i > 0; i--) {
            System.out.print(i + "  > ");
            for (int j = 0; j < barCounts.length; j++) {
                if (barCounts[j] >= i) {
                    System.out.print("#######   ");
                } else {
                    System.out.print("          ");
                }
            }
            System.out.println();
        }



        input.close();


    }

}
