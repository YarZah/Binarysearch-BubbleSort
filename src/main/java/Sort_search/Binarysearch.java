package Sort_search;

public class Binarysearch {
    public static int binarySearch(int[] arr, int t) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int half = left + (right - left) / 2;
            if (arr[half] == t) {
                return half; // Знайдено елемент
            }

            if (arr[half] > t) {
                right = half - 1; // Шукаємо в лівій частині
            } else {
                left = half + 1; // Шукаємо в правій частині
            }
        }

        return -1; // Елемент не знайдено
    }
}

