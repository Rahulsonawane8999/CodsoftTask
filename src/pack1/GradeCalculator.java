package pack1;
	import java.util.Scanner;

	public class GradeCalculator {
	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        int totalMarks = 0;
	        int numOfSubjects;
	        double averagePercentage;
	        String grade;

	        System.out.print("Enter the number of subjects: ");
	        numOfSubjects = input.nextInt();

	        int[] marks = new int[numOfSubjects];

	        for (int i = 0; i < numOfSubjects; i++) {
	            System.out.print("Enter marks obtained in subject " + (i+1) + ": ");
	            marks[i] = input.nextInt();
	            totalMarks += marks[i];
	        }

	        averagePercentage = (double) totalMarks / numOfSubjects;

	        if (averagePercentage >= 90) {
	            grade = "A+";
	        } else if (averagePercentage >= 80) {
	            grade = "A";
	        } else if (averagePercentage >= 70) {
	            grade = "B";
	        } else if (averagePercentage >= 60) {
	            grade = "C";
	        } else if (averagePercentage >= 50) {
	            grade = "D";
	        } else {
	            grade = "F";
	        }

	        System.out.println("Total Marks: " + totalMarks);
	        System.out.println("Average Percentage: " + averagePercentage);
	        System.out.println("Grade: " + grade);
	    }
	}

