package Lesson11StreamAPI;

import java.util.Arrays;
import java.util.List;

public class StrimORpStrim {
    public static void main(String[] args) {

        List<String> intel = Arrays.asList("Intel 2","Intel 1", "Intel 21", "Intel 221", "Intel 21111");

        System.out.println("Последовательный поток");
        intel.stream().filter(p->p.length()>7).forEach(System.out::println);

        System.out.println("\nПараллельный поток");
        intel.parallelStream().filter(p->p.length()>7).forEach(System.out::println);
    }
}

