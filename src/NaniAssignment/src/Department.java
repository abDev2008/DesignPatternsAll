package NaniAssignment.src;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private String departmentName;
    private int totalCreditHours;
    public  List<Course> coursesOffered;
    private  List<Instructor> instructors;

public Department(String departmentName){
    this.departmentName=departmentName;
    coursesOffered=new ArrayList<>();
    instructors=new ArrayList<>();
}

    public void assignCourse(Course course,int creditHours) {
        if (!coursesOffered.contains(course)) {
            course.assignToDepartment(this);
            coursesOffered.add(course);
            setCreditHours(course,creditHours);
            totalCreditHours+=creditHours;
            assignAnotherInstructor(course,course.getInstructorOfThisCourse().get(0));
        }
        else {
            System.out.println("course already assigned");
        }
    }


 public void  assignAnotherInstructor(Course course,Instructor instructor) {
     if (coursesOffered.contains(course) && instructor.getTeachingCourses().contains(course)) {
         instructors.add(instructor);
         instructor.addTeachingCourses(course);
         course.assignInstructor(instructor);
     } else if (!coursesOffered.contains(course)) {
         System.out.println("the course need to be assigned to the department");
     }
     else if (!instructor.getTeachingCourses().contains(course)){
         System.out.println("selected instructor doesn't instruct the selected course ");
     }
 }

public void addStudent(Student student){
    student.setMajorDepartment(this);
}
public void removeStudent(Student student){
Student.studentsList.remove(student);
}


    public Instructor getInstructor( Course course) {
        return course.getInstructorOfThisCourse().get(0);
    }

    public String getDepartmentName() {
    return departmentName;
    }

    public  List<Course> getCoursesOffered() {
        return coursesOffered;
    }

    private void setCreditHours( Course course, int value) {
    course.setCreditHours(this,value);
    }


    @Override
    public String toString() {
        return "Department {" +
                "departmentName='" + departmentName + '\'' +
                ", coursesOffered=" + coursesOffered +
                ", instructors=" + instructors +
                '}';
    }
}
// Questions,
//1,  what if the user wants to assign instructor before he assigns courses,?
// to avoid this i have made it mandatory to add courses in the constructor
// but what if i didn't?
//2, i believe adding an instructor is not neccessary,
// b.c whenever a course is added i made  an instructor of the course to be added