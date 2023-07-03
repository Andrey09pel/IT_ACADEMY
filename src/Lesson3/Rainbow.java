package Lesson3;

public class Rainbow {
    public static String local_colar ;
    static final String white = "white";
    static final String black = "black";
     static final String red = "green";
     static final String blue = "blue";
     static final String pink = "pink";
     static final String grey = "grey";
     static final String brown = "brown";

    public static String getColor(int var_color) {
        switch (var_color){
            case 1: {
                    System.out.println(" Цвет = "+ white);
                    local_colar = white;
                    break;
                }
            case 2: {
                System.out.println(" Цвет = "+ black);
                local_colar = black;
                break;
                }
            case 3: {
                System.out.println(" Цвет = "+ red);
                local_colar = red;
                break;
                }
            case 4:{
                System.out.println(" Цвет = "+ blue);
                local_colar = blue;
                break;
                }
            case 5: {
                System.out.println(" Цвет = "+ pink);
                local_colar = pink;
                break;
                }
            case 6: {
                System.out.println(" Цвет = "+ grey);
                local_colar = grey;
                break;
                }
            case 7: {
                System.out.println(" Цвет = "+ brown);
                local_colar = brown;
                break;
                }
            }
            return  local_colar;
    }
}
