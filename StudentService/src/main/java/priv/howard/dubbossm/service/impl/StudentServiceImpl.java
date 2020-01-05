package priv.howard.dubbossm.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import priv.howard.dubbossm.mapper.StudentMapper;
import priv.howard.dubbossm.pojo.Student;
import priv.howard.dubbossm.service.StudentService;

//通过Dubbo实现RPC，添加@Service
@Service
public class StudentServiceImpl implements StudentService {
    /**
     * @Description Service类
     */

    @Autowired
    @Qualifier("studentMapper")
    private StudentMapper studentMapper;

    @Override
    public void addStudent(Student student) {
        studentMapper.addStudent(student);
    }

    @Override
    public Student queryStudentByStuNo(int stuNo) {
        Student student = studentMapper.queryStudentByStuNo(stuNo);
        return student;
    }
}
