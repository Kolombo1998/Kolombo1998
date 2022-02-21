import java.util.Random;
import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        System.out.println("Привет пользователь! Хочешь поиграть? Условия довольно просты:" +
                "игра-угадать число от 0 до 9 которое я загадаю;");
        System.out.println();
        System.out.println("Что бы начать первую игру нажми 1");

        Scanner sr = new Scanner(System.in);
        int number = sr.nextInt();
        if (number == 1) {
            guessThenumber();}

    }

    static void guessThenumber() {
        Scanner input = new Scanner(System.in);
        Random numbers = new Random();
        boolean b = false;
        int attempt = 0;
        int random = numbers.nextInt(9);
        System.out.println("Игра угадай число от 0 до 9. Погнали!");

        while (attempt < 3) {
            System.out.println("Введите число от 0 до 9");
            int number = input.nextInt();

            if (number == random) {
                b = true;
                System.out.println("ПОЗДРАВЛЯЮ!!! Не как ты это сделал, но ты угадал!");
                break;
            } else if (number < random) {
                System.out.println("Так так так ну тут почти в точку, но загадано чуть больше");
            } else if (number > random) {
                System.out.println("Мимо, не разочаровывай меня, цифра загадано меньше");
            }
            attempt++;
            {
                if (attempt == 3)
                    System.out.println("К сожалению ваши попытки закончили( Если захотите поиграйте еще раз. Удачи!");
                System.out.println();
            }

        }
        System.out.println();
        main(null);

    }
}
