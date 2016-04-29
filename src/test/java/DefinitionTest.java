import org.junit.*;
import static org.junit.Assert.*;

public class DefinitionTest {

  @After
  public void tearDown() {
    Definition.clear();
  }

  @Test
  public void Definition_instantiatesCorrectly_True() {
    Definition testDefinition = new Definition("A definition.");
    assertEquals(true, testDefinition instanceof Definition);
  }

  @Test
  public void Definition_getID_1() {
    Definition testID = new Definition("test");
    assertEquals(1, testID.getID());
  }

  @Test
  public void Definition_getDefinitionReturnsDefinition_String() {
    Definition myDefinition2 = new Definition("Second Def");
    assertEquals("Second Def", myDefinition2.getDefinition());
  }
  @Test
  public void Definition_getListOfDefinitions_String() {
    Definition firstDefinition = new Definition ("Def 1");
    Definition secondDefinition = new Definition ("Def 2");
    assertTrue(Definition.getListOfDefinitions().contains(firstDefinition));
    assertTrue(Definition.getListOfDefinitions().contains(secondDefinition));
  }
}
