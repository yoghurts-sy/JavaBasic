package MultiThread.Demo06Lambda;

public class Demo02Person {
    private String Name;
    private int age;

    @Override
    public String toString() {
        return "Demo02Person{" +
                "Name='" + Name + '\'' +
                ", age=" + age +
                '}';
    }

    public Demo02Person() {
    }

    public Demo02Person(String name, int age) {
        Name = name;
        this.age = age;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
