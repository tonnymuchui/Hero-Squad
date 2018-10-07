import org.junit.Test;

import java.time.LocalDateTime;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class HeroTest {

    @Test
    public void Hero() {
        Hero myHero = new Hero("Batman", 25, "X-Ray versions","rely on sun for energy");
        assertEquals(true,myHero instanceof Hero);
    }

    @Test
    public void name(){
        Hero myHero = new Hero("Batman", 25, "X-Ray versions","rely on sun for energy");
   assertEquals("Batman", myHero.getName());
    }

    @Test
    public void age(){
        Hero myHero = new Hero("Batman", 25, "X-Ray versions","rely on sun for energy");
        assertEquals(25, myHero.getAge());
    }

    @Test
    public void power(){
        Hero myHero = new Hero("Batman", 25, "X-Ray versions","rely on sun for energy");
        assertEquals("X-Ray versions", myHero.getPower());
    }

    @Test
    public void weakness(){
        Hero myHero = new Hero("Batman", 25, "X-Ray versions","rely on sun for energy");
        assertEquals("rely on sun energy", myHero.getWeakness());
    }

    @Test
    public void iCompleted(){
        Hero myHero = new Hero("Batman", 25, "X-Ray versions","rely on sun for energy");
        assertFalse( myHero.ismCompleted());
    }

    @Test
    public void time(){
        Hero myHero = new Hero("Batman", 25, "X-Ray versions","rely on sun for energy");
        assertEquals(LocalDateTime.now().getDayOfWeek(), myHero.getmCreatedAt().getDayOfWeek());
    }

    @Test
    public void all() {
        Hero firstHero = new Hero("Batman", 25, "X-Ray versions","rely on sun for energy");
        Hero secondHero = new Hero("Batman", 25, "X-Ray versions","rely on sun for energy");
        assertTrue(Hero.all().contains(firstHero));
        assertTrue(Hero.all().contains(secondHero));
    }

    @Test
    public void clear(){
        Hero myHero = new Hero("Batman", 25, "X-Ray versions","rely on sun for energy");
        Hero.clear();
        assertEquals(Hero.all().size(), 0);
    }

    @Test
   public void getId(){
        Hero.clear();
        Hero myHero = new Hero("Batman", 25, "X-Ray versions","rely on sun for energy");
        assertEquals(1,myHero.getId());
    }

    @Test
    public void find() {
        Hero firstHero = new Hero("Batman", 25, "X-Ray versions","rely on sun for energy");
        Hero secondHero = new Hero("Batman", 25, "X-Ray versions","rely on sun for energy");
        assertEquals(Hero.find(secondHero.getId()), secondHero);
    }
    }
