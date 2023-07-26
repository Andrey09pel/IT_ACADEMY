package Lesson7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        List<String> arrayList = new ArrayList();
        boolean retval = arrayList.isEmpty();
        if (retval) {
            System.out.println("Лист пустой");
        } else {
            System.out.println("Что то нашли");
        }

        System.out.println("Размер => start: " + arrayList.size());
        arrayList.add("1");
        arrayList.add("1");
        arrayList.add("3");
        arrayList.add("4");
        arrayList.add("5");
        arrayList.add("6");
        arrayList.add("110");
        boolean retval2 = arrayList.isEmpty();
        if (retval2) {
            System.out.println("Лист пустой");
        } else {
            System.out.println("Что то нашли");
        }

        Iterator var4 = arrayList.iterator();

        while(var4.hasNext()) {
            String number = (String)var4.next();
            System.out.println("Значение = " + number);
        }

        boolean retval3 = arrayList.contains("110");
        if (retval3) {
            System.out.println("110 элемнт есть");
        } else {
            System.out.println("110 элемнт отсутствует");
        }

        boolean retval4 = arrayList.contains("1");
        if (retval4) {
            System.out.println("0 элемнт есть");
        } else {
            System.out.println("0 элемнт отсутствует");
        }

        System.out.println("Содержимое (add): " + arrayList);
        arrayList.add(1, "11");
        arrayList.set(0, "110");
        System.out.println("Размер (add index): " + arrayList.size());
        System.out.println("Содержимое (add index) : " + arrayList);
        System.out.println("Перезатертый элемент " + (String)arrayList.get(0));
        arrayList.isEmpty();
        arrayList.remove("6");
        arrayList.remove(2);
        System.out.println("Размер => удаления: " + arrayList.size());
        System.out.println("Содержимое : " + arrayList);
        System.out.println("arrayList после добавления " + arrayList);
        System.out.println("Получить первый обьект по индексу = " + (String)arrayList.get(0));
        arrayList.remove("2");
        System.out.println("arrayList после удаления (remove) " + arrayList);
        arrayList.remove(3);
        System.out.println("arrayList после удаления (remove) " + arrayList);
        arrayList.set(0, "222");
        System.out.println("arrayList set установленые значение " + arrayList);
        int index1 = arrayList.indexOf("222");
        System.out.println("index1 =  " + index1);
        int index2 = arrayList.indexOf("11");
        System.out.println("index1 =  " + index2);
        ArrayList<String> list = new ArrayList();
        boolean retvalist1 = list.contains("111111");
        if (retvalist1) {
            System.out.println("list пустой");
        } else {
            System.out.println(" list Что то нашли");
        }

        System.out.println("Содержимое (list): " + list);
        ArrayList<String> list2 = new ArrayList(10000);
        boolean retvalist2 = list2.contains("111111");
        if (retvalist2) {
            System.out.println("list2 пустой");
        } else {
            System.out.println(" list2 Что то нашли");
        }

        System.out.println("Содержимое (list2): " + list);
        ArrayList<String> list3 = new ArrayList(arrayList);
        System.out.println("Содержимое (list3): " + list3);
    }
}
