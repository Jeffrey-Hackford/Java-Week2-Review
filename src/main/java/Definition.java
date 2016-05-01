import java.util.ArrayList;

public class Definition {
  private Word mUserDefinition;
  private static ArrayList<Definition> definitionList = new ArrayList<Definition>();
  private Integer mID;

  public Definition(Word definition) {
    mUserDefinition = definition;
    definitionList.add(this);
    mID = definitionList.size();
    mUserDefinition = definition;
  }

  public static void clear() {
    definitionList.clear();
  }

  public int getID() {
    return mID;
  }

  public String getDefinition() {
    return mUserDefinition.getUserWord();
  }

  public static ArrayList<Definition> getListOfDefinitions() {
    return definitionList;
  }
}
