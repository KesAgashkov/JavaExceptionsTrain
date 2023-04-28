import java.util.InputMismatchException;
import java.util.Scanner;

public class HW2 {
    public static void main(String[] args) {
//       Задание 1
//       System.out.println(getFloat());

//       Задание 2
//       int intArray [] =  new int[5];
//       try {
//       int d = 0;
//       double catchedRes1 = intArray[8] / d;
//       System.out.println("catchedRes1 = " + catchedRes1);
//       } catch (ArithmeticException e) {
//           System.out.println("Catching exception: " + e);
//       } catch (IndexOutOfBoundsException e) {
//           System.out.println("Catching exception: " + e);
//           System.out.println("Вы вышли за границы массива");
//       }

//       Задание 3
//        try {
//            int a = 90;
//            int b = 3;
//            System.out.println(a / b);
//            try{
//                printSum(23, 253);
//            }catch (Throwable ex){ //как обработать ввод неверных аргументов в методе????
//                System.out.println("Введены неверные аргументы в методе");
//            }
//            int[] abc = {1, 253};
//            abc[3] = 9;
//        } catch (IndexOutOfBoundsException ex) {
//            System.out.println("Массив выходит за пределы своего размера!");
//        } catch (ArithmeticException ex) {
//            System.out.println("На ноль делить нельзя");
//        } catch (Exception ex) {
//            System.out.println("Что-то пошло не так...");
//        }
//    }
//    public static void printSum (Integer a, Integer b){
//        System.out.println(a + b);
//    }
//      Задание 4
//      System.out.println(getString());
    }

    //Задание 1.Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
    //и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению
    //приложения, вместо этого, необходимо повторно запросить у пользователя ввод данных.
    static float getFloat() {
        float a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число в формате float. для разделения м/д целой и дробной частью используйте ','");
        try {
            a = sc.nextFloat();
            System.out.println("Это успех");
            return a;
        } catch (InputMismatchException e) {
            System.out.println("Введён неверный формат числа, не удаётся преобразование во Float");
            System.out.println("Попробуйте ввести число еще раз");
            return getFloat();
        }
    }


    //Задание 2. Если необходимо, исправьте данный код
//    try {
//        int d = 0;
//        double catchedRes1 = intArray[8] / d;
//        System.out.println("catchedRes1 = " + catchedRes1);
//    } catch (ArithmeticException e) {
//        System.out.println("Catching exception: " + e);
//    }

    //Задание 3. Дан следующий код, исправьте его там, где требуется
//    public static void main(String[] args) throws Exception {
//        try {
//            int a = 90;
//            int b = 3;
//            System.out.println(a / b);
//            printSum(23, 234);
//            int[] abc = { 1, 2 };
//            abc[3] = 9;
//        } catch (Throwable ex) {
//            System.out.println("Что-то пошло не так...");
//        } catch (NullPointerException ex) {
//            System.out.println("Указатель не может указывать на null!");
//        } catch (IndexOutOfBoundsException ex) {
//            System.out.println("Массив выходит за пределы своего размера!");
//        }
//    }
//    public static void printSum(Integer a, Integer b) throws FileNotFoundException {
//        System.out.println(a + b);
//    }

//    Задание 4 Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
//    Пользователю должно показаться сообщение, что пустые строки вводить нельзя.

    public static String getString() {
        String res;
        System.out.println("Введите любое значение, кроме пустой строки");
        Scanner sc =  new Scanner(System.in);
        res = sc.nextLine();
        if (!res.isEmpty())
            return res;
        throw new IllegalArgumentException ("Строка не может быть пустой");
    }
}

