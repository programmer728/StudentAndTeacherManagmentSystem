package bean;


public class Teacher extends Person {
    private String schoolName;
    private double salary;
    private Student[] students;

    public Teacher(String name, String surname, int age, String schoolName, double salary) {
        super(name, surname, age);
        this.schoolName = schoolName;
        this.salary = salary;
        this.students = students;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return ", name='" + super.getName() + '\'' +
                ", surname='" + super.getSurname() + '\'' +
                ", age='" + super.getAge() + '\'' +
                ", schoolname='" + this.getSchoolName() + '\'' +
                ", salary='" + this.getSalary() + '\'' +
                '}';
    }
}