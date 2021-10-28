package game;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
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

  @Test public void testGuessCorrectLetter() {
    WordChooser mockedWordChooser = mock(WordChooser.class);
    when(mockedWordChooser.getRandomWordFromDictionary()).thenReturn("MAKERS");
    Game game = new Game(mockedWordChooser);
    assertTrue(game.guessLetter('K'));
    assertFalse(game.guessedLetters.isEmpty());
  }

  @Test public void testGuessWrongLetter() {
    WordChooser mockedWordChooser = mock(WordChooser.class);
    when(mockedWordChooser.getRandomWordFromDictionary()).thenReturn("MAKERS");
    Game game = new Game(mockedWordChooser);
    assertFalse(game.guessLetter('B'));
    assertEquals(game.getRemainingAttempts(), Integer.valueOf(9));
  }
}
