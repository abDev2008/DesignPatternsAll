// i dont understand why i should use Generics here, since i can replace type S with Student
// and the U in the method with Course
package NaniAssignment.src;

public interface Enrollable <S extends Student >{

    void enroll(S student,Course course);

    void unEnroll(S student,Course course);
}
