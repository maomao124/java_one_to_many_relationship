import java.util.LinkedList;
import java.util.List;

/**
 * Project name(项目名称)：Java一对多关系
 * Package(包名): PACKAGE_NAME
 * Class(类名): School
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/1/11
 * Time(创建时间)： 19:07
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class School
{
    private String name;
    private List<Student> students;

    public School()
    {
        this.students = new LinkedList<>();
    }

    public School(String name)
    {
        this();
        this.setName(name);
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public List<Student> getStudents()
    {
        return students;
    }

    public void setStudents(List<Student> allStudents)
    {
        this.students = allStudents;
    }

    public String toString()
    {
        return "学校名称：" + this.name;
    }
}
