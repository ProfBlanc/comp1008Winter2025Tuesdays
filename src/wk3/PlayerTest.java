package wk3;

import org.junit.jupiter.api.Test;

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

}