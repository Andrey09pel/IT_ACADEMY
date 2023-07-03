package Lesson2;

public class Person {
    //примитивы
    //целые числа
    public static byte var_byte = 1;
    public static short var_short = 2;
    public static int var_int =3;
    public static long var_long =4;

   //Вещественные числаd
    public static float var_float = 8.5F;
    public static double var_double = 8.5;
    //Символы
    public static char var_char = 102;
    //Логические числа
    public static boolean var_boolean = true;

    //Обертки
    public static Byte v_byte = 1;
    public static Short v_short = 2;
    public static Integer  v_int =3;
    //Long v_long = 4;
    public static Float v_float = 8.5F;
    public static Double v_double = 8.5;
    public static Character v_char = 102;
    public static Boolean v_boolean = true;

    public  int getByte() {
        return var_byte;
    }
    public void setByte(byte varByteNew) {
        this.var_byte = varByteNew;
    }
    public int getShort() {
        return var_short;
    }
    public void setShort(byte varShortNew) {
        this.var_short = varShortNew;
    }
    public int getInt() {
        return var_int;
    }
    public void setInt(int varIntNew) {
        this.var_int = varIntNew;
    }
    public long getLong() {
        return var_long;
    }
    public void setLong(long varLongNew) {
        this.var_long = varLongNew;
    }
    public float getFloat() {
        return var_float;
    }
    public void setFloat(float varFloatNew) {
        this.var_float = varFloatNew;
    }
    public double getDouble() {
        return var_double;
    }
    public void setDouble(double varDoubleNew) {
        this.var_double = varDoubleNew;
    }
    public boolean getBoolean() {
        return var_boolean;
    }
    public void setBoolean(boolean varBooleanNew) {
        this.var_boolean = varBooleanNew;
    }
    public char getChar() {
        return var_char;
    }
    public void setChar(char varCharNew) {
        this.var_char = varCharNew;
    }
    public  void getDefaultParamPerson() {
        System.out.println(" person.var_byte = "+this.getByte());
        System.out.println(" person.var_boolean = "+this.getBoolean());
        System.out.println(" person.var_dooble = "+this.getDouble());
        System.out.println(" person.var_int = "+this.getInt());
        System.out.println(" person.var_float = "+this.getFloat());
        System.out.println(" person.var_long = "+this.getLong());
        System.out.println(" person.var_short = "+this.getShort());
        System.out.println(" person.var_char = "+this.getChar());

    }


}
