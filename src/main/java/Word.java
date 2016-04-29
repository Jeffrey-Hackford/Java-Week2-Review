import java.util.ArrayList;


public class Word {
  private String mUserWord;
  private static ArrayList<Word> wordList = new ArrayList<Word>();
  private int mID;
  // private String mDefinition;

  public Word(String userWord) {
    mUserWord = userWord;
    wordList.add(this);
    mID = wordList.size();
    // mDefinition = "";
  }

  public String getUserWord() {
    return mUserWord;
  }

  public static ArrayList<Word> getListOfWords() {
    return wordList;
  }

  public int getID() {
    return mID;
  }

  public static void clear() {
    wordList.clear();
  }

  // public String getDefinition() {
  //   return mDefinition;
  // }
}
