package game;

import java.util.ArrayList;

public class Game {
  String word;
  Integer remainingAttempts;
  ArrayList<Character> guessedLetters = new ArrayList<Character>();

  
  public Game(WordChooser wordChooser) {
    word = wordChooser.getRandomWordFromDictionary();
    remainingAttempts = 10;
  }
  
  public static void main(String[] args) {
    Game game = new Game(new WordChooser());
    game.getWordToGuess();
  }
  
  public String getWordToGuess() {
    StringBuilder sb=new StringBuilder(word);  
    int wordLength = word.length();
    String blanks = new String(new char[wordLength - 1]).replace("\0", "_");
    sb.replace(1, wordLength, blanks);
    System.out.println(sb.toString());
    return sb.toString();
  }

  public Integer getRemainingAttempts() {
    return remainingAttempts;
  }

  public Boolean guessLetter(Character letter) {
    if (word.indexOf(letter) >= 0) {
      guessedLetters.add(letter);
      return true;
    } else {
      remainingAttempts --;
      return false;
    }
  }
}
