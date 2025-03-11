package wk9;

public class Person {

    private String name = "Ben";
    private int age = 18;
    protected double someValue;
    public float height;
    public Person(){}

    public Person(String name, int age) {
        setName(name);
        setAge(age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public String toString(){

        return String.format(
                "Name=%s, Age=%d, Height=%.1f",
                name, age, height
        );
    }
}
