package wk3;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class PlayerTest {


    @Test
    void testingSetNameWithValidValues(){

        Player p = new Player();
        String name = "Kenneth";
        p.setName(name);

        assertEquals(name, p.getName());
    }
    @Test
    void testingSetNameWithInvalidValues(){

        Player p = new Player();
        String name = "K";
        p.setName(name);

        assertNotEquals(name, p.getName());
        assertEquals("SuperHero", p.getName());
    }

    @Test
    void testingSetHealthWithValidValues(){
        Player p = new Player();
        p.setHealth(40);
        assertEquals(40, p.getHealth());
    }
    @ParameterizedTest
    @ValueSource(ints = {1,2,3,4,5,6,7,8,9})//doubles,strings,floats
    void testingSetHealthWithINVALIDValues(int health){

        Player p = new Player();
        p.setHealth(health);
        assertNotEquals(health, p.getHealth());
        assertTrue(p.getHealth() > health);
    }

    @Test
    void testingConstructorsWithInValidValues(){
        Player p = new Player("a", 1, -10);
        assertNotNull(p);
        assertNotEquals("a", p.getName());
        //assertFalse(p.getHealth() < 100);
        assertTrue(p.getName().length() >= 5);
    }

    @ParameterizedTest
    @CsvSource({"Benny,40,7","Mary,45,8","Bob,44,6"})
    void testingConstructorWithVALIDValues(String name, double health, double strength){

        Player p = new Player(name, health, strength);
        assertNotNull(p);
        assertEquals(name, p.getName());
        assertEquals(health, p.getHealth());
        assertEquals(strength, p.getStrength());

    }

}