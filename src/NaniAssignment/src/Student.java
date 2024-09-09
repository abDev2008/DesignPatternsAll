package NaniAssignment.src;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String Name;
    private String Id;
    private Department majorDepartment;
    private List<Course> coursesEnrolled;
    private boolean enrolledInCourse;
    private int creditHourTook;
    private String idStarter="ST1000";
    private static int counter;

    public static List<Student> studentsList=new ArrayList<>();

    protected Student(String lastName,Department department) {
        this.Name =lastName ;
        majorDepartment = department;
        Id =idStarter+ ++counter;
        this.coursesEnrolled= new ArrayList<Course>();
        studentsList.add(this);
        department.addStudent(this);
    }

    protected void enroll(Course course) {
        if(majorDepartment.getCoursesOffered().contains(course)) {
            this.enrolledInCourse = true;
            if (!majorDepartment.getCoursesOffered().contains(course))
                System.out.println("course " + course.getCourseName() + " is not in your department/ not added in your department");
            else if (!checkCriteriaToEnroll(course)) {
                System.out.println("you must take preRequest courses for" + course);
                System.out.println("the preRequest are" + course.getPreRequestCourses());
            } else if (coursesEnrolled.contains(course)) {
                System.out.println("already enrolled in the course");
            } else {
                coursesEnrolled.add(course);
                creditHourTook += course.getCreditHours(getMajorDepartment());
                course.enrolledStudents.add(this);

                System.out.println(" Student '" + getName() + "' enrolled course: '" + course.getCourseName() + "' successfully ");
            }
        }
        else System.out.println("the course doesn't belong to your Department");
    }

    protected void unEnroll(Course course) {
        if (coursesEnrolled.contains(course)) {
            enrolledInCourse=false;
            coursesEnrolled.remove(course);
            course.enrolledStudents.remove(this);
            creditHourTook-=course.getCreditHours(getMajorDepartment());
//            System.out.println("course:"+ course.getCourseName()+ " UnEnrolled sucessfully");
        }
    }

    protected boolean checkCriteriaToEnroll(Course course) { // check if the criteria is fulfilled
         if(coursesEnrolled.containsAll(course.getPreRequestCourses()))
            return true;
        return false;
    }

    public void setName(String lastName) {
        Name = lastName;
    }

    public void setMajorDepartment(Department majorDepartment) {
        this.majorDepartment = majorDepartment;
        majorDepartment.addStudent(this);
    }

    protected List<Course> getCoursesEnrolled() {
        return coursesEnrolled;
    }

    protected String getName() {

        return Name;
    }
    public Department getMajorDepartment() {
          return majorDepartment;
    }

    protected int getCreditHourTook() {
        return creditHourTook;
    }

    public String getId() {

        return Id;
    }

    public boolean isEnrolledInCourse() {
        return enrolledInCourse;
    }

    protected AccedemicStanding getAccedemicStanding(){
        return AccedemicStanding.FRESHMAN.getAccademicStanding(creditHourTook);
}

    @Override
    public String toString() {
        return "Student [" +
                "name=" + Name +
                ", Id=" + Id +
                ", majorDepartment='" + majorDepartment.getDepartmentName() + '\'' +
                ", coursesEnrolled="+ getCoursesEnrolled();
        }
    }
