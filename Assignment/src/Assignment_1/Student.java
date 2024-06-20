package Assignment_1;

class Student extends User {
    public Student(String username, String password) {
        super(username, password);
    }

    public String getRole() {
        return "student";
    }
}
