package wk3;

import java.util.Random;

/**
 * This is javadoc => Java Documentation
 *
 * @author Prof Ben
 * @version 1.0
 * @since 2025-01-28
 */


/*

 */

public class Player {
    private static final int MIN_NAME_LENGTH = 3, MAX_NAME_LENGTH = 10;
    private static final int MIN_STRENGTH = 5;
    private static final int MAX_STRENGTH = 10;
    private static final int MIN_HEALTH = 30, MAX_HEALTH = 50;

    private Random rand = new Random();
    /** This is a random value */
    //int randomValue = 100;

    private String name = "SuperHero";
    private double health = rand.nextInt(MIN_HEALTH, MAX_HEALTH + 1);
    private double strength = rand.nextInt(MIN_STRENGTH, MAX_STRENGTH + 1);

    public String getName() {
        return name;
    }

    /**
     * This is the setter method for Player
     * @param name The name of the Player
     */
    public void setName(String name) {
        if(name.length() >= MIN_NAME_LENGTH && name.length() <= MAX_NAME_LENGTH)
            this.name = name;
    }

    /**
     * This returns the health remaining for a Player
     * @return health value
     */
    public double getHealth() {
        return health;
    }

    public void setHealth(double health) {
        if(health >= MIN_HEALTH && health <= MAX_HEALTH)
            this.health = health;
    }

    public double getStrength() {
        return strength;
    }

    public void setStrength(double strength) {
        if(strength >= MIN_STRENGTH && strength <= MAX_STRENGTH)
            this.strength = strength;
    }

    public Player() {}
    public Player(String name) {
        setName(name);
    }

    /**
     * The 3-arg consgtructor for Player
     * @param name Name of the Player
     * @param health Heath of the Player
     * @param strength Strength of the player
     */
    public Player(String name, double health, double strength) {
        setName(name);
        setHealth(health);
        setStrength(strength);
    }

    public boolean isAlive(){
        return health > 0;
    }
    public void getAttacked(int value){
        if(value >= MIN_STRENGTH && value <= MAX_STRENGTH)
            health -= value;
    }
    @Override
    public String toString() {
        return String.format("%s has a strength value of %.0f and a health of %.1f",
                name, strength, health
                );
    }

    public static Player WeakPlayer(){
        return new Player("Weak", MIN_HEALTH, MIN_STRENGTH);
    }
    public static Player WeakPlayer(String name){
        return new Player(name, MIN_HEALTH, MIN_STRENGTH);
    }


}
