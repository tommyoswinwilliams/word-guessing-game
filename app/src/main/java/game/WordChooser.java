package game;

import java.util.Random;

public class WordChooser {
  
  public final String[] DICTIONARY = {"MAKERS", "CANDIES", "DEVELOPER", "LONDON"};

  public static void main(String[] args) {
    
  }

  public String getRandomWordFromDictionary() {
    int rand = new Random().nextInt(DICTIONARY.length);
    return DICTIONARY[rand];
  }
}
