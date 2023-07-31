package Lesson11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Start {
    public static void main(String[] args) throws IOException, ParseException {
        Scanner in = new Scanner(System.in);
        Path orderShit = Paths.get("orderShit.txt");        // лист заказов
        Path productList = Paths.get("productList.txt");    // лист товаров
        SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd");
        int var ;
        String fileName;
        String text = null;
       // do {
            System.out.print("Действие: \n " + "1 - Вывести список товаров \n"
                                            + "2 - Вывести список заказов\n"
                                            + "3 - Добавить товар\n"
                                            + "4 - Удалить товар \n"
                                            + "5 - Добавить заказ\n"
                                            + "6 - Удалить заказ \n"
                                            + "7 - ВЫХОД \n");

            var = Integer.parseInt(in.nextLine());
            switch (var) {
                case 1: {
                    fileName = String.valueOf(productList.getFileName());
                    readToFileTXT.print(fileName);
                    break;
                }
                case 2: {
                    fileName = String.valueOf(orderShit.getFileName());
                    readToFileTXT.print(fileName);
                    break;
                }
                case 3: {
                    System.out.print("Введите: \n " + " Идентификатор товара \n");
                    int idx = in.nextInt();
                    System.out.print("Введите: \n " + " Название товара \n");
                    String name = in.next();
                    System.out.print("Введите: \n " + " Дату изготовления \n");

                    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                    String date = reader.readLine();

                    Date dateBeg = s.parse(date);
                    SimpleDateFormat a = new SimpleDateFormat("MMM dd, yyyy", Locale.ENGLISH);
                    System.out.println(a.format(dateBeg).toUpperCase());
                    new ProductList(idx, name, dateBeg);
                    libActionProductList ProductList1 = new ProductList(idx, name, dateBeg);
                    System.out.println(ProductList1);
                    String setParam = String.valueOf(ProductList1);
                    writeToFileTXT.writeToFile(setParam, productList);
                    break;
                }
                case 4: {
                    System.out.print("Введите: \n " + " Идентификатор товара \n");
                    int idx = in.nextInt();
                    fileName = String.valueOf(productList.getFileName());
                    DeleteStrToFile.dellRows(fileName,idx);
                    break;
                }
                case 5: {
                    System.out.print("Введите: \n " + " Идентификатор товара \n");
                    int idx = in.nextInt();
                    System.out.print("Введите: \n " + " Название товара \n");
                    String name = in.next();


                    Date dateBeg = new Date();
                    SimpleDateFormat a = new SimpleDateFormat("MMM dd, yyyy", Locale.ENGLISH);
                    System.out.println(a.format(dateBeg).toUpperCase());
                    new OrderShit(idx, name, dateBeg);
                    libActionOrderShit OrderShit1 = new libActionOrderShit(idx, name, dateBeg);
                    System.out.println(OrderShit1);
                    String setParam = String.valueOf(OrderShit1);
                    writeToFileTXT.writeToFile(setParam, orderShit);
                    break;
                }
                case 6: {
                    System.out.print("Введите: \n " + " Идентификатор товара \n");
                    int idx = in.nextInt();
                    fileName = String.valueOf(orderShit.getFileName());
                    DeleteStrToFile.dellRows(fileName,idx);
                    break;
                }
                case 7: {
                     break;
                }


            }

       //     if (var == 7)
       //         continue;
       // } while(var == 7);


    }
}
