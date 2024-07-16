package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentManager studentManager = new StudentManager();

        boolean exit = false;
        while (!exit) {
            System.out.println("1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Find Student by Roll Number");
            System.out.println("4. Remove Student by Roll Number");
            System.out.println("5. Display Top Student");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    scanner.nextLine(); // consume newline
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter roll number: ");

                    int rollNumber = scanner.nextInt();
                    System.out.print("Enter age: ");
                    int age = scanner.nextInt();
                    scanner.nextLine(); // consume newline

                    System.out.print("Enter course: ");
                    String course = scanner.nextLine();
                    System.out.print("Enter number of grades: ");

                    int numberOfGrades = scanner.nextInt();
                    double[] grades = new double[numberOfGrades];
                    for (int i = 0; i < numberOfGrades; i++) {


                        System.out.print("Enter grade " + (i + 1) + ": ");
                        grades[i] = scanner.nextDouble();
                    }
                    Student student = new Student(name, rollNumber, age, course, grades);

                    studentManager.addStudent(student);

                    break;
                case 2:
                    studentManager.displayAllStudents();
                    break;
                case 3:
                    System.out.print("Enter roll number: ");
                    int searchRollNumber = scanner.nextInt();
                    Student foundStudent = studentManager.findStudentByRollNumber(searchRollNumber);
                    if (foundStudent != null) {
                        foundStudent.displayInfo();
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;
                case 4:
                    System.out.print("Enter roll number: ");
                    int removeRollNumber = scanner.nextInt();
                    studentManager.removeStudentByRollNumber(removeRollNumber);
                    break;
                case 5:
                    studentManager.displayTopStudent();
                    break;
                case 6:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }

        scanner.close();
    }
}
