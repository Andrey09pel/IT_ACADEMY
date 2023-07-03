package Lesson3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String color_new="";
        String color_dop="";
        Rainbow rainbow = new Rainbow();
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Выберетие цвет от 1 - 6 ");
        int colocIdx = scanner.nextInt();

        if (colocIdx >= 0){
            color_new = Rainbow.getColor(colocIdx);
            }
        else {
            System.out.println("Цвет не найден");
        }

        if (color_new != ""){
            System.out.println(" Добавить оттенок ДА -1 / НЕТ - 2");
            colocIdx = scanner.nextInt();
            if (colocIdx ==1){
                System.out.println(" Выберетие цвет от 1 - 6 ");
                colocIdx = scanner.nextInt();
                color_dop = Rainbow.getColor(colocIdx);
                if (color_dop != ""){
                    System.out.println("Ваш цвет "+color_new + " c оттенком "+color_dop );
                }
            }
        };



    }
}
