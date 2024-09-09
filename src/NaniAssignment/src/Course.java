// i consider as one course can be taught by more than one instructor
package NaniAssignment.src;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

record CreditHours( Department department,Course course,int value){
}

public class Course {

    private String courseName;
    private int creditHours;
    private String courseCode;
    private String courseCodeStarter="C";
    private List<Instructor> instructorsOfThisCourse;
     List<Student> enrolledStudents;
     List<Course> preRequestCourses;
    private List< Department> onDepartments;

    private static int counter = 1000;
    public static final List<Course> courses=new ArrayList<>();

    public Course(String courseName) {
        this.courseName = courseName;
        this.courseCode = courseCodeStarter +counter++;
        preRequestCourses=new ArrayList<>();
        enrolledStudents=new LinkedList<>();
        onDepartments=new ArrayList<>();
        instructorsOfThisCourse=new ArrayList<>();

        courses.add(this);
    }

  public void assignToDepartment(Department department){ // the course can be on more than one department
        onDepartments.add(department);
  }

  public void assignInstructor(Instructor instructor){
        instructorsOfThisCourse.add(instructor);
  }

    public void setPreRequestCourses(List<Course> priorCourses) {
        boolean duplication=false;
        int counter=0;
        for (var course: priorCourses) {
            if(preRequestCourses.contains(course)) {
                duplication = true;
                counter++;
                continue;
            }
             preRequestCourses.add(course);
        }
        if(duplication)
            System.out.println(counter+" course/s are duplicated,"
                    +(priorCourses.size()-counter) + " courses are added");
    }

    public void setPreRequestCourse(Course course) {
        if(!preRequestCourses.contains(course)) {
            preRequestCourses.add(course);
            System.out.println("added successfully");
        }
        else System.out.println(" Course already set ");
    }

    public void removePreRequestCourse(Course course){
        if( preRequestCourses.contains(course)){
            preRequestCourses.remove(course);
            System.out.println("removed successfully");
        }
        else System.out.println("course was not preRequest");
    }


    public void addStudent(Student student){
        if(!enrolledStudents.contains(student) &&
                !student.isEnrolledInCourse() &&
                student.checkCriteriaToEnroll(this)) {
            System.out.println("student:'" + student.getName() + "' added successfully");
            enrolledStudents.add(student);
            student.enroll(this);
        }
        else if (!student.checkCriteriaToEnroll(this)) {
            System.out.println("student: " + student.getName() + "hasn't fulFiled the preRequests for courses");
        }
        else if(student.isEnrolledInCourse() || enrolledStudents.contains(student))    {
            System.out.println("student already enrolled ");
        }
    }

    public void removeStudent(Student student){
        if(enrolledStudents.contains(student) && student.isEnrolledInCourse()) {
            enrolledStudents.remove(student);
            student.unEnroll(this);
            System.out.println("student: '"+student.getName() +" ' Removed successfully");
        }
        else System.out.println("Student:'"+ student.getName()+ "' was not enrolled in this Course");
    }

    public void setCreditHours( Department department,int creditHour) {
        if (getOnDepartments().contains(department)) {
            creditHours = creditHour;
        }
    }

    public int getCreditHours(Department department) {
        return creditHours;
    }

    public List<Course> getPreRequestCourses() {
        return preRequestCourses;
    }

    public List<Instructor> getInstructorOfThisCourse() {
        return instructorsOfThisCourse;
    }

    public String getCourseName() {
        return courseName;
    }

    public List<Student> getEnrolledStudents() {
        return enrolledStudents;
    }

    public List<Department> getOnDepartments() {
        return onDepartments;
    }

    public static List<Course> listOfAllCourses(){
        return courses;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public String courseDetails() {
        return "Course{" +
                "courseName='" + courseName + '\'' +
                ", creditHours=" + creditHours +
                ", instructor=" + instructorsOfThisCourse +
                ", courseCode=" + courseCode +
                ", enrolledStudents=[" + enrolledStudents +"]"+
                ", preRequestCourses=[" + preRequestCourses +"]"+
                '}';
    }

    @Override
    public String toString() { // this will be how the course output will be for listOfAll courses
        return "Course{" +
                "courseName='" + courseName + '\'' +
                ", creditHours=" + creditHours +
                ", instructor=" + instructorsOfThisCourse +
                ", courseCode=" + courseCode +
                '}';
    }

        class CourseAnalytics{
        }
    }

