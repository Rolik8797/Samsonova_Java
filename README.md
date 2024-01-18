# Тестовое задание "Алгоритмы - базовая теория"

## Задания:

### 1. Составить алгоритм: если введенное число больше 7, то вывести “Привет”.

<details>
  <summary>Решение</summary>

  ```
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
  ```
</details>

### 2. Составить алгоритм: если введенное имя совпадает с Вячеслав, то вывести “Привет, Вячеслав”, если нет, то вывести "Нет такого имени".

<details>
  <summary>Решение</summary>

  ```
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
  ```
</details>

### 3. Составить алгоритм: на входе есть числовой массив, необходимо вывести элементы массива кратные 3.

<details>
  <summary>Решение</summary>

  ```
 import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int size = scan.nextInt();
        int[] arr = new int[size];

        System.out.println("Введите элементы массива: ");
        for (int i = 0; i < size; i++) {
            arr[i] = scan.nextInt();
        }

        System.out.println("Вывод элементов кратных 3: ");
        for (int i = 0; i < size; i++) {
            if (arr[i] % 3 == 0) {
                System.out.println(arr[i]);
            }
        }
    }
}
  ```
</details>

### 4. Дана скобочная последовательность: [((())()(())]]
- Можно ли считать эту последовательность правильной?
- Если ответ на предыдущий вопрос “нет” - то что необходимо в ней изменить, чтоб она стала правильной?


<details>
  <summary>Решение</summary>

```  
  
Эта последовательность является не правильной, так как не для каждой пары скобок есть своя открывающая и закрывающая скобка.
Правильный вариант [((())()(()))].
  
```

</details>
