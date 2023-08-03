package Lesson11StreamAPI;
import java.util.Comparator;
class ProcComporator implements Comparator<Processor>{

    public int compare(Processor a, Processor b){

        return a.getName().toUpperCase().compareTo(b.getName().toUpperCase());
    }
}
