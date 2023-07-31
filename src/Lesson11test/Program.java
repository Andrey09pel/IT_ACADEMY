package Lesson11test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Program {

    public static void main(String[] args) {

            Path path = Paths.get("demo.txt");
            String text = "…some te11xt…";

            try {
                Files.write(path,
                        text.getBytes(),
                        StandardOpenOption.APPEND,
                        StandardOpenOption.CREATE
                );

                System.out.println("Successfully written bytes to the file");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }