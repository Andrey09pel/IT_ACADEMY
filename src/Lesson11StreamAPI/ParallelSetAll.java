package Lesson11StreamAPI;

import java.util.Arrays;
import java.util.List;

public class ParallelSetAll {
    public static void main(String[] args) {

        Processor[] Processor = new Processor[]{new Processor("INTEL 8", 111),
                new Processor("INTEL 88", 222),
                new Processor("INTEL 888", 333),
                new Processor("INTEL 8888", 444)};

        Arrays.parallelSetAll(Processor, i -> {
            Processor[i].setfrequency(Processor[i].getfrequency()-100);
            return Processor[i];
        });

        for(Processor p: Processor)
            System.out.printf("%s - %d \n", p.getName(), p.getfrequency());
    }
}
