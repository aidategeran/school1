package school.managment;

public class Student extends Person {
    private int studentId;
    private String [] enrolledCourses;
    private double tuition;

    public Student(String name, int age, int studentId) {
        super(name, age);
        this.studentId = studentId;

    }

    public void enrollCourses(String [] courses){
        this.enrolledCourses = courses;
    }

    public void enrollCourses(String course){
        String[] newCourses = new String[this.enrolledCourses.length+1];
        System.arraycopy(this.enrolledCourses, 0, newCourses, 0, this.enrolledCourses.length);
        newCourses[enrolledCourses.length] = course;
        this.enrolledCourses = newCourses;
    }


    public double getTuition() {
        return tuition;
    }

    public void setTuition() {
        this.tuition = enrolledCourses.length * 500;
    }


    public void displayDetails(){
        super.displayDetails();
        System.out.println("Student ID: " + this.studentId);
        System.out.println("Enrolled Courses: ");
        for (String course: enrolledCourses){
            System.out.println("-" + course);
        }
        System.out.println("Tuition: $ " + this.tuition);
    }
}
