import org.junit.*;
import static org.junit.Assert.*;

public class WordTest {
  @After
  public void tearDown() {
    Word.clear();
    Definition.clear();
  }

  @Test
  public void Word_instantiatesCorrectly_True() {
    Word myWord = new Word("One");
    assertEquals(true, myWord instanceof Word);
  }

  @Test
  public void Word_getUserWordReturnsUserWord_String() {
    Word myWord2 = new Word("Two");
    assertEquals("Two", myWord2.getUserWord());
  }

  @Test
  public void Word_getID_1() {
    Word testID = new Word("test");
    assertEquals(1, testID.getID());
  }

  @Test
  public void Word_getListOfWords_String() {
    Word firstWord = new Word ("Three");
    Word secondWord = new Word ("Four");
    assertTrue(Word.getListOfWords().contains(firstWord));
    assertTrue(Word.getListOfWords().contains(secondWord));
  }
}
