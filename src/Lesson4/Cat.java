package Lesson4;


import java.util.Scanner;
import java.util.Random;
public class Cat {

    public static String cat_name = "Кот" ;
    public static String cat_age = "1";
    public static String[][] whileCatArr = new String[2][10];
    public  void whileCat() {
        int idx = 0;
        int idy = 0;

        while (idx < 10 ){
            whileCatArr[0][idx] = cat_name;
            whileCatArr[1][idx] = cat_age;
            idx++;
        }
    }

    public  void ForCat() {
        int idx = 0;

        for ( idx = 0; idx < whileCatArr[0].length; idx++) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите имя котика ");
            String NameCat = String.valueOf(scanner.nextLine());
            setArr(0,idx,NameCat); // установка значения имя
            System.out.println("Введите возрост котика ");
            String AgeCat = String.valueOf(scanner.nextLine());
            setArr(1,idx,AgeCat); // установка значения возраст
            getArr(idx); // вывод установленных значений
        }
    }

    public  void doWhileCat() {
        int idx = 0;

        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите имя котика ");
            String NameCat = String.valueOf(scanner.nextLine());
            whileCatArr[0][idx] = NameCat;
            System.out.println("Введите возрост котика ");
            String AgeCat = String.valueOf(scanner.nextLine());
            whileCatArr[1][idx] = AgeCat; // установка значения возраст
            idx++;
         } while (idx < whileCatArr[0].length);
    }

    public  void forEachCat( ) {
        int idx = 0;
        int idy= 0;
        int random = 0;
        int n = 5;
        //String[][] whileCatArr
        for (String[] k :whileCatArr){
            for(String i: k){
                for (int z = 1; z < 28; z++) {
                    n= generateRandomNumber(n);
                }

                whileCatArr[0][idx] = String.valueOf(n) ;
                whileCatArr[1][idx] = String.valueOf(n) ;
            }
        }
    }

    public void  getArr(int idx) {
        System.out.print("Имя котика - "+whileCatArr[0][idx] + " возрост "+whileCatArr[1][idx]+"\t");
    }
    public void setArr(int idy,int idx,String valye) {
        this.whileCatArr[idy][idx] = valye;
    }
    public  void getArrCat() {
        for (int i = 0; i < whileCatArr.length; i++) {
            for (int j = 0; j < whileCatArr[i].length; j++) {
                System.out.print(whileCatArr[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public  void clearArrCat() {
        for (int i = 0; i < whileCatArr.length; i++) {
            for (int j = 0; j < whileCatArr[i].length; j++) {
                whileCatArr[i][j] = null;
            }
        }
    }
    public static int generateRandomNumber(int n)
    {
        if (n < 0) {
            throw new IllegalArgumentException("n must not be negative");
        }

        // генерируем случайное число от 0 до `n`
        return new Random().nextInt(n + 1);
    }


}
