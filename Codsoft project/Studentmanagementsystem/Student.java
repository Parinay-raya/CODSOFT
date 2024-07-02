import java.util.ArrayList;
import java.util.List;

    public class Student {
        private String studentID;
        private String name;
        private List<course> registeredCourses;

        public Student(String studentID, String name) {
            this.studentID = studentID;
            this.name = name;
            this.registeredCourses = new ArrayList<>();
        }

        public String getStudentID() {
            return studentID;
        }

        public String getName() {
            return name;
        }

        public List<course> getRegisteredCourses() {
            return registeredCourses;
        }

        public boolean registerCourse(course course) {
            if (course.enrollStudent()) {
                registeredCourses.add(course);
                return true;
            }
            return false;
        }

        public boolean dropCourse(course course) {
            if (registeredCourses.contains(course) && course.dropStudent()) {
                registeredCourses.remove(course);
                return true;
            }
            return false;
        }
    }


