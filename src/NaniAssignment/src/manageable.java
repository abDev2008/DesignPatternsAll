package NaniAssignment.src;

public interface manageable<T,S extends Department> {
    // T can be a Student, An instructor, or a course
    void create(S department );
    // what is he creating, Student? Instructor? Department
    void update(T type);
    void delete(T type );
    void viewDetails(T type);
}
