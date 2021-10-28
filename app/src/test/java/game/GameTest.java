package game;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import static org.mockito.Mockito.*;

public class GameTest {

  @Test public void testGetsWordToGuess() {
    WordChooser mockedWordChooser = mock(WordChooser.class);
    when(mockedWordChooser.getRandomWordFromDictionary()).thenReturn("MAKERS");
    Game game = new Game(mockedWordChooser);
    assertEquals(game.getWordToGuess(), "M_____");
  }

  @Test public void testGetsRemainingAttempts() {
    Game game = new Game(new WordChooser());
    assertEquals(game.getRemainingAttempts(), Integer.valueOf(10));
  }
}
