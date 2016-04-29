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
    Definition myDefinition2 = new Definition("Two");
    assertEquals("Two", myDefinition2.getDefinition());
  }
}
