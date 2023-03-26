//Вывести все простые числа от 1 до 1000
//(простое число - то число которое делится без остатка только на 1 и на само себя (1 - это не простое число))

package lesson1.task;

public class Homework3 {
    public static void getSimpleNumbers() {
        String rez = "";
        int count = 0;
        for (int i = 2; i <= 1000 ; i++) {
            for (int j = i - 1; j >= 1 ; j--) {
                if (i % j == 0 && j != 1) {
                    break;
                } else if (i % j == 0 && j == 1) {
                    rez += " " + i;
                    count++;
                    if (count ==10) {
                        System.out.println(rez);
                        rez = "";
                        count = 0;

                    }
                }
            }
        }

    }
}
