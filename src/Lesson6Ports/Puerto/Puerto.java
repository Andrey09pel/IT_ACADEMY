package Lesson6Ports.Puerto;
// порт
import java.util.ArrayList;
import java.util.List;
public class Puerto {


    private int dockQty;
    private int containersCapacity;
    private int currentContainersQty;

    List<Thread> ships = new ArrayList<>();

    public Puerto(int dockQty, int containersCapacity, int currentContainersQty) {
        this.dockQty = dockQty;
        this.containersCapacity = containersCapacity;
        this.currentContainersQty = currentContainersQty;
    }

    public int getContainersCapacity() {
        return containersCapacity;
    }

    public int getCurrentContainersQty() {
        return currentContainersQty;
    }

    public void addContainer() {
        currentContainersQty++;
    }
    public void takeConatiner() {
        currentContainersQty--;
    }


    public synchronized void askPermission(){
        while (dockQty == 0){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        ships.add(Thread.currentThread());
        System.out.println(Thread.currentThread().getName() + " получил разрешение");
        dockQty--;
    }

    public synchronized void returnPermission(){

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(Thread.currentThread().getName() + " покидает порт");

        System.out.println("Текущее количество контенеров в порту: " + currentContainersQty);

        if (ships.contains(Thread.currentThread())) {
            dockQty++;
        }
        ships.remove(Thread.currentThread());



        notifyAll();
    }
}
