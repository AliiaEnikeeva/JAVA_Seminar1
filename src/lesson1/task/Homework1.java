//Вычислить n-ое треугольного число (сумма чисел от 1 до n)

package lesson1.task;

import java.util.Scanner;

public class Homework1 {
    public static void getSumNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество членов прогрессии: ");
        int number = Integer.parseInt(scanner.next());
        int sumN = 0;
        for (int i = 1; i <= number; i++) {
            sumN = sumN + i;
            }
        System.out.println("Сумма натуральных чисел равно: " + sumN);
        }
}
