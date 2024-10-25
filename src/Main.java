import school.managment.CourseManager;
import school.managment.Student;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main (String[] args) {

        CourseManager courseManager = new CourseManager();

        Student student1 = new Student("Ariana", 23, 154673);
        Student student2 = new Student("Bob", 23, 154673);
        Student student3 = new Student("Jack", 23, 154673);

        student1.enrollCourses( new String[] {"Math", "Science"});
        student2.enrollCourses("History");
        student3.enrollCourses("Math");

        student1.setTuition();
        student2.setTuition();
        student3.setTuition();

        courseManager.addStudent(student1);
        courseManager.addStudent(student2);
        courseManager.addStudent(student3);

        courseManager.displayAllStudents();








    }





}