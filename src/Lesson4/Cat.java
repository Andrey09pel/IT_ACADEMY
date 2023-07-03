package Lesson4;

public class Cat {
    public static String cat_name = "Кот" ;
    public static int cat_age = 1;
    public static String[][] whileCatArr = new String[2][10];
    public  void whileCat() {
        int idx = 0;
        int idy = 0;
        System.out.println("start");
        System.out.println("idx "+idx);
        System.out.println("idy "+idy);
        while (idx > 9 && idy > 2){
            System.out.println(idy);
            System.out.println(idy);
            if(idy == 0 ){
                whileCatArr[idx][idy] = cat_name;
            }
            if(idy == 1 ){
                whileCatArr[idx][idy] = String.valueOf(cat_age);
            }
            idx++;
            if(idx == 10){
                idy++;
                idx=0;
            }


        }
    }

    public  void getArrCat() {
        for (int i = 0; i < whileCatArr.length; i++) {
            for (int j = 0; j < whileCatArr[i].length; j++) {
                System.out.print(whileCatArr[i][j] + "\t");
            }
            System.out.println();
        }

    }
}
