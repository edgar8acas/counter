package eroc;

import eroc.counter.*;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {  
      Counter counter = new Counter("This is an example string to count. This is an example string to count");
      System.out.println("Palabras: " + counter.countWords());
      System.out.println("Palabras únicas: " + counter.countUnique());
      System.out.println("Sílabas: " + counter.countSyllables());
      System.out.println("Letras: " + counter.countLetters());
    }
}
