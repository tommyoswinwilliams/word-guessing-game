package game;

public class Game {
  String word;
  Integer remainingAttempts;

  public Game(String wordForGuessing) {
    word = wordForGuessing;
    remainingAttempts = 10;
  }
  
  public static void main(String[] args) {
    
  }
  
  public String getWordToGuess() {
    StringBuilder sb=new StringBuilder(word);  
    int wordLength = word.length();
    String blanks = new String(new char[wordLength - 1]).replace("\0", "_");
    sb.replace(1, wordLength, blanks);
    System.out.println(sb);
    return sb.toString();
  }

  public Integer getRemainingAttempts() {
    return remainingAttempts;
  }
}
