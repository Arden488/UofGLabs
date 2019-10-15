public class Main {
    public static void main(String[] args) {
        Person p = new Person("Anton", "Samoilov", 31);
        System.out.println(p);
        p.sayHello();
        p.setName("Nikolay");
        p.setAge(37);
        p.sayHello();
        System.out.println(p.getName());
        System.out.println(p);
    }
}