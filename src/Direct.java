import java.io.File;
import java.util.Arrays;
import java.util.Objects;

public class Direct {
    public static void form (File f){
        String d;
       for (File file: Objects.requireNonNull(f.listFiles())){
           if (file.isDirectory()){
               System.out.printf("Name = %s; Length = %d; Is directory = %b ", file.getName(), file.length(), file.isDirectory());
               System.out.print(": Находиться - "+file.getParentFile()+" /");
               System.out.println(" В ней есть: "+ Arrays.toString(file.list()));
               d=file.getAbsolutePath();
               f= new File(d);
               Direct.form(f);
           System.out.println();}
           else {
               System.out.printf("Name = %s; Length = %d; Is directory = %b ", file.getName(), file.length(), file.isDirectory());
               System.out.println("Находиься в "+file.getParentFile());
               System.out.println();
           }
       }

    }
}
