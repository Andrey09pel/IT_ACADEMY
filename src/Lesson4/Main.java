package Lesson4;

import java.util.Scanner;
import java.util.Random;
public class Main {

    public static void main(String[] args) {
        Cat cat = new Cat();
        // цикл while
        cat.whileCat();
        cat.getArrCat();

        // цикл For
        cat.clearArrCat(); // чистим массив
        cat.ForCat(); // заполняем массив
        cat.getArrCat(); // вывод всего массива

        // цикл do while
        cat.clearArrCat(); // чистим массив
        cat.doWhileCat();
        cat.getArrCat(); // вывод всего массива

        // цикл foreach
        cat.clearArrCat(); // чистим массив
        cat.forEachCat();
        cat.getArrCat(); // вывод всего массива
    }
}
