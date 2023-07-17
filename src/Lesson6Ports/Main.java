package Lesson6Ports;
import Lesson6Ports.Ships.Ships;
import Lesson6Ports.Puerto.Puerto;
import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
    Puerto puerto = new Puerto(4, 5000, 1000);

    List<Ships> ships = new ArrayList<>();

        for (int i = 0; i < 4; i++) {
        ships.add(new Ships("Корабль " + i, 260, 0, puerto));
    }

        try {
        Thread.sleep(3500);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }

        for (int i = 4; i < 8; i++) {
        ships.add(new Ships("Корабль " + i, 0, 300, puerto));
    }

        for (Ships ship : ships){
        try {
            ship.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

        System.out.println("Все корабли выполнили свою задачу или нет, в вечерних новостях узнаем");


}
}
