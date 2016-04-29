import org.junit.*;
import static org.junit.Assert.*;

public class DefinitionTest {

  @Test
  public void DefinitionTest_instantiatesInObjectWord_True() {
    Word testWord = new Word("One");
    Definition testDefinition = new Definition(testWord);
    assertEquals(true, testWord instanceof Word);
  }
}
