package ru.job4j.array;

public class SortSelected {
    public static int[] sort(int[] data) {
        for (int i = 0; i < data.length; i++) {    // i - номер текущего шага
            int index = i;
            int min = data[i];
            // цикл выбора наименьшего элемента
            for (int j = i + 1; j < data.length; j++) {
                if (data[j] < min) {
                    index = j;    // index - индекс наименьшего элемента
                    min = data[j];
                }
            }
            data[index] = data[i];
            data[i] = min;    // меняем местами наименьший с data[i]
        }
        return data ;
    }
}
