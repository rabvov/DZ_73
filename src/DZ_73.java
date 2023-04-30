import java.io.*;
import java.util.Objects;


public class DZ_73 {
    public static void main(String[] args) {
        String f = "C:\\Users\\rak15\\IdeaProjects\\DZ_73\\Папка";
      try {
          File file = new File(f);
          for (File file1 : Objects.requireNonNull(file.listFiles())) {
              System.out.printf("Name = %s; Length = %d; Is directory = %b ", file1.getName(), file1.length(), file1.isDirectory());
              System.out.println();
          }
      } catch (NullPointerException nullPointerException) {
          throw new NullPointerException();
      }
    }
}
