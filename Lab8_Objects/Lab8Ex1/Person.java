public class Person {
    private String name;
    private String surname;
    private int age;

    public Person(String n, String s, int a) {
        name = n;
        surname = s;
        age = a;
    }

    public void sayHello() {
        System.out.println("Hello, my name is " + name + " " + surname);
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public void setName(String n) {
        name = n;
    }

    public void setSurname(String s) {
        surname = s;
    }

    public void setAge(int a) {
        age = a;
    }

    public String toString() {
        return name + " " + surname + ", " + age + " years old";
    }
}