import java.util.ArrayList;

public class Definition {
  private String mDefinition;
  private static ArrayList<Definition> definitionList = new ArrayList<Definition>();
  private Integer mID;

  public Definition(Word userWord) {
    mDefinition = "";
    definitionList.add(this);
    mID = definitionList.size();
    // mUserWord = userWord;
  }

  public static void clear() {
    definitionList.clear();
  }
}
