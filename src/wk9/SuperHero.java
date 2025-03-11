package wk9;

public class SuperHero extends Person{

    public String superPower = "Heroic Activities";
    public int superHeroAge;

    public SuperHero(){}
    public SuperHero(String name, int age){
        super(name, age);
    }

     public SuperHero(String name, int age,
     String superPower, int superHeroAge){
        //super =>  refers to the super class. Direct first, then indirect

        super(name, age);
        this.superPower = superPower;
        this.superHeroAge = superHeroAge;
        this.height = age * 4;

    }




    void method(){
        System.out.println(height + ", " + getName() + ", " + someValue
        + "," + getAge());
    }

    public String toString(){
       // return "Mystery Output";
        String personData = "Name = " + getName() + ", Age = " + getAge()
                + "Height = " + height;

        personData = super.toString();

        return "Super Hero: "+ personData +", Power = "
                + superPower + ", Hero Age = "
                + superHeroAge;
    }

}
