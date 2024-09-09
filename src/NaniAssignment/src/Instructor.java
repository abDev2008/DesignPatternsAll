package NaniAssignment.src;

import java.util.ArrayList;
import java.util.List;

public class Instructor {
    private String instructorID;
    private String fullName;
    private String idStarter="IN00";
    private static int counter;

    private List<Course> teachingCourses;

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }


    public static  List<Instructor> instructors=new ArrayList<>();

    public Instructor(String lastName,Course courseToTeach) {
        this.fullName = lastName;
        instructorID = idStarter +(++counter);
        teachingCourses =new ArrayList<>();
        teachingCourses.add(courseToTeach);
        courseToTeach.assignInstructor(this);
        instructors.add(this);
    }


    public void addTeachingCourses(Course course) {
        teachingCourses.add(course);
        course.assignInstructor(this);
        System.out.println("instructor '" +fullName +" 'is assigned to "+course.getCourseName());
    }

    public String viewInstructorDetails() {
        return "Instructor{" +
                "instructorID='" + instructorID + '\'' +
                ", fullname='" + fullName + '\'' +
//                ", department=" + department +
                ", teachingCourses=" + teachingCourses +
                '}';
    }

    public List<Course> getTeachingCourses() {
        return teachingCourses;
    }

    @Override
    public String toString() {
        return "Instructor{" +
                "instructorID='" + instructorID + '\'' +
                ", fullname='" + fullName + '\'' +
//                ", department=" + department +
                '}';
    }

    public List<Instructor> getInstructors(){
        System.out.println("total number of instructors:"+counter);
        return instructors;
    }


    public String getInstructorID() {
        return instructorID;
    }

    public String getFullName() {
        return fullName;
    }
}
