package _16_12_2024;

public class ForEachEx {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int num : arr) {
            int arrL = arr.length;
            if(num % 2 == 0) {
                System.out.println(num);
            }
            arrL--;
        }

        for (int i = 0; i < arr.length / 2; i++) {
            if(arr[i] % 2 == 0) {
                System.out.println(arr[i]);
            }
        }
    }
}
