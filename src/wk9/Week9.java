package wk9;

public class Week9 {

    public static void main(String[] args) {

        Person p = new Person("hi", 80);
        p.setName("New Name");
        p.setAge(100);

        SuperHero hero = new SuperHero();
        hero.setName("Super Hero");
        hero.setAge(101);

        hero.someValue = 1000;
        hero.height = 90f;

        //hero.method();
        //p.method();

        Person p1 = new SuperHero("hi", 100, "power", 20);
        p1.setName("adfafdaf");

        Person[] people = {new Person(), new SuperHero()};

        //SuperHero hero1 = new Person();

        System.out.println(p1);
    }

//    public String toString(){
//        return null;
//    }
}
