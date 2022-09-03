import org.jetbrains.annotations.NotNull;

import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) throws Exception {
        int[] array = {5, 6, 3, 2, 5, 1, 4, 9};
        //int[] array = {};
        sortArr(array);
        System.out.println(Arrays.toString(array));
        System.out.println("Среднее значение: " + averageArr(array));
    }

    public static int[] sortArr(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int minTemp = array[i];
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[i]) {
                    minTemp = array[j];
                    array[j] = array[i];
                    array[i] = minTemp;
                }
            }
        }
        return array;
    }

    public static int averageArr(int @NotNull [] array) throws Exception {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum / array.length;
    }
}

