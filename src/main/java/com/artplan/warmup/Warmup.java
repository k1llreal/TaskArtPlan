package com.artplan.taskartplan.warmup;

/*
Разминка.

Написать метод, который разворачивает строку в обратном порЯдке и
замерить времЯ работы этого метода на 1000, 10 000, 100 000 повторений.
оформить надо в виде stand alone java приложениЯ с консольным вводом строки.
результатом работы должны быть строка, развернутаЯ строка и 3 цифры (времЯ работы).
*/

import java.util.Scanner;

public class Warmup {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string to reverse:");
        String str = sc.nextLine();
        String result = "";

        // measure the working time of the method for 1000 times
        long start1 = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            result = reverse(str);
        }
        long finish1 = System.currentTimeMillis();
        long resultTime1 = finish1 - start1;

        // for 10000 times
        long start2 = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            result = reverse(str);
        }
        long finish2 = System.currentTimeMillis();
        long resultTime2 = finish2 - start2;

        // for 100000 times
        long start3 = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            result = reverse(str);
        }
        long finish3 = System.currentTimeMillis();
        long resultTime3 = finish3 - start3;

        System.out.println("Your string: " + str);
        System.out.println("Reversed string: " + result);
        System.out.println("Time for 1000 times: " + resultTime1 + " ms");
        System.out.println("Time for 10000 times: " + resultTime2 + " ms");
        System.out.println("Time for 100000 times: " + resultTime3 + " ms");
    }

    public static String reverse(String str) {
        String rev = "";
        for (int i = str.length()-1; i >= 0; i--) {
            rev += str.charAt(i);
        }
        return rev;
        // or in a shorter way:
        // return new StringBuilder(str).reverse().toString();
    }
}
