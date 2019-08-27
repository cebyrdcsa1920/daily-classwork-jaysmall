public class Student
{
    private doule gpa;
    private String studentID;
    private String name;
    private int age;

    public Student(String name, studentID, int age)
    {
        this.gpa = 0.0;
        this.name = name;
        this.studentID = studentID;
        this.age = age;
    }

    public static void main(String[] args)
    {
        Student jayron = new Student("Jayron","669486",17)
    }