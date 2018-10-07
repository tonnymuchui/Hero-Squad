import org.junit.Test;

import static org.junit.Assert.*;

public class SquadTest {
@Test
    public void all(){
    Squad firstSquad = new Squad("suicide squad");
    Squad secondSquad = new Squad("jaguar squad");
    assertTrue(Squad.all().contains(firstSquad));
    assertTrue(Squad.all().contains(secondSquad));
}

@Test
    public void clear(){
    Squad testSquad = new Squad("jaguar");
    Squad.clear();
    assertEquals(Squad.all().size(),0);
}

@Test
    public void getId(){
    Squad.clear();
    Squad newSquad = new Squad("jaguar");
    assertEquals(1, newSquad.getId());
}

@Test
    public void find(){
    Squad.clear();
    Squad firstSquad = new Squad("suicide squad");
    Squad secondSquad = new Squad("jaguar squad");
    assertEquals(Squad.find(secondSquad.getId()), secondSquad);
}
// adding a hero to a squad
@Test
public void addHiro(){
    Squad newSquad = new Squad("jaguar");
    Hero newHiro = new Hero("Batman", 23,"X-ray versions", "Needs sun energy");
    newSquad.addHero(newHiro);
    assertTrue(newSquad.getHeroes().contains(newHiro));
}
}