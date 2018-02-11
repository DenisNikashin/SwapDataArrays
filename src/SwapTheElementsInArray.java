import java.util.Arrays;

public class SwapTheElementsInArray {
    private static int[] dataElements = {3, 4, 6, 17, 9, 11, 13, 2, 1, 5};
    private static int[] arrForSorting = {5, 17, 9, 11, 13, 2};

    public static void main(String[] args) {
        //System.out.println( Arrays.toString(dataElements) + ": initial version ");
        System.out.println( Arrays.toString(arrForSorting) + ": initial version ");
        //fun(dataElements);
        //fun_1(dataElements);
        //fun_2(dataElements);
        //fun_3(dataElements);
        //fun_4(dataElements);
        //fun_5(dataElements);
        //fun_6(dataElements);
        //fun_7(dataElements);
        //fun_8(dataElements);
        //fun_9(dataElements);
        //fun_10(dataElements);
        //fun_11(dataElements);
        //swap(dataElements, 1, 4);
        //fun_12(dataElements);
        //fun_13(dataElements, 10);
        //fun_14(dataElements, 10);
        //fun_15(arrForSorting);
        fun_16(arrForSorting);
        //fun_17(arrForSorting);
        //fun_18(arrForSorting);


    }

    /*цикл для перемещения элемента из ячейки с нулевым индексом в ячейку с индексом [data.length-1] */
    static void fun(int[] data) {
        for (int k = 0; k < data.length-1 ; k++) {
            swap(data, k, k + 1);
        }
    }

    /*1 - вариант цикла для перемещения элемента из ячейки с индексом [data.length-1] в ячейку с нулевым индексом */
    static void fun_1(int[] data) {
        for (int k = data.length - 1; k > 0; k--) {
            swap(data, k, k - 1);
        }
    }

    /*2-й вариант цикла для перемещения элемента из ячейки с индексом [data.length-1] в ячейку с нулевым индексом */
    static void fun_2(int[] data) {
        for (int k = 1; k < data.length; k++) {
            swap(data, 0, k);
        }
    }

    /*3-й вариант цикла для перемещения элемента из ячейки с индексом [data.length-1] в ячейку с нулевым индексом */
    static void fun_3(int[] data) {
        for (int k = 0; k < data.length - 1; k++) {
            swap(data, k, data.length - 1);
        }
    }

    /*цикл для перемещения минимального элемента в конец массива */
    static void fun_4(int[] data) {
        for (int k = 0; k < data.length - 1; k++) {
            if (data[k] < data[k + 1]) {
                swap(data, k, k + 1);
            }
        }
    }

    /*цикл для перемещения минимального элемента в начало массива */
    static void fun_5(int[] data) {
        for (int k = data.length - 1; k > 0; k--) {
            if (data[k] < data[k - 1]) {
                swap(data, k, k - 1);
            }
        }
    }

    /*цикл для перемещения максимального элемента в конец массива */
    static void fun_6(int[] data) {
        for (int k = 0; k < data.length - 1; k++) {
            if (data[k] > data[k + 1]) {
                swap(data, k, k + 1);
            }
        }
    }

    /*1-й вариант цикла для перемещения максимального элемента в начало массива */
    static void fun_7(int[] data) {
        for (int k = data.length - 1; k > 0; k--) {
            if (data[k] > data[k - 1]) {
                swap(data, k, k - 1);
            }
        }
    }

    /*2-й вариант цикла для перемещения максимального элемента в начало массива */
    static void fun_8(int[] data) {
        for (int k = 1; k < data.length; k++) {
            if (data[0] < data[k]) {
                swap(data, 0, k);
            }
        }
    }

    /*цикл для перемещения минимального элемента в начало массива */
    static void fun_9(int[] data) {
        for (int k = 1; k < data.length; k++) {
            if (data[0] > data[k]) {
                swap(data, 0, k);
            }
        }
    }

    /*цикл для перемещения минимального элемента в конец массива */
    static void fun_10(int[] data) {
        for (int k = 0; k < data.length - 1; k++) {
            if (data[k] < data[data.length - 1]) {
                swap(data, k, data.length - 1);
            }
        }
    }

    /*цикл для перемещения максимального элемента в конец массива */
    static void fun_11(int[] data) {
        for (int k = 0; k < data.length - 1; k++) {
            if (data[k] > data[data.length - 1]) {
                swap(data, k, data.length - 1);
            }
        }
    }

