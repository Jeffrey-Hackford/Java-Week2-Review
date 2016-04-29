import org.junit.*;
import static org.junit.Assert.*;

public class DictionaryTest {

  @Test
  public void Dictionary_instantiatesCorrectly_True() {
    Dictionary myWord = new Dictionary("One");
    assertEquals(true, myWord instanceof Dictionary);
  }

  @Test
  public void Dictionary_getUserWordReturnsUserWord_String() {
    Dictionary myWord = new Dictionary("Two");
    assertEquals("Two", myWord.getUserWord());
  }

  @Test
  public void Dictionary_getListOfWords_String() {
    Dictionary firstWord = new Dictionary ("Three");
    Dictionary secondWord = new Dictionary ("Four");
    assertTrue(Dictionary.getListOfWords().contains(firstWord));
    assertTrue(Dictionary.getListOfWords().contains(secondWord));
  }
}
