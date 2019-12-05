package ru.gb.java1.les1.homework1;

// Оказалось непонятным в каких случаях используется возвратный метод, а в каких нет.
// И не очень понятно про преобразование типа переменных.
public class Homework_1 {
    public static void main(String[] args) {
        System.out.println(first(2, 5, 11, 6)); // вычисление выражения
        System.out.println(second(9, 1));             // число в пределах 10 и 20
        third(-6);                                       // положительное/отрицательное
        fourth("Оксана");                             // приветствие
        fifth(1700);                                     // високосный
    }
    // вычисление выражения
    // работает только с float вместо int
    private static float first(int a, int b, int c, int d) {
        float result;
        result = a * (b + (c / 1f / d));
        return result;
    }
    // число в пределах 10 и 20
    private static boolean second(int a, int b) {
        int c = a + b;
        boolean result;
        if (c >= 10 && c <= 20) return result = true;
        else return result = false;
    }
    // положительное/отрицательное
    private static void third(int a) {
        if (a >= 0) System.out.println("Число положительное");
        else System.out.println("Число отрицательное");
    }
    // приветствие
    private static void fourth(String name) {
        System.out.println("Привет, " + name + "!");
    }
    // високосный год
    private static void fifth(int a) {
        int c = a % 4;
        int b = a % 400;
        int d = a % 100;
        if (c == 0 && d != 0 || b == 0) {
            System.out.println("Год високосный");
        } else {
            System.out.println("Год не високосный");
        }
    }
}
