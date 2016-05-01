import org.junit.*;
import static org.junit.Assert.*;

public class DefinitionTest {

  @After
  public void tearDown() {
    Definition.clear();
  }

  @Test
  public void Definition_getListOfDefinitions_True() {
    Word testWord = new Word("test");
    Word testWord2 = new Word("test2");
    Definition firstDefinition = new Definition (testWord);
    Definition secondDefinition = new Definition (testWord2);
    assertTrue(Definition.getListOfDefinitions().contains(firstDefinition));
    assertTrue(Definition.getListOfDefinitions().contains(secondDefinition));
  }

  @Test
  public void definitionInstantiatesInsideWordObject_True() {
    Word testWord = new Word("one");
    Definition testDefinition = new Definition(testWord);
    assertEquals("one", testDefinition.getDefinition());
  }
}
