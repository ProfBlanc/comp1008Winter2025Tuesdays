package wk3;

import wk2.MathStorm;

public class Week3 {

    public static void main(String[] args) {

        MathStorm ms = new MathStorm(5, 5, 30);
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
