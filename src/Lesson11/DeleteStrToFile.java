package Lesson11;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class DeleteStrToFile {
    public static void dellRows(String nameFale,Integer iDX) throws IOException {
        ArrayList<String> copyFile = new ArrayList<>();
        BufferedReader reader  = new BufferedReader(new FileReader(nameFale));
        BufferedWriter writer = new BufferedWriter(new FileWriter(nameFale));

        int remove = 0;
        String s;
        int max = 0;

        while ((s = reader.readLine()) != null) {
            Pattern pattern = Pattern.compile("^\\d+");
            Matcher matcher = pattern.matcher(s);
            while (matcher.find()) {
                String d = s.substring(matcher.start(), matcher.end());
                int i = Integer.parseInt(d);
                if (i > max) {
                    max = i;
                }
            }
        }

        while ((s = reader.readLine()) != null){
            copyFile.add(s);
        }
        for (int i = 0; i < copyFile.size();i++){
            int z = Integer.parseInt(copyFile.get(i).substring(0,8).trim());
            if (z == iDX){
                remove = i;
            }
        }

        copyFile.remove(remove);

        for (String sw: copyFile){
            System.out.println(sw);
            writer.write(sw + "\r\n");
        }
        reader.close();
        writer.close();
    }
}

