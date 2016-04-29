import java.util.ArrayList;

public class Definition {
  private String mDefinition;
  private static ArrayList<Definition> definitionList = new ArrayList<Definition>();
  private Integer mID;

  public Definition(String definition) {
    mDefinition = definition;
    definitionList.add(this);
    mID = definitionList.size();
    // mUserWord = userWord;
  }

  public static void clear() {
    definitionList.clear();
  }

  public int getID() {
    return mID;
  }

  public String getDefinition() {
    return mDefinition;
  }

  public static ArrayList<Definition> getListOfDefinitions() {
    return definitionList;
  }
}
