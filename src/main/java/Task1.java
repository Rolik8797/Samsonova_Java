import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        do {
            System.out.print("Введите число: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Ошибка! Введите целое число.");
                scanner.next();
            }
            number = scanner.nextInt();

            if (number > 7) {
                System.out.println("Привет");
            } else {
                System.out.println("Введенное число не больше 7. Повторите ввод.");
            }
        } while (number <= 7);

        scanner.close();
    }
}