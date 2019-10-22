public class Lecturer extends Person {
    private int salary;

    public Lecturer(String n, String s, int a, int salary) {
        super(n, s, a);
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String toString() {
        return name + " " + surname + ", " + age + " years old, lecturer. Salary: " + salary;
    }
}