//Вычислить n! (произведение чисел от 1 до n)

package lesson1.task;

import java.util.Scanner;

public class Homework2 {
    public static void getSqrtNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество членов прогрессии: ");
        int number = Integer.parseInt(scanner.next());
        int sqrt = 1;
        for (int i = 1; i <= number; i++) {
            sqrt = sqrt * i;
            }
        System.out.println("Произведение натуральных чисел равно: " + sqrt);
    }
}
