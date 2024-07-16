package org.example;

import java.util.ArrayList;
import java.util.List;

public class StudentManager {
    private List<Student> students;

    // Constructor to initialize the student list
    public StudentManager() {
        students = new ArrayList<>();
    }

    // Add a student to the list
    public void addStudent(Student student) {
        students.add(student);
    }

    // Display information for all students
    public void displayAllStudents() {
        for (Student student : students) {
            student.displayInfo();
            System.out.println();
        }
    }

    // Find and return a student by their roll number
    public Student findStudentByRollNumber(int rollNumber) {
        for (Student student : students) {
            if (student.getRollNumber() == rollNumber) {
                return student;
            }
        }
        return null; // Return null if student is not found
    }

    // Remove a student from the list by their roll number
    public void removeStudentByRollNumber(int rollNumber) {
        students.removeIf(student -> student.getRollNumber() == rollNumber);
    }

    // Display the student with the highest average grade
    public void displayTopStudent() {
        if (students.isEmpty()) {
            System.out.println("No students available.");
            return;
        }

        Student topStudent = students.get(0);
        for (Student student : students) {
            if (student.calculateAverageGrade() > topStudent.calculateAverageGrade()) {
                topStudent = student;
            }
        }
        System.out.println("Top Student:");
        topStudent.displayInfo();
    }
}

