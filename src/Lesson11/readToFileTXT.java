package Lesson11;

import java.io.FileReader;
import java.io.IOException;

public class readToFileTXT {


    public static void print( String nameFale) {
        try {
            FileReader fr = new FileReader(nameFale);
            int data = fr.read();
            while(data != -1) {
                System.out.print((char)data);
                data = fr.read();
            }
            fr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    }


