package NaniAssignment.src;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CourseManager implements manageable<Course,Department>{

    List<Course> courseList;
    private Department department;
    Scanner scanner=new Scanner(System.in);

    public CourseManager( Department department) {
        courseList =new ArrayList<>(Course.listOfAllCourses());
        this.department = department;

    }

    @Override
    public void create(Department department) {
        System.out.println("Enter CourseName");
        String courseName=scanner.next();
        System.out.println("Enter creditHour");
        int creditHour=scanner.nextInt();
        Course course=new Course(courseName);
        courseList.add(course);
        department.assignCourse(course,creditHour);
    }

    @Override
    public void update(Course course) {
        System.out.println("what would you like to do to the course:"+course.getCourseName());

        System.out.println("press 1 if you want to set Credit hour");
        System.out.println("press 2 if you want to remove Student from a course");
        System.out.println("press 3 if you want to assign an instructor");
        int input=scanner.nextInt();
        switch (input){
            case 1->{
                System.out.println("enter CreditHour");
                int credithour=scanner.nextInt();
                course.setCreditHours(department,credithour);
            }
            case 2->{
                System.out.println("enter theID of the student");
                int id=scanner.nextInt();
                for (int i = 0; i < course.enrolledStudents.size(); i++) {
                    if(course.getEnrolledStudents().get(i).getId().equals(id)){
                        Student found=course.enrolledStudents.get(i);
                        course.removeStudent(found);
                    }
                }
            }
            default -> System.out.println("no case selected");
            // continues
        }
    }

    @Override
    public void delete(Course course) {
        if (courseList.contains(course)) {
            courseList.remove(course);
            department.coursesOffered.remove(course);
            course.getOnDepartments().remove(department);
        }
    }

    @Override
    public void viewDetails(Course course) {
        if(courseList.contains(course)) System.out.println(course);
    }


}
