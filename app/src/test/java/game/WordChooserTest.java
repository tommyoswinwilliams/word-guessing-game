package game;

import static org.junit.Assert.assertTrue;
import org.junit.Test;
import java.util.Arrays;

public class WordChooserTest {
  
  @Test public void testGetsRandomWordFromDictionary() {
    WordChooser wordChooser = new WordChooser();
    String result = wordChooser.getRandomWordFromDictionary();
    final String[] DICTIONARY = {"MAKERS", "CANDIES", "DEVELOPER", "LONDON"};
    assertTrue(Arrays.asList(DICTIONARY).contains(result));
  }
}
