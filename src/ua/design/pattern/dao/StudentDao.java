package ua.design.pattern.dao;

import java.util.List;

public interface StudentDao {

    List<Student> getAllStudents();
    Student getStudent(int rolNo);
    void updateStudent(Student student);
    void deleteStudent(Student student);
}
