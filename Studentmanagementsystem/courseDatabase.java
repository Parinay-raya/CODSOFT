
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class courseDatabase {
    private List<course> courses;
    private List<Student> students;

    public courseDatabase() {
        this.courses = new ArrayList<>();
        this.students = new ArrayList<>();
    }

    public void addCourse(course course) {
        courses.add(course);
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public List<course> listAvailableCourses() {
        return courses;
    }

    public course findCourseByCode(String courseCode) {
        for (course course : courses) {
            if (course.getCourseCode().equals(courseCode)) {
                return course;
            }
        }
        return null;
    }

    public Student findStudentByID(String studentID) {
        for (Student student : students) {
            if (student.getStudentID().equals(studentID)) {
                return student;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        courseDatabase db = new courseDatabase();
        Scanner scanner = new Scanner(System.in);

        // Sample data
        db.addCourse(new course("CS101", "Intro to Computer Science", "Basics of CS", 30, "MWF 10-11"));
        db.addCourse(new course("MATH123", "Calculus I", "Introductory Calculus", 25, "TTh 9-10:30"));
        db.addStudent(new Student("S001", "Alice"));
        db.addStudent(new Student("S002", "Bob"));

        while (true) {
            System.out.println("1. List Courses\n2. Register Course\n3. Drop Course\n4. Exit");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            if (choice == 1) {
                System.out.println("Available Courses:");
                for (course course : db.listAvailableCourses()) {
                    System.out.println(course.getCourseCode() + " - " + course.getTitle() + " (Slots available: " + course.getAvailableSlots() + ")");
                }
            } else if (choice == 2) {
                System.out.print("Enter Student ID: ");
                String studentID = scanner.nextLine();
                Student student = db.findStudentByID(studentID);

                if (student == null) {
                    System.out.println("Student not found.");
                    continue;
                }

                System.out.print("Enter Course Code: ");
                String courseCode = scanner.nextLine();
                course course = db.findCourseByCode(courseCode);

                if (course == null) {
                    System.out.println("Course not found.");
                    continue;
                }

                if (student.registerCourse(course)) {
                    System.out.println("Successfully registered.");
                } else {
                    System.out.println("Failed to register. Course may be full.");
                }
            } else if (choice == 3) {
                System.out.print("Enter Student ID: ");
                String studentID = scanner.nextLine();
                Student student = db.findStudentByID(studentID);

                if (student == null) {
                    System.out.println("Student not found.");
                    continue;
                }

                System.out.print("Enter Course Code: ");
                String courseCode = scanner.nextLine();
                course course = db.findCourseByCode(courseCode);

                if (course == null) {
                    System.out.println("Course not found.");
                    continue;
                }

                if (student.dropCourse(course)) {
                    System.out.println("Successfully dropped.");
                } else {
                    System.out.println("Failed to drop course.");
                }
            } else if (choice == 4) {
                break;
            }
        }

        scanner.close();
    }
}

