package wk4;

import wk3.Player;

import java.util.Random;

public class FightingGame {

    private Player[] players = new Player[2];
    private String name;

    public FightingGame(Player p1, Player p2){
        players[0] = p1;
        players[1] = p2;
        name = String.format(
                "This is a fight between %s and %s. Let's get ready to ruuuuuuuuuuuumble!",
                p1.getName(), p2.getName()
        );
    }

    public String toString(){
        return String.format(
                "Fight Between %s and %s.\n%s\n%s",
                players[0].getName(), players[1].getName(),
                players[0], players[1]
        );
    }

    private boolean isGameOver(){
        return !(players[0].isAlive() && players[1].isAlive());
    }
    public void fight(){
        Random random = new Random();
        Player attacker, victim;
        while(!isGameOver()){
            int attackerInt = random.nextInt(players.length);
            int victimInt = attackerInt == 1 ? 0 : 1;
            attacker = players[attackerInt];
            victim = players[victimInt];

            victim.getAttacked((int)attacker.getStrength());

            System.out.printf("%s attacked %s. %s has a strength of %.1f. %s health is now %.1f\n",
                    attacker.getName(), victim.getName(), attacker.getName(),attacker.getStrength(),
                    victim.getName(), victim.getHealth()
                    );
            System.out.println("-".repeat(20));

        }

        String whoWon;

        if(players[0].isAlive()){
            whoWon = players[0].getName();
        }
        else {
            whoWon = players[1].getName();
        }

        whoWon = players[0].isAlive() ? players[0].getName() : players[1].getName();

        System.out.println(whoWon + " won the fight!");
    }

}
