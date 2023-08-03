package Lesson11StreamAPI;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;
import java.util.*;
import java.util.Optional;
import java.util.ArrayList;
import java.util.Arrays;
public class Start {
    public static void main(String[] args) {
        System.out.println("_______________________________ФИЛЬТР (name)____________________________________");
        Stream<Processor> proc = Stream.of(new Processor("Intel 1",  100),
                                        new Processor("Intel 2",  100),
                                        new Processor("Intel 3", 200),
                                        new Processor("Intel 4", 300),
                                        new Processor("Intel 5", 400),
                                        new Processor("Intel 6", 500),
                                        new Processor("Intel 7", 600),
                                        new Processor("Intel 8", 700),
                                        new Processor("Intel 9", 800),
                                        new Processor("Intel 10", 900),
                                        new Processor("Intel 11", 1000));

        proc.sorted(new ProcComporator())
                .forEach(p->System.out.printf("%s (%s) - %d \n",
                        p.getName(), p.getName(), p.getfrequency()));
        System.out.println("_______________________________ФИЛЬТР (frequency >900)____________________________________");
        Stream<Processor> proc22 = Stream.of(new Processor("Intel 1",  100),
                new Processor("Intel 2",  100),
                new Processor("Intel 3", 200),
                new Processor("Intel 4", 300),
                new Processor("Intel 5", 400),
                new Processor("Intel 6", 500),
                new Processor("Intel 7", 600),
                new Processor("Intel 8", 700),
                new Processor("Intel 9", 800),
                new Processor("Intel 10", 900),
                new Processor("Intel 11", 1000));
        proc22.filter(p->p.getfrequency()>900).forEach(p->System.out.println(p.getName()));
        System.out.println("_______________________________ помещаем в поток только названия проц____________________________________");
        Stream<Processor> proc33 = Stream.of( new Processor("Intel 1",  100),
                new Processor("Intel 2",  100),
                new Processor("Intel 3", 200),
                new Processor("Intel 4", 300),
                new Processor("Intel 5", 400),
                new Processor("Intel 6", 500),
                new Processor("Intel 7", 600),
                new Processor("Intel 8", 700),
                new Processor("Intel 9", 800),
                new Processor("Intel 10", 900),
                new Processor("Intel 11", 1000));
        proc33
                .map(p-> p.getName()) // помещаем в поток только названия проц
                .forEach(s->System.out.println(s));

        System.out.println("________________________________ФИЛЬТР (>1)____________________________________________");
        ArrayList<String> proc2 = new ArrayList<String>();
        Collections.addAll(proc2, "111", "111", "222", "33", "4", "55", "55", "6", "66", "7", "77");
        Stream<String> proc2Stream = proc2.stream(); // получаем поток
        proc2Stream = proc2Stream.filter(s->s.length()>1); // применяем фильтрацию по длине строки
        proc2Stream.forEach(s->System.out.println(s));

        System.out.println("________________________________new int________________________________________");
        IntStream intStream = Arrays.stream(new int[]{11,22,33,44,55,66,77,88,99,101});
        intStream.forEach(i->System.out.println(i));

        System.out.println("________________________________new long_____________________________________________");
        LongStream longStream = Arrays.stream(new long[]{333,222,333,444,555,666,777,888,999});
        longStream.forEach(l->System.out.println(l));
        System.out.println("________________________________new double____________________________________________");
        DoubleStream doubleStream = Arrays.stream(new double[] {1.1, 3.3, 4.4, 4.44, 121,666,777,888,1});
        doubleStream.forEach(d->System.out.println(d));

        System.out.println("_______________________________Stream.of__________________________________________");
        Stream<String> test =Stream.of("3", "2", "3");
        test.forEach(s->System.out.println(s));

        System.out.println("_______________________________takeWhile()_______!!!!!-5!!!!!_____________________");
        Stream<Integer> numbers = Stream.of(-1, -12, -11, 0, 1, 2, 3, 4,-5);
        numbers.takeWhile(n -> n < 0)
                .forEach(n -> System.out.println(n));

        System.out.println("_______________________________dropWhile()____________________________");
        Stream<Integer> numbers2 = Stream.of(-1, -12, -11, 0, 1, 2, 3, 4,-5);
        numbers2.sorted().dropWhile(n -> n < 0)
                .forEach(n -> System.out.println(n));

        System.out.println("_______________________________concat____________________________");
        Stream<String> nam1 = Stream.of("intel 1", "intel 11", "intel 2", "intel 22", "intel 3", "intel 33");
        Stream<Integer> proc1 = Stream.of(1, 11, 2);
        Stream.concat(nam1, proc1).forEach(n -> System.out.println(n));

        System.out.println("_______________________________distinct()____________________________");
        Stream<Integer> numbers33 = Stream.of(-1, -1, -11, 0, 1, 1, 3, 22,-5);
        numbers33.sorted().distinct()
                .forEach(n -> System.out.println(n));

        System.out.println("_______________________________isPresent()_исключение java.util.NoSuchElementException___________________________");
        ArrayList<Integer> numbers333= new ArrayList<Integer>();
        Optional<Integer> min = numbers333.stream().min(Integer::compare);
        if(min.isPresent()){
            System.out.println(min.get());
        }

        System.out.println("_______________________________orElse()____________________________");
        // пустой список
        ArrayList<Integer> numbers44 = new ArrayList<Integer>();
        min = numbers44.stream().min(Integer::compare);
        System.out.println(min.orElse(-1)); // -1

        // непустой список
        numbers44.addAll(Arrays.asList(new Integer[]{4,5,6,7,8,9}));
        min = numbers44.stream().min(Integer::compare);
        System.out.println(min.orElse(-1)); // 4

        System.out.println("_______________________________ifPresentOrElse()____________________________");
        ArrayList<Integer> numbers55 = new ArrayList<Integer>();
        min = numbers55.stream().min(Integer::compare);
        min.ifPresentOrElse(
                v -> System.out.println(v),
                () -> System.out.println("&&&&&&&&&&")
        );
    }
}

