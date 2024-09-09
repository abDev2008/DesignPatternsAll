package NaniAssignment.src;
import NaniAssignment.src.Department;
import NaniAssignment.src.Student;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;


public class StudentManagement implements manageable<Student, Department>,Enrollable<Student> {
    List<Student> studentList;
    private Department department;
    Scanner scanner = new Scanner(System.in);

    public StudentManagement(Department department) {
        studentList = new ArrayList<>(Student.studentsList);
        this.department = department;
    }

    @Override
    public void enroll(Student student, Course course) {
        if (student.checkCriteriaToEnroll(course)) {
            student.enroll(course);
        } else {
            System.out.println("selected student doesn't fullfill requirements for selected course");
            System.out.println("the preRequest courses are:" + course.getPreRequestCourses());
        }
    }

    @Override
    public void unEnroll(Student student, Course course) {
        if (student.getCoursesEnrolled().contains(course)) {
            student.unEnroll(course);
        } else System.out.println("selected student was not enrolled in the course ");
    }


    @Override
    public void create(Department onDepartment) {
        this.department = onDepartment;
        String lastName = "";
        boolean correctName = false;

        while (!correctName) {
            try {
                System.out.println("enter Lastname");
                lastName = scanner.next();
                correctName = true;
            } catch (InputMismatchException error) {
                System.out.println("not a valid input , enter only string with no space");
            }
        }

        Student student = new Student(lastName, department);
        studentList.add(student);
        department.addStudent(student);
    }
    @Override
    public void update(Student student) {
        System.out.println("if you want to edit his name:click 1 , if you want to add to your department:click 2");
        int identifier = scanner.nextInt();
        if (identifier == 1) {
            System.out.println("enter corrected name");
            String correctedName=scanner.next();
            student .setName(correctedName);
        }
        if(identifier==2) {
            Department department1 = student.getMajorDepartment();
            department1.removeStudent(student);
            department.addStudent(student);
        }

    }

    @Override
    public void delete(Student student) {
        if(studentList.contains(student)) {
         department.removeStudent(student);
        }
    }

    @Override
    public void viewDetails(Student student) {
        if(studentList.contains(student)) {
            System.out.println(student);
        }
        System.out.println("student doesn't belong here");
    }
}
