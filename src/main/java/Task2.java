import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name;

        do {
            System.out.println("Введите имя: ");
            name = scanner.nextLine();

            if (name.equals("Вячеслав")) {
                System.out.println("Привет, Вячеслав");
            } else {
                System.out.println("Нет такого имени. Повторите ввод.");
            }
        } while (!name.equals("Вячеслав"));

        scanner.close();
    }
}