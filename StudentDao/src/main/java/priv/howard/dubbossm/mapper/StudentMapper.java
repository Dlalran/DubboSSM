package priv.howard.dubbossm.mapper;

import priv.howard.dubbossm.pojo.Student;

public interface StudentMapper {
    /**
     * @Description DAO层，使用MyBatis的Mapper代替
     */
    Student queryStudentByStuNo(int stuNo);

    void addStudent(Student student);
}
