import java.util.ArrayList;
import java.util.Scanner;

class Student {
    private String name;
    private String id;
    private int age;
    private double gpa;

    // constructor
    public Student(String name, String id, int age, double gpa) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.gpa = gpa;

    }

    // Getters
    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public double getGpa() {
        return gpa;
    }

    // setters
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    // toString
    @Override
    public String toString() {
        return " ID = " + id + " ,Name = " + name + ", Age = " + age + ", GPA = " + gpa;
    }

}

class StudentManagement {
    // List to store student object
    private static ArrayList<Student> students = new ArrayList<>();
    public static Scanner sc = new Scanner(System.in);

    // Method to add student
    public static void addStudent() {
        System.out.println("Enter student Name: ");
        String name = sc.nextLine();

        System.out.println("Enter student ID: ");
        String id = sc.nextLine();

        System.out.println("Enter student age: ");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter student grade: ");
        double gpa = sc.nextDouble();
        sc.nextLine();

        // create student object and add to list
        Student student = new Student(name, id, age, gpa);
        students.add(student);
        System.out.println("Student added successfully");
    }

    // Method to view all student
    public static void viewStudents() {
        if (students.isEmpty()) {
            System.out.println("No student found");
            return;
        }
        System.out.println("List of students: ");
        for (Student student : students)

        {
            System.out.println(student);
        }
    }

    // Method to search for a student by ID
    public static void searchStudent() {
        System.out.println("Enter student ID to search: ");
        String id = sc.nextLine();

        boolean found = false;
        for (Student student : students) {
            if (student.getId().equals(id)) {
                System.out.println("Student found: ");
                System.out.println(student);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Student with ID" + id + "not found");
        }
    }

    // Method to delete a student by ID
    public static void deleteStudent() {
        System.out.print("Enter student ID to delete: ");
        String id = sc.nextLine();

        // Remove student using lambda condition
        boolean removed = students.removeIf(student -> student.getId().equals(id));
        if (removed) {
            System.out.println("Student with ID" + id + "deleted  successfully");
        } else {
            System.out.println("Student with ID" + id + "not found");
        }
    }
}

public class Main {
    public static void main(String[] s) {
        boolean running = true;
        // display menu repeatedly until user exit
        while (running) {
            System.out.println("\nStudent management system");
            System.out.println("1. Add student");
            System.out.println("2. View all students");
            System.out.println("3. Search student");
            System.out.println("4. Delete student");
            System.out.println("5. exit");
            System.out.println("Enter your choices");
            // Read user menu choice
            int choice = StudentManagement.sc.nextInt();
            StudentManagement.sc.nextLine();
            // perform actions based on user's choice

            switch (choice) {
                case 1:
                    StudentManagement.addStudent();
                    break;
                case 2:
                    StudentManagement.viewStudents();
                    break;
                case 3:
                    StudentManagement.searchStudent();
                    break;
                case 4:
                    StudentManagement.deleteStudent();
                    break;
                case 5:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice please try again.");
            }
        }
        System.out.println("Program exited. Goodbye!");
        StudentManagement.sc.close();
    }
}