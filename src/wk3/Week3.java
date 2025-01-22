package wk3;

import wk2.MathStorm;

public class Week3 {

    public static void main(String[] args) {

        Player p1 = new Player();
        System.out.println(p1);

        p1.getAttacked(5);
        System.out.println(p1.getHealth());
        p1.getAttacked(10);
        p1.getAttacked(10);
        p1.getAttacked(10);
        p1.getAttacked(10);
        p1.getAttacked(10);

        p1.getAttacked(10);
        System.out.println(p1.getHealth());
        System.out.println(p1.isAlive());
    }

static void example2(){
    MathStorm ms = new MathStorm(5, 5, 30, new char[]{'+','-'});
    System.out.println(ms.getOperator());
    ms.setOperator('*');
    System.out.println(ms.getOperator());



    System.out.println(ms);

}
    static void example1(){

        OsmowsMeal om = new OsmowsMeal("chicken", "salad");  //how many ways can I order an OsmowsMeal?ANS : 3
        om.setProtein("tofu1");
        System.out.println(om.getProtein());  // chicken
        System.out.println(om.getSide());  //rice
        System.out.println(om.getSauce()); // hot

        System.out.println(om); //calling implicitly toString method
        //what is that? toString method is a method that summarized the objects attributes/properties

    }
}
