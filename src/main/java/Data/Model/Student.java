package Data.Model;

public class Student
{
    private String Serial;
    private Integer Studentid;
    private  String Studentname;

    public Student()
    {
    }

    public String getSerial() {
        return Serial;
    }

    public void setSerial(String serial) {
        Serial = serial;
    }

    public Integer getStudentid() {
        return Studentid;
    }

    public void setStudentid(Integer studentid) {
        Studentid = studentid;
    }

    public String getStudentname() {
        return Studentname;
    }

    public void setStudentname(String studentname) {
        Studentname = studentname;
    }
}
