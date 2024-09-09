package NaniAssignment.src;

public class Main {
    public static void main(String[] args) {
        var software=new Department("Software Engineering");
        var civilEng=new Department("Civil Engineering");

        var mathematics=new Course("Mathematics");
        var computerScience=new Course("computer Science");
        var hardware=new Course("hardware");
        var fundamentalOfPc=new Course("fundamentals");
        var instructor1=new Instructor("Tirfneh",computerScience);
        instructor1.getInstructors();
        var ins2=new Instructor("halefom",hardware);
        var ins3=new Instructor("natnael",mathematics);
        var ins4=new Instructor("Beki",fundamentalOfPc);
 var student1=new Student("hilina",software);
 var student2=new Student("yostina",software);
 var student3=new Student("etsubdink",software);
 var student4=new Student("amete",software);
 var student5=new Student("kiros",software);

 software.assignCourse(mathematics,99);
software.assignCourse(computerScience,8);
//software.assignCourse(hardware,4);
software.assignCourse(fundamentalOfPc,5);
        student1.enroll(mathematics);
        student1.enroll(mathematics);
        student1.unEnroll(mathematics);
        System.out.println(",,,");
        student1.enroll(mathematics);
        mathematics.addStudent(student1);
        System.out.println("    ;;; ");
        student1.enroll(mathematics);
        student2.enroll(mathematics);
        student3.enroll(mathematics);
        student4.enroll(mathematics);
        mathematics.removeStudent(student1);
        mathematics.removeStudent(student2);
        mathematics.removeStudent(student4);

        int credits=hardware.getCreditHours(civilEng);
        System.out.println(credits);
    }
}