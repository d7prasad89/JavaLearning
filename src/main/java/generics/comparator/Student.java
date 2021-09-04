package generics.comparator;

public class Student {
    private int age;
    private String Name;

    public Student(int age, String name) {
        this.age = age;
        Name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", Name='" + Name + '\'' +
                '}';
    }
}
