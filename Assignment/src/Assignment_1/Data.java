package Assignment_1;

class Data {
    private Student[] students;
    private Instructor[] instructors;
    private Course[] courses;

    public Data() {

        students = new Student[] {
            new Student("student1", "stuPass1"),
            new Student("student2", "stuPass2"),
            new Student("student3", "stuPass3"),
            new Student("student4", "stuPass4")
        };


        instructors = new Instructor[] {
            new Instructor("instructor1", "instPass1"),
            new Instructor("instructor2", "instPass2"),
            new Instructor("instructor3", "instPass3"),
            new Instructor("instructor4", "instPass4")
        };


        courses = new Course[] {
            new Course("Java Programming"),
            new Course("Web Development"),
            new Course("Data Science"),
            new Course("Machine Learning")
        };
    }

    public String isValidUser(String username, String password) {
        for (Student student : students) {
            if (student.username.equals(username) && student.password.equals(password)) {
                return "student";
            }
        }

        for (Instructor instructor : instructors) {
            if (instructor.username.equals(username) && instructor.password.equals(password)) {
                return "instructor";
            }
        }

        return null;
    }

    public Course[] getCourses() {
        return courses;
    }
    
    public Student[] getStudents() {
        return students;
    }
    
}