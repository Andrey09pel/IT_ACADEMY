package Lesson11StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.*;
import java.util.Scanner;
public class LimitSkip {
    public static void main(String[] args) {

        List<String> ls = new ArrayList<String>();
        ls.addAll(Arrays.asList(new String[]
                {"111", "111", "222", "33", "4", "55", "55", "6", "66", "7", "77"}));

        int pageSize = 3; // количество элементов на страницу
        Scanner scanner = new Scanner(System.in);
        while(true){

            System.out.println("Введите номер страницы: ");
            int page = scanner.nextInt();

            if(page<1) break; // если число меньше 1, выходим из цикла

            ls.stream().skip((page-1) * pageSize)
                    .limit(pageSize)
                    .forEach(s->System.out.println(s));
        }
    }
}
