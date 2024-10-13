package school.managment;

public class CourseManager {
    private Student [] students;
    private int studentCount;

    public CourseManager(Student[] students) {
        this.students = new Student[10];
        this.studentCount = 0;
    }

    public void addStudent(Student student) {
        if (studentCount < students.length) {
            students[studentCount++] = student;
        } else {
            System.out.println("No space to add more students.");
        }
    }

    public void displayAllStudents() {
        for(int i = 0; i < studentCount; i++) {
            students[i].displayDetails();
            System.out.println();
        }
    }
}
