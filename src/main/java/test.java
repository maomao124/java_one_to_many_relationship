import java.util.Iterator;

/**
 * Project name(项目名称)：Java一对多关系
 * Package(包名): PACKAGE_NAME
 * Class(类名): test
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/1/11
 * Time(创建时间)： 19:13
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class test
{
    public static void main(String[] args)
    {
        // 实例化学校对象
        School school = new School("清华大学");
        // 实例化学生对象
        Student student1 = new Student("张三", 21);
        Student student2 = new Student("李四", 22);
        Student student3 = new Student("王五", 23);
        // 在学校中加入学生
        school.getStudents().add(student1);
        school.getStudents().add(student2);
        school.getStudents().add(student3);
        // 一个学生属于一个学校
        student1.setSchool(school);
        student2.setSchool(school);
        student3.setSchool(school);
        // 输出学校信息
        System.out.println(school);
        // 实例化Iterator对象，用于输出全部的学生信息
        Iterator<Student> iterator = school.getStudents().iterator();
        while (iterator.hasNext())
        {
            System.out.println( iterator.next());
        }
    }
}
