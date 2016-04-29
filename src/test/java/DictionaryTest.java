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
}
