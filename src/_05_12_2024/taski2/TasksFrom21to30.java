package _05_12_2024.taski2;

import java.util.Arrays;

public class TasksFrom21to30 {

    // 21. Генерация нового массива из четных чисел.
    public static void task21() {
        int[] array = {1, 2, 3, 4, 5, 6};
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 ==0){
                count++;
            }
        }
        int[] newArray = new int[count];
        int k = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0){
                newArray[k++] = array[i];
            }
        }
        System.out.println(Arrays.toString(newArray));
    }

    // 22. Генерация нового массива из нечетных чисел.
    public static void task22() {
        int[] array = {1, 2, 3, 4, 5, 6};
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0){
                count++;
            }
        }
        int[] newArray = new int[count];
        int k = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0){
                newArray[k++] = array[i];
            }
        }
        System.out.println(Arrays.toString(newArray));
    }

    // 23. Проверка на палиндром в массиве строк.
    public static void task23() {
        String[] array = {"level", "hello", "radar", "world"};
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length() / 2; j++) {
                if (array[i].charAt(j) == array[i].charAt(array[i].length() - j -1)){
                    System.out.println(array[i] + " - это палиндром");
                    break;
                }
            }
        }
    }

    // 24. Поиск всех подстрок в строках массива, соответствующих заданному шаблону.
    public static void task24() {
        String[] array = {"apple", "application", "banana", "grape"};
        String pattern = "app";
        for (int i = 0; i < array.length; i++) {
            if (array[i].contains(pattern)){
                System.out.println(array[i]);
            }
        }
    }

    // 25. Создание массива чисел с четными индексами.
    public static void task25() {
        int[] array = {1, 2, 3, 4, 5, 6};
        int[] newArray = new int[array.length];
        int count = 0;
        for (int i = 0; i < array.length; i+=2) {
            newArray[count++] = array[i];
        }
        int[] evenIndexArray = Arrays.copyOf(newArray, count);
        System.out.println(Arrays.toString(evenIndexArray));
    }

    // 26. Создание массива чисел с нечетными индексами.
    public static void task26() {
        int[] array = {1, 2, 3, 4, 5, 6};
        int[] newArray = new int[array.length];
        int count = 0;
        for (int i = 1; i < array.length; i+=2) {
            newArray[count++] = array[i];
        }
        int[] oddIndexArray = Arrays.copyOf(newArray, count);
        System.out.println(Arrays.toString(oddIndexArray));
    }

    // 27. Разделение массива строк на два: строки с четной и нечетной длиной.
    public static void task27() {
        String[] array = {"apple", "banana", "cat", "dog", "elephant"};
        String[] newArray1 = new String[array.length];
        String[] newArray2 = new String[array.length];
        int countEven = 0;
        int countOdd = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i].length() % 2 == 0){
                newArray1[countEven++] = array[i];
            }  else {
                newArray2[countOdd++] = array[i];
            }
        }
        String[] evenLengthArray = Arrays.copyOf(newArray1, countEven);
        String[] oddLengthArray = Arrays.copyOf(newArray2, countOdd);
        System.out.println("Массив строк с четной длиной " + Arrays.toString(evenLengthArray));
        System.out.println("Массив строк с нечетной длиной " + Arrays.toString(oddLengthArray));
    }

    // 28. Найти все строки, которые начинаются и заканчиваются одинаковой буквой.
    public static void task28() {
        String[] array = {"apple", "banana", "level", "radar", "hello"};
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length(); j++) {
                if (array[i].charAt(0) == array[i].charAt(array[i].length() - 1)){
                    System.out.println(array[i]);
                    break;
                }
            }
        }
    }

    // 29. Создать массив чисел, которые являются квадратами элементов исходного массива.
    public static void task29() {
        int[] array = {1, 2, 3, 4, 5};
        int[] squareNumberArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            squareNumberArray[i] = array[i] * array[i];
        }
        System.out.println(Arrays.toString(squareNumberArray));
    }

    // 30. Создать массив строк, содержащих только уникальные символы.
    public static void task30() {
        String[] array = {"apple", "banana", "cat", "dog", "race"};
        String allWords = array[0];

        for (int i = 1; i < array.length; i++) {
            allWords += array[i];
        }

        System.out.println("allWords = " + allWords);

        boolean isUnique = true;
        int countUniqueLetters = 0;
        for (int i = 0; i < allWords.length(); i++) {
            for (int j = 1; i >= j; j++) {
                if (allWords.charAt(i) == allWords.charAt(i-j)) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                countUniqueLetters++;
            }
            isUnique = true;
        }

        String[] arrayUniqueLetters = new String[countUniqueLetters];
        int k = 0;
        for (int i = 0; i < allWords.length(); i++) {
            isUnique = true;
            for (int j = 1; i >= j; j++) {
                if (allWords.charAt(i) == allWords.charAt(i-j)) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                arrayUniqueLetters[k] = String.valueOf(allWords.charAt(i));
                k++;
            }
        }
        System.out.println("arrayUniqueLetters = " + Arrays.toString(arrayUniqueLetters));
    }
}