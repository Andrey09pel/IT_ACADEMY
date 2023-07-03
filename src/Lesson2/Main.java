package Lesson2;

public class Main {
    //примитивы
    //целые числа
    public static byte var_byte ;
    public static short var_short ;
    public static int var_int ;
    public static long var_long ;

    //Вещественные числа
    public  static float var_float;
    public static double var_double;
    //Символы
    public static char var_char ;
    //Логические числа
    public static boolean var_boolean = true;

    //Обертки
    public static Byte v_byte ;
    public static Short v_short ;
    public static Integer  v_int ;

    public static Float v_float ;
    public static Double v_double ;
    public static Character v_char ;
    public static Boolean v_boolean = true;

    public static void  main(String[] args) {
        byte local_byte ;
        short local_short ;
        int local_int ;
        long local_long ;
        float local_float;
        double local_double;
        char local_char ;
        boolean local_boolean;

        Byte l_byte ;
        Short l_short ;
        Integer l_int ;
        Float l_float ;
        Double l_double ;
        Character l_char ;
        Boolean l_boolean = true;

        Person person = new Person();

        System.out.println("---Default Param Person ---");
        person.getDefaultParamPerson();

        // присваеваем публичные переменные метода Person в локальные переменные
        local_byte = Person.var_byte;
        local_short = Person.var_short;
        local_int = Person.var_int;
        local_long = Person.var_long;
        local_float = Person.var_float;
        local_double = Person.var_double;
        local_char = Person.var_char;
        local_boolean = Person.var_boolean;
        l_byte = Person.v_byte;
        l_short = Person.v_short;
        l_int = Person.v_int;
        l_float = Person.v_float;
        l_double = Person.v_double;
        l_char = Person.v_char;

        System.out.println("---Default Param Main ---");
        getParamMain();

        // локальные переменные присваивам буличным сласса main
        var_byte = local_byte;
        var_short = local_short;
        var_int = local_int;
        var_long = local_long;
        var_float = local_float;
        var_double = local_double;
        var_char = local_char;
        var_boolean = local_boolean;
        v_byte  = l_byte;
        v_short = l_short;
        v_int = l_int;
        v_float = l_float;
        v_double = l_double;
        v_char = l_char;

        System.out.println("---Result Param Main ---");
        getParamMain();
    }
    public static void getParamMain() {
        System.out.println(" var_byte = "+var_byte);
        System.out.println(" var_short = "+var_short);
        System.out.println(" var_int = "+var_int);
        System.out.println(" var_long = "+var_long);
        System.out.println(" var_float = "+var_float);
        System.out.println(" var_double = "+var_double);
        System.out.println(" var_char = "+var_char);
        System.out.println(" var_boolean = "+var_boolean);
        System.out.println(" v_byte = "+v_byte);
        System.out.println(" v_short = "+v_short);
        System.out.println(" v_int = "+v_int);
        System.out.println(" v_float = "+v_float);
        System.out.println(" v_double = "+v_double);


    }

}
