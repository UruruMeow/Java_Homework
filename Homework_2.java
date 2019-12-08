package ru.gb.java1.les1.homework1;

public class Homework_2 {
    public static void main(String[] args) {
        invertNumbers();
        System.out.println(); fillArray();
        System.out.println(); changeNumbers();
        System.out.println(); searchMinMax();
        System.out.println(); diagonal();
    }
    private static void invertNumbers() {
        int[] a = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i =  0; i < a.length;  i++) {
            System.out.print((a[i] == 1) ? "0" : "1");
        }
    }
    private static void fillArray() {
        int[] ar;
        ar = new int[8];
        for (int i = 0, j = 1; i < ar.length; i++) {
            ar[i] = j;
            System.out.print(j + " ");
            j += 3;
        }
    }
    private static void changeNumbers() {
        int[] a = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i =  0; i < a.length;  i++) {
            int j = a[i];
            System.out.print((j < 6) ? j * 2 + " " : j + " ");
        }
    }
    private static void searchMinMax() {
        int[] a = {1, 5, 3, 2, 11, 4};
        int min = a[0];
        for (int i =  0; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
            }
        }
        System.out.print("min = " + min + " ");
        int max = a[0];
        for (int i =  0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        System.out.print("max = " + max);
    }
    private static void diagonal() {
        int[][] a = new int [5][5];
        for (int y = 0; y < a.length; y++) {
            for (int x = 0; x < a[y].length; x++) {
                System.out.print((a[y] == a[x]) ? 1 : 0);
            }
            System.out.println();
        }
    }
}