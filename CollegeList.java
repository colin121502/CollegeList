package programmingExercise05;

import java.util.Scanner;

public class CollegeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Declare arrays for CollegeEmployee, Faculty, and Student objects
        CollegeEmployee[] collegeEmployees = new CollegeEmployee[4];
        Faculty[] faculties = new Faculty[3];
        Student[] students = new Student[7];

        char choice;
        int collegeEmployeeCount = 0;
        int facultyCount = 0;
        int studentCount = 0;

        do {
            System.out.print("Enter type of person (C for CollegeEmployee, F for Faculty, S for Student, Q to quit): ");
            choice = scanner.next().charAt(0);
            scanner.nextLine(); // Consume newline

            switch (Character.toUpperCase(choice)) {
                case 'C':
                    if (collegeEmployeeCount < 4) {
                        collegeEmployees[collegeEmployeeCount] = new CollegeEmployee();
                        collegeEmployees[collegeEmployeeCount].setData(scanner);
                        collegeEmployeeCount++;
                    } else {
                        System.out.println("Error: Maximum CollegeEmployees reached.");
                    }
                    break;
                case 'F':
                    if (facultyCount < 3) {
                        faculties[facultyCount] = new Faculty();
                        faculties[facultyCount].setData(scanner);
                        facultyCount++;
                    } else {
                        System.out.println("Error: Maximum Faculties reached.");
                    }
                    break;
                case 'S':
                    if (studentCount < 7) {
                        students[studentCount] = new Student();
                        students[studentCount].setData(scanner);
                        studentCount++;
                    } else {
                        System.out.println("Error: Maximum Students reached.");
                    }
                    break;
                case 'Q':
                    break;
                default:
                    System.out.println("Invalid choice.");
                    break;
            }
        } while (Character.toUpperCase(choice) != 'Q');

        scanner.close();

        System.out.println("College Employees:");
        if (collegeEmployeeCount == 0) {
            System.out.println("No College Employees entered.");
        } else {
            for (int i = 0; i < collegeEmployeeCount; i++) {
                collegeEmployees[i].display();
            }
        }

        System.out.println("Faculty:");
        if (facultyCount == 0) {
            System.out.println("No Faculties entered.");
        } else {
            for (int i = 0; i < facultyCount; i++) {
                faculties[i].display();
            }
        }

        System.out.println("Students:");
        if (studentCount == 0) {
            System.out.println("No Students entered.");
        } else {
            for (int i = 0; i < studentCount; i++) {
                students[i].display();
            }
        }
    }
}
