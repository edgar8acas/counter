package eroc.counter;
import java.util.Set;
import java.util.Arrays;
import java.util.HashSet;

public class Counter {

  private String s;
  private String[] words;
  public Counter(String s){
      this.s = s;
  }
  
  public int countWords() {
      String[] words = s.split(" ");
      int wordCount = 0;
      for(int i = 0; i<=words.length -1; i++){
        if(words[i].endsWith(",") || words[i].endsWith("."))
        {
          
          words[i] = words[i].substring(0, words[i].length()-1);        }
      }
      this.words = words;
      return words.length;
  }
  
  public int countUnique() {
      Set<String> set = new HashSet<String>(Arrays.asList(this.words));
      return set.size();
  }

  public int countSyllables() {
      return s.split("[a-zA-z]{2}").length;
  }

  public int countLetters() {
    return s.split("\\w").length;
  }
  
  
}