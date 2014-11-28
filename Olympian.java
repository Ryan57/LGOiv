public class Olympian {
    //declare all attributes
    private String name;
    private Sex sex;
    private int age;
    //getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //constructor to set all attributes
    public Olympian(String name, Sex sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }
}