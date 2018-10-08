import org.junit.Test;

import java.time.LocalDateTime;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class HeroTest {

    @Test
    public void Hero() {
        Hero myHero = new Hero("Batman", 25, "X-Ray versions","energy");
        assertEquals(true,myHero instanceof Hero);
    }

    @Test
    public void name(){
        Hero myHero = new Hero("Batman", 25, "X-Ray versions","energy");
   assertEquals("Batman", myHero.getName());
    }

    @Test
    public void age(){
        Hero myHero = new Hero("Batman", 25, "X-Ray versions","energy");
        assertEquals(25, myHero.getAge());
    }

    @Test
    public void power(){
        Hero myHero = new Hero("Batman", 25, "X-Ray versions","energy");
        assertEquals("X-Ray versions", myHero.getPower());
    }

    @Test
    public void weakness(){
        Hero myHero = new Hero("Batman", 25, "X-Ray versions","energy");
        assertEquals("energy", myHero.getWeakness());
    }

    @Test
    public void iCompleted(){
        Hero myHero = new Hero("Batman", 25, "X-Ray versions","energy");
        assertFalse( myHero.ismCompleted());
    }

    @Test
    public void time(){
        Hero myHero = new Hero("Batman", 25, "X-Ray versions","energy");
        assertEquals(LocalDateTime.now().getDayOfWeek(), myHero.getmCreatedAt().getDayOfWeek());
    }

    @Test
    public void all() {
        Hero firstHero = new Hero("Batman", 25, "X-Ray versions","energy");
        Hero secondHero = new Hero("Batman", 25, "X-Ray versions","energy");
        assertTrue(Hero.all().contains(firstHero));
        assertTrue(Hero.all().contains(secondHero));
    }

    @Test
    public void clear(){
        Hero myHero = new Hero("Batman", 25, "X-Ray versions","energy");
        Hero.clear();
        assertEquals(Hero.all().size(), 0);
    }

    @Test
   public void getId(){
        Hero.clear();
        Hero myHero = new Hero("Batman", 25, "X-Ray versions","energy");
        assertEquals(1,myHero.getId());
    }

    @Test
    public void find() {
        Hero firstHero = new Hero("Batman", 25, "X-Ray versions","energy");
        Hero secondHero = new Hero("Batman", 25, "X-Ray versions","energy");
        assertEquals(Hero.find(secondHero.getId()), secondHero);
    }
    }
