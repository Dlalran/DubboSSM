package priv.howard.dubbossm.pojo;

import java.io.Serializable;

public class Student implements Serializable {
    /**
     * @Description 学生实体POJO
     * 注意：如果该类对象需要从内存序列化到硬盘，或者需要经过网络运输，则必须实现序列化接口
     */

    private static final long serialVersionUID = 3818567935561450040L;

    private int stuNo;
    private String stuName;
    private int stuAge;

    public Student() {
    }

    public Student(int stuNo, String stuName, int stuAge) {
        this.stuNo = stuNo;
        this.stuName = stuName;
        this.stuAge = stuAge;
    }

    public int getStuNo() {
        return stuNo;
    }

    public void setStuNo(int stuNo) {
        this.stuNo = stuNo;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public int getStuAge() {
        return stuAge;
    }

    public void setStuAge(int stuAge) {
        this.stuAge = stuAge;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stuNo=" + stuNo +
                ", stuName='" + stuName + '\'' +
                ", stuAge=" + stuAge +
                '}';
    }
}
