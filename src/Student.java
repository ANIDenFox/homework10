import java.util.ArrayList;
class Student {
    private String firstName;
    private String lastName;
    private String groupNumber;
    private ArrayList<Course> courses;

    public Student(String firstName, String lastName, String groupNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.groupNumber = groupNumber;
        this.courses = new ArrayList<>();
    }

    public void addCourse(Course course) {
        courses.add(course);
        course.addStudent(this);
    }

    public void removeCourse(Course course) {
        courses.remove(course);
        course.removeStudent(this);
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public String getGroupNumber() {
        return groupNumber;
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    @Override
    public String toString() {
        return getFullName();
    }
}