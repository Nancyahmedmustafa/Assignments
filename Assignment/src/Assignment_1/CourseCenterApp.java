package Assignment_1;

import java.util.*;

public class CourseCenterApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Data data = new Data();

        System.out.println("Welcome to the Course Center App!");

        String username, password, role;

        do {
            System.out.print("Enter username: ");
            username = scanner.nextLine();
            System.out.print("Enter password: ");
            password = scanner.nextLine();

            role = data.isValidUser(username, password);

            if (role == null) {
                System.out.println("Invalid username or password. Please try again.");
            }
        } while (role == null);

        System.out.println("Welcome, " + username + "!");

        if (role.equals("student")) {
            System.out.println("Here are the available courses:");
            Course[] courses = data.getCourses();
            for (Course course : courses) {
                System.out.println("- " + course.getCourseName());
            }
        } else if (role.equals("instructor")) {
            System.out.println("Here are the available students.");
            Student[] students = data.getStudents();
            for (Student student : students) {
                System.out.println("- " + student.username);
            }
        }

        scanner.close();
    }
}