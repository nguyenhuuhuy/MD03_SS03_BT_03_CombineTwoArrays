package Gop_Mang;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size_One;
        int size_Two;
        int[] list_One;
        int[] list_Two;
        do {
            System.out.print("tạo số phần tử trong mảng thứ I: ");
            size_One = scanner.nextInt();
            if (size_One > 20)
                System.out.println("không được nhập quá 20");
        } while (size_One > 20);
        list_One = new int[size_One];
        int i = 0;
        while (i < list_One.length) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + " : ");
            list_One[i] = scanner.nextInt();
            i++;
        }
        System.out.print("mảng thứ 1: " + Arrays.toString(list_One) + "\n");
        do {
            System.out.print("tạo số phần tử trong mảng thứ II: ");
            size_Two = scanner.nextInt();
            if (size_Two > 20)
                System.out.println("không được nhập quá 20");
        } while (size_Two > 20);
        list_Two = new int[size_Two];
        int j = 0;
        while (j < list_Two.length) {
            System.out.print("nhập phần tử thứ " + (j + 1) + " : ");
            list_Two[j] = scanner.nextInt();
            j++;
        }
        System.out.print("mảng thứ 2: " + Arrays.toString(list_Two));
        int[] all = new int[list_One.length + list_Two.length];
        int pos = 0;
        for (int element : list_One) {
            all[pos] = element;
            pos++;
        }
        for (int element : list_Two) {
            all[pos] = element;
            pos++;
        }
        System.out.println("\n" + "sau khi nối: " + Arrays.toString(all));
    }
}
