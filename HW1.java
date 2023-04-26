import javax.swing.*;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HW1 {
    public static void main(String[] args) {
        //Задача 1
        Random rand = new Random();
        int a[] = new int[rand.nextInt(8, 10)];
        int b[] = new int[rand.nextInt(8, 10)];
        for (int i = 0; i < a.length; i++) {
            a[i] = rand.nextInt(0, 11);
        }
        for (int j = 0; j < b.length; j++) {
            b[j] = rand.nextInt(0, 11);
        }
        //Задача 1
//        System.out.println("Массив A");
//        System.out.println(Arrays.toString(a));
//        System.out.println("Массив B");
//        System.out.println(Arrays.toString(b));
//        System.out.println("Результат");
//        System.out.println(Arrays.toString(getMathDiff(a, b)));
        //Задача 2
//        System.out.println("Массив A");
//        System.out.println(Arrays.toString(a));
//        System.out.println("Массив B");
//        System.out.println(Arrays.toString(b));
//        System.out.println("Результат");
//        System.out.println(Arrays.toString(getMathQuitient(a, b)));
        //Задача 3
//        System.out.println("Массив A");
//        System.out.println(Arrays.toString(a));
//        System.out.println("Массив B");
//        System.out.println(Arrays.toString(b));
//        System.out.println("Результат");
//        System.out.println(Arrays.toString(getMathSumm(a, b)));
        //Задача 4
        int c[][] = new int[rand.nextInt(8, 10)][rand.nextInt(8, 10)];
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[i].length; j++) {
                c[i][j] = rand.nextInt(0, 11);
                System.out.print("\t" + c[i][j] + " ");
            }
            System.out.println();
        }
        getArrDimention(c);
    }
//    1.Реализуйте метод, принимающий в качестве аргументов два целочисленных массива,
//    и возвращающий новый массив, каждый элемент которого равен разности элементов
//    двух входящих массивов в той же ячейке. Если длины массивов не равны,
//    необходимо как-то оповестить пользователя.

    static int[] getMathDiff(int[] a, int[] b) {
        if (a.length != b.length) {
            System.out.println("Длина массивов не равна");
            System.exit(1);
        }
        int[] res = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            res[i] = a[i] - b[i];
        }
        return res;
    }
//    2.Реализуйте метод, принимающий в качестве аргументов два целочисленных массива,
//    и возвращающий новый массив, каждый элемент которого равен частному элементов двух
//    входящих массивов в той же ячейке. Если длины массивов не равны, необходимо как-то
//    оповестить пользователя. Важно: При выполнении метода единственное исключение, которое
//    пользователь может увидеть - RuntimeException, т.е. ваше.
    static int[] getMathQuitient(int[] a, int[] b) {
        if (a.length != b.length) {
            throw new RuntimeException("Массивы не равны");
        }
        int[] res = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            if (b[i] == 0) throw new RuntimeException("На ноль делить нельзя");
            res[i] = a[i] / b[i];
        }
        return res;
    }
//    ***Дополнительно:

//    3.Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий
//    новый массив, каждый элемент которого равен сумме элементов двух входящих массивов в той же
//    ячейке. Если длины массивов не равны, необходимо как-то оповестить пользователя.
    static int[] getMathSumm(int[] a, int[] b) {
        if (a.length != b.length) {
            throw new RuntimeException("Массивы не равны");
        }
        int[] res = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            res[i] = a[i] + b[i];
        }
        return res;
    }

//    4.Реализуйте метод, принимающий в качестве аргументов двумерный массив. Метод должен проверить
//    что длина строк и столбцов с одинаковым индексом одинакова, детализировать какие строки
//    со столбцами не требуется. Как бы вы реализовали подобный метод?
    static void getArrDimention(int[][] c) {
        if (c.length == 0)
            throw new RuntimeException("Массива не существует");
        if (c.length == c[0].length)
            throw new RuntimeException("Массив квадратный с размерностью:" + c.length + " x " +c.length);
        throw new RuntimeException("Массив прямоугольный с размерностью:" + c.length + " x " + c[0].length);
    }
}