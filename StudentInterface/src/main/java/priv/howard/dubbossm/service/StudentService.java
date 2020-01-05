package priv.howard.dubbossm.service;

import priv.howard.dubbossm.pojo.Student;

public interface StudentService {

    void addStudent(Student student);

    Student queryStudentByStuNo(int stuNo);
}
