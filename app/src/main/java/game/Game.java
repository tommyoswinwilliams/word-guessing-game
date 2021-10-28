package game;

public class Game {
  String word;
  Integer remainingAttempts;
  
  public Game(WordChooser wordChooser) {
    word = wordChooser.getRandomWordFromDictionary();
    System.out.println(word);
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

}
