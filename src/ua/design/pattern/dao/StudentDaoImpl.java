package ua.design.pattern.dao;

import java.util.ArrayList;
import java.util.List;

public class StudentDaoImpl implements StudentDao {
    private List<Student> students;

    public StudentDaoImpl(){
        students = new ArrayList<Student>();
        students.add(new Student("Robert", 0));
        students.add(new Student("John", 1));
    }
    @Override
    public List<Student> getAllStudents() {
        return students;
    }

    @Override
    public Student getStudent(int rolNo) {
        return students.get(rolNo);
    }

    @Override
    public void updateStudent(Student student) {
        students.get(student.getRolNo()).setName(student.getName());
        System.out.println("Student: Roll No " + student.getRolNo() + ", updated in the database");
    }

    @Override
    public void deleteStudent(Student student) {
        students.remove(student.getRolNo());
        System.out.println("Student: Roll No " + student.getRolNo() + ", deleted from database");
    }
}
