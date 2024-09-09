package NaniAssignment.src;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
 // instructor is not concerned of departments, he belong to only instructors of the collage
// only department managers are concerned about adding an instructor to their courses


public class InstructorManager implements manageable<Instructor,Department> {

     List<Instructor> instructorList;
     private String name;
     private String courseCode;
     private Department department;
     Scanner scanner = new Scanner(System.in);

     public InstructorManager() {
         instructorList = new ArrayList<>(Instructor.instructors);
     }

     @Override
     public void create(Department department) {
         boolean correctName = false;
         boolean correctCourseCode = false;
         int errorCounter = 0;

         while (!correctName || errorCounter < 4) {
             errorCounter++;
             try {
                 System.out.println("Enter CourseName");
                 String name = scanner.next();
                 correctName = true;
                 this.name = name;
             } catch (InputMismatchException error) {
                 System.out.println("not a valid input , enter only string with no space");
                 if (errorCounter == 2) System.out.println(" one last chance");
             }
         }
         while (!correctCourseCode) {
             try {
                 System.out.println("Enter CourseCode of the course the instructor teaches");
                 String courseCode = scanner.next();
                 correctCourseCode = true;
                 this.courseCode = courseCode;
             } catch (InputMismatchException error) {
                 System.out.println("not a valid input , enter only string with no space");
             }
         }

         Course courseAssigned = getTheCourse(courseCode);
         if (courseAssigned != null) {
             Instructor instructor = new Instructor(name, courseAssigned);
             courseAssigned.assignInstructor(instructor);
             instructor.addTeachingCourses(courseAssigned);
             instructorList.add(instructor);
         } else
             System.out.println("you have entered wrong CourseCode, CourseCode Starts with C");
     }

     private Course getTheCourse(String courseCode) {
         Course courseFound = null;
         for (Course i : Course.listOfAllCourses()) {
             if (courseCode.equalsIgnoreCase(i.getCourseCode())) {
                 courseFound = i;
             }
         }
         return courseFound;

     }

     @Override
     public void update(Instructor instructor) {
         boolean correctCourseCode = false;
         String courseID = null;
         System.out.println("press 1 if you want to edit name, press 2 if you want to add a course to the instructor");
         int identifier = scanner.nextInt();
         if (identifier == 1) {
             System.out.println("enter the corrected last name");
             String correctedName = scanner.next();
             instructor.setFullName(correctedName);
         } else if (identifier == 2) {
             while (!correctCourseCode) {
                 try {
                     System.out.println("enter the course Id of the course you want to assign the instructor");
                     courseID = scanner.next();
                     correctCourseCode = true;
                 } catch (InputMismatchException error) {
                     System.out.println("not a valid input , enter only String with no space");
                 }
             }
             Course courseFound = getTheCourse(courseID);
             courseFound.assignInstructor(instructor);
             instructor.addTeachingCourses(courseFound);

         } else {
             System.out.println("incorrect input");
         }
     }

        public void delete(Instructor instructor) {
       instructorList.remove(instructor);
        }

    @Override
    public void viewDetails(Instructor instructor) {
        System.out.println(instructor);
    }


}
