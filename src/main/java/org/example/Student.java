package org.example;

public class Student {
    private String name;
    private int rollNumber;
    private int age;
    private String course;
    private double[] grades;

    // Constructor
    public Student(String name, int rollNumber, int age, String course, double[] grades) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.age = age;
        this.course = course;
        this.grades = grades.clone();
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public double[] getGrades() {
        return grades.clone();
    }

    public void setGrades(double[] grades) {
        this.grades = grades.clone();
    }

    // Calculate and return the average grade of the student
    public double calculateAverageGrade() {
        double sum = 0;
        for (double grade : grades) {
            sum += grade;
        }
        return sum / grades.length;
    }

    // Print the student details along with the average grade
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
        System.out.println("Average Grade: " + calculateAverageGrade());
    }
}

