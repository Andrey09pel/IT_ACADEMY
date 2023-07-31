package Lesson11;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class writeToFileTXT {
    public static void writeToFile(String text, Path path){
        try {
            Files.write(path,
                    text.getBytes(),
                    StandardOpenOption.APPEND,
                    StandardOpenOption.CREATE
            );

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
