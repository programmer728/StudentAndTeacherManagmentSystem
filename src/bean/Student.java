package bean;

public class Student extends Person {
    private String schoolName;
    private double scholarship;

    public Student(String name, String surname, int age, String schoolName, double scholarship) {
        super(name, surname, age);
        this.schoolName = schoolName;
        this.scholarship = scholarship;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public double getScholarship() {
        return scholarship;
    }

    public void setScholarship(double scholarship) {
        this.scholarship = scholarship;
    }

    @Override
    public String toString() {
        return ",  name='" + super.getName() + '\'' +
                ", surname='" + super.getSurname() + '\'' +
                ", age='" + super.getAge() + '\'' +
                ", schoolname='" + this.getSchoolName() + '\'' +
                ", scholarship='" + this.getScholarship() + '\'' +
                '}';
    }
}
