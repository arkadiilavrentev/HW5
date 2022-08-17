import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = generateRandomArray();

        // Задача 1

        System.out.println("Задача 1");
        int month = 0;
        for (int i = 0; i < arr.length; i++) {
            month += arr[i];
        }
        System.out.println("Сумма трат за месяц составила " + month + " рублей.");
        System.out.println();

        // Задача 2

        System.out.println("Задача 2");
        int min = 200_000;
        int max = 100_000;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + min + " рублей.");
        System.out.println("Максимальная сумма трат за день составила " + max + " рублей.");
        System.out.println();

        // Задача 3

        System.out.println("Задача 3");
        float middleSum = month / 30;
        System.out.println("Средняя сумма трат за месяц составила " + middleSum + " рублей.");
        System.out.println();

        // Задача 4

        System.out.println("Задача 4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length; i > 0; i--) {
            System.out.print(reverseFullName[i - 1]);
        }
        System.out.println();
        System.out.println();

        // Задача 5

        System.out.println("Задача 5");
        int[][] matrix = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j || i == 3 - j - 1) {
                    matrix[i][j] = 1;
                }
            }
        }
        for (int[] row : matrix) {
            for (int column : row) {
                System.out.print(column + " ");
            }
            System.out.println();
        }
        System.out.println();

        // Задача 6

        System.out.println("Задача 6");
        int[] array = {5, 4, 3, 2, 1};
        int[] massiv = new int[array.length];
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            massiv[i] = array[array.length - i - 1];
        }
        for (int i = 0; i < array.length; i++) {
            array[i] = massiv[i];
        }
        System.out.println(Arrays.toString(array));
        System.out.println();

        // Задача 7

        System.out.println("Задача 7");
        int[] m = {6, 3, 5, 7, 11};
        System.out.println(Arrays.toString(m));
        for (int i = 0; i < m.length / 2; i++) {
            m[i] = m[m.length - i - 1] - m[i];
            m[m.length - i - 1] = m[m.length - i - 1] - m[i];
            m[i] = m[m.length - i - 1] + m[i];
        }
        System.out.println(Arrays.toString(m));
        System.out.println();

        // Задача 8
        {
            System.out.println("Задача 8");
            int[] numbers = {-6, 2, 5, -8, 8, 10, 4, -7, 12, 1};
            int sum = 0;
            for (int i = 0; i < numbers.length; i++) {
                for (int j = i + 1; j < numbers.length; j++) {
                    sum = numbers[i] + numbers[j];
                    if (sum == -2) {
                        System.out.println(numbers[i] + " " + numbers[j]);
                        break;
                    }
                }
                if (sum == -2) {
                    break;
                }
            }
            System.out.println();
        }
        // Задача 9

        System.out.println("Задача 9");
        int[] numbers = {-6, 2, 5, -8, 8, 10, 4, -7, 12, 1};
        int sum = 0;
        for (int i = 0; i < numbers.length; i++){
            for (int j = i; j < numbers.length; j++){
                sum = numbers[i] + numbers[j];
                if (sum == -2){
                    System.out.println(numbers[i] + " " + numbers[j]);
                }
            }
        }
        System.out.println();
    }
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}