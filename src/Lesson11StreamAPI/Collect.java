package Lesson11StreamAPI;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class Collect {
    public static void main(String[] args) {

        Stream<String> VALUE = Stream.of("intel 1", "intel 11", "intel 2", "intel 22", "intel 3", "intel 33");

        ArrayList<String> filteredPhones = VALUE.filter(s->s.length()<12)
                .collect(
                        ()->new ArrayList<String>(), // создаем ArrayList
                        (list, item)->list.add(item), // добавляем в список элемент
                        (list1, list2)-> list1.addAll(list2)); // добавляем в список другой список

        filteredPhones.forEach(s->System.out.println(s));
    }
}