    /*код для обмена значениями, значения меняются только у тех ячеек чьи значения индексов
      * совпадают со значениями которые переданы методу */
    private static void swap(int[] data, int src, int dest) {
        int temp = dataElements[src];
        dataElements[src] = dataElements[dest];
        dataElements[dest] = temp;
        System.out.println(Arrays.toString(data));
    }

    /*инвертирование массива*/
    private static void fun_12(int[] array) {
        for (int k = 0; k < array.length / 2; k++) {
            int tmp = array[k];
            array[k] = array[array.length - 1 - k];
            array[array.length - 1 - k] = tmp;
        }
        System.out.println(Arrays.toString(array));
    }

    /*алгоритм для линейного поиска индекса ячейки в котором находиться искомое число,
    * если число не найдено выведиться на консоль просто массив*/
    private static int fun_13(int[] array, int x) {
        for (int k = 0; k < array.length; k++) {
            if (array[k] == x) {
                System.out.println("индекс ячейки в []  в которой находиться число " + x + " --> " + k);
                return k;
            }
            System.out.println(k);
        }

        System.out.println(Arrays.toString(array));
        return -1;
    }

    /*алгоритм бинарного поиска*/
    static int fun_14(int[] array, int x) {
        int low = 0;
            System.out.println("low -> " + low);
        int high = array.length - 1;
            System.out.println("high -> " + high);

        while (low <= high) {
            int mid = (low + high) >>> 1;
            System.out.println("mid --> " + mid);
            int midVal = array[mid];
            if (midVal < x)
                low = mid + 1;
            else if (midVal > x)
                high = mid - 1;
            else

                return mid;
        }
        System.out.println(Arrays.toString(array));
        return -(low + 1);
    }

    /*алгоритм сортировки "пузырьком", при котором на каждом проходе "всплывает" самый большой элемент*/
    static void fun_15(int[] arr) {
        for (int barrier = arr.length - 1; barrier >= 0; barrier--) {

            for (int index = 0; index < barrier; index++) {
                            System.out.println("barrier --> " + barrier + ", index --> " + index);
                if (arr[index] > arr[index + 1]) {
                    int tmp = arr[index];
                            System.out.println("tmp --> " + tmp);
                    arr[index] = arr[index + 1];
                            System.out.println("arr[index] --> " + arr[index]);
                    arr[index + 1] = tmp;
                            System.out.println("arr[index + 1] --> " + arr[index]);
                }
                System.out.println();
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    /*алгоритм сортировки "пузырьком", при котором "тонет" самый маленький элемент*/
    static void fun_16(int[] arr) {
        for (int barrier = 1; barrier < arr.length; barrier++) {
                    System.out.println("barrier --> " + barrier);

            int newElement = arr[barrier];
                    System.out.println("newElement --> " + newElement);

            int location = barrier - 1;
                    System.out.println("location --> " + location);

            while (location >= 0 && arr[location] > newElement) {
                arr[location + 1] = arr[location];
                location--;
            }
            arr[location + 1] = newElement;
                    System.out.println("arr[location+1] --> " + arr[location+1]);
                    System.out.println();
        }
        System.out.println(Arrays.toString(arr));
    }

    /*алгоритм сортировки вставками. Каждый елемент вставляем на свое место*/
    static void fun_17(int[] arr) {
        for (int barrier = 1; barrier < arr.length; barrier++) {
                    System.out.println("barrier --> " + barrier);

            int newElement = arr[barrier];
                    System.out.println("newElement --> " + newElement);

            int location = barrier - 1;
                    System.out.println("location --> " + location);


            while (location >= 0 && arr[location] > newElement) {
                arr[location + 1] = arr[location];
                location--;
            }
            arr[location + 1] = newElement;
                    System.out.println("arr[location + 1] --> " + arr[location + 1]);
                    System.out.println();
        }
        System.out.println(Arrays.toString(arr));
    }

    /*алгоритм сортировки выборками. Ищем наименьший элемент и ставим его в первую ячейку*/
    static void fun_18(int[] array) {
        for (int barrier = 0; barrier < array.length - 1; barrier++) {
            for (int index = barrier + 1; index < array.length; index++) {
                if (array[barrier] > array[index]) {
                    int tmp = array[index];
                    array[index] = array[barrier];
                    array[barrier] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
