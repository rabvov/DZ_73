import java.io.*;
import java.nio.file.Files;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Objects;

public class DZ_73 {
    public static void main(String[] args) {
        String f = "C:\\Users\\rak15\\IdeaProjects\\DZ_73\\Папка";
      try {
          File file = new File(f);
          for (File file1 : Objects.requireNonNull(file.listFiles())) {
              BasicFileAttributes basicFileAttributes = Files.readAttributes(file1.toPath(), BasicFileAttributes.class);
              System.out.printf("Name = %s; Length = %d; Is directory = %b ", file1.getName(), basicFileAttributes.size(), basicFileAttributes.isDirectory());
              System.out.println();
          }
      } catch (Exception e) {
          throw new RuntimeException(e);
      }
    }
}
