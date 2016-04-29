import java.util.ArrayList;


public class Dictionary {
  private String mUserWord;
  private static ArrayList<Dictionary> wordList = new ArrayList<Dictionary>();
  private int mID;

  public Dictionary(String userWord) {
    mUserWord = userWord;
    wordList.add(this);
    mID = wordList.size();
  }

  public String getUserWord() {
    return mUserWord;
  }

  public static ArrayList<Dictionary> getListOfWords() {
    return wordList;
  }
}
