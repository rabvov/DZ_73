import java.io.*;
import java.util.Objects;


public class DZ_73 {
    public static void main(String[] args) {
        String f = "C:\\Users\\rak15\\IdeaProjects\\DZ_73\\Папка";
        File file = new File(f);
        try {
            System.out.println("В папке есть:");
           Direct.form(file);
            } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }}