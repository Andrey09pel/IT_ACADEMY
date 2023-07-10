package Lesson5;

import java.util.Random;

public class LibLesson5 {

    public static String[][] arr = new String[10][10];
    public static String[][] masterArr = new String[1][10];
    public static String[][] slavArr = new String[1][10];
    public static StringBuffer masterSb = new StringBuffer();
    public static StringBuffer slavSb = new StringBuffer();

    public static void setArr() {
        Random rand = new Random();
        boolean v_int = false;
        boolean v_str = false;
        int a = 0;
        int b = 10;
        int x = a + rand.nextInt(b - a + 1);
        double dx = a + rand.nextDouble() * (b - a);
        int leftLimit = 97; // letter 'a'
        int rightLimit = 122; // letter 'z'
        int targetStringLength = 7;

        for (int i = 0; i < arr.length; i++) {
            v_int = true;
            for (int j = 0; j < arr[i].length; j++) {
                if (v_int) {
                    v_int = false;
                    v_str = true;
                    arr[i][j] = String.format("%.7f%n", (a + rand.nextDouble() * (b - a)));
                } else if (v_str) {
                    arr[i][j] = rand.ints(leftLimit, rightLimit + 1)
                            .limit(targetStringLength)
                            .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                            .toString();
                    v_str = false;
                } else {
                    arr[i][j] = String.valueOf(rand.nextInt());
                    v_int = true;
                }
                ;
            }
        }
    }

    public static void getArr() {
        System.out.print("Онавной массив ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }

    private static boolean numeralOrNot(String valye) {
        if (valye == null || valye.isEmpty()) {
            return false;
        }
        int commaCount = 0;
        for (int i = 0; i < valye.length(); i++) {

            if (valye.charAt(i) == '.') {
                commaCount++;
            }
            if ((!Character.isDigit(valye.charAt(i)) && valye.charAt(i) != '.' && valye.charAt(i) != '-') || commaCount > 1) {
                return false;
            }
        }

        return true;
    }

    public static void sb() {
        double number;
        //так как массивы одинаковые без фанатизма
        for (int i = 0; i < masterArr.length; i++) {
            for (int j = 0; j < masterArr[i].length; j++) {
                if  (numeralOrNot(masterArr[i][j])== false){
                   masterSb.append(masterArr[i][j].toString().substring(2, 4));
                }
                if (numeralOrNot(slavArr[i][j])== false){
                    number = Double.parseDouble(slavArr[i][j].substring(slavArr[i][j].indexOf(".")).substring(1));
                    if (!((number/0.7) > 1)) {
                        slavArr[i][j]= String.valueOf(Math.floor(Double.parseDouble(slavArr[i][j])));
                    } else {
                        slavArr[i][j]= String.valueOf(Math.ceil(Double.parseDouble(slavArr[i][j])));
                    }
                    for(i = 0; i < slavArr.length; i++){
                        System.out.println(i);
                        if(i < slavArr.length - 1){
                            System.out.println("_");
                        }
                    }
                }
            }
        }
        System.out.println("masterSb = " + masterSb);
        System.out.println("slavSb = " + slavSb);
        }
    public static void newArr() {

        // главная
        System.out.print("Главная диоганаль ");
        for (int i = 0; i < (Math.min(arr[0].length, arr.length)); i++) {
            masterArr[0][i] = arr[i][i];
            System.out.print(arr[i][i] + "\t");
        }

        // Побочная
        System.out.print("Побочная диоганаль ");
        for (int i = 0; i < (Math.min(arr[0].length, arr.length)); i++) {
            slavArr[0][i] = arr[i][arr[0].length - i - 1];
            System.out.print(arr[i][arr[0].length - i - 1] + "\t");

        }

        // сравнение
        System.out.print("Сравнение ");
        //1 вариант
        for (int i = 0; i < masterArr.length; i++) {
            for (int j = 0; j < masterArr[i].length; j++) {
                if (masterArr[i][j] == slavArr[i][j]) {
                    System.out.println("Главная / побочная диоганаль " + masterArr[i][j] + " = " + slavArr[i][j]);
                } else {
                    System.out.println("Главная / побочная диоганаль " + masterArr[i][j] + " != " + slavArr[i][j]);
                }
                ;

            }
            //2 вариант
            for (int a = 0; a < masterArr.length; a++) {
                for (int j = 0; j < masterArr[a].length; j++) {
                    if (masterArr[a][j].equals(slavArr[a][j])) {
                        System.out.println("Главная / побочная диоганаль " + masterArr[a][j] + " = " + slavArr[a][j]);
                    } else {
                        System.out.println("Главная / побочная диоганаль " + masterArr[a][j] + " != " + slavArr[a][j]);
                    }
                    ;

                }
                System.out.println();
            }
        }



          }





}
