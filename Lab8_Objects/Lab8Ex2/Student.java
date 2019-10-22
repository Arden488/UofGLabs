public class Student extends Person {
    private double gpa;

    public Student(String n, String s, int a, double gpa) {
        super(n, s, a);
        this.gpa = gpa;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public String toString() {
        return name + " " + surname + ", " + age + " years old, student. GPA: " + gpa;
    }
}