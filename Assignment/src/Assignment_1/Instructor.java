package Assignment_1;

class Instructor extends User {
    public Instructor(String username, String password) {
        super(username, password);
    }

    public String getRole() {
        return "instructor";
    }
}