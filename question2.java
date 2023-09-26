package FirstjavaTest;

import java.util.Scanner;

public class GradeOfStudents {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		for (int i = 1; i <= 10; i++) { // here is the loop for 10 students
			System.out.print("Enter the name of student " + i + ": ");
			String name = scanner.nextLine();

			System.out.print("Enter the attendance percentage for " + name + ": ");
			double attendancePercentage = scanner.nextDouble();
			scanner.nextLine(); // the newline character

			char grade;

			// Determining the grades accordingly
			switch ((int) attendancePercentage) {
			case 90:
				grade = 'A'; // this shows the grade for the student who has got A
				break;
			case 80:
			case 81:
			case 82:
			case 83:
			case 84:
			case 85:
			case 86:
			case 87:
			case 88:
			case 89:
				grade = 'B'; // this shows the grade for the student who has got B
				break;
			case 70:
			case 71:
			case 72:
			case 73:
			case 74:
			case 75:
			case 76:
			case 77:
			case 78:
			case 79:
				grade = 'C'; // this shows the grade for the student who has got C
				break;
			case 60:
			case 61:
			case 62:
			case 63:
			case 64:
			case 65:
			case 66:
			case 67:
			case 68:
			case 69:
				grade = 'D';// this shows the grade for the student who has got D
				break;
			case 50:
			case 51:
			case 52:
			case 53:
			case 54:
			case 55:
			case 56:
			case 57:
			case 58:
			case 59:
				grade = 'E';// this shows the grade for the student who has got E
				break;
			default:
				grade = 'F'; // F for Fail (attendance below 45)
				break;
			}

			System.out.println(name + "'s grade is: " + grade);
		}

		scanner.close();
	}
}
