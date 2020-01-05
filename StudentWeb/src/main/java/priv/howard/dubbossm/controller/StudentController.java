package priv.howard.dubbossm.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import priv.howard.dubbossm.pojo.Student;
import priv.howard.dubbossm.service.StudentService;

@Controller
@RequestMapping("StudentController")
public class StudentController {
    /**
     * @Description Controller，由SpringMVC实现
     * TODO 通过JSON形式直接return对象会报错-没有转换器
     * TODO 使用本机Zookeeper和Dubbo出错，出现IP:192.168.2.2，尝试关闭VMWare虚拟网卡
     */

//    通过@Reference进行Service的远程调用RPC
    @Reference
    private StudentService studentService;

    @RequestMapping("queryStudent")
    public String queryStudent(int stuNo, Model model) {
        Student student = studentService.queryStudentByStuNo(stuNo);
        model.addAttribute("student", student);
        return "success";
    }

    @RequestMapping("addStudent")
    public String addStudent(Student student, Model model) {
        studentService.addStudent(student);
        model.addAttribute("student", student);
        return "success";
    }
}
