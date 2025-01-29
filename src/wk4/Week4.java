package wk4;
import wk3.Player;
public class Week4 {
    public static void main(String[] args) {

            example2();
    }
    static void example2(){
        Player p1 = new Player("Batman", 40, 5);
        Player p2 = new Player("Superman", 41, 6);

        FightingGame game = new FightingGame(p1, p2);
        game.fight();

    }
    static void example1(){
        Player p1 = new Player();
        // int v = p1.randomValue;
        p1.setName("abc");

        Player p2 = Player.WeakPlayer();


    }
}
