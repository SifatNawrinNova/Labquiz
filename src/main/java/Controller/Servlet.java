package Controller;
import Data.Model.*;

import javax.faces.bean.ManagedBean;


@ManagedBean (name = "Servlet")
public class Servlet
{
    private Student student=new Student();

    public Servlet()
    {
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public String InNextPage()
    {
        return "viewstudent";
    }



}
