import java.util.Arrays;

public class SortingMain {
    public static void main(String[] args) {
        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
        SortingMain.sort(numbers);
    }

    public static int smallest(int[] array){
        int smallest = array[0];

        for (int i : array){
            if (i < smallest){
                smallest = i;
            }
        }
        return smallest;
    }

    public static int indexOfSmallest(int[] array){
        int smallest = SortingMain.smallest(array);
        int index = 0;

        for (int i = 0; i < array.length ; i++){
            if (array[i] == smallest){
                index = i;
            }
        }
        return index;
    }

    public static int indexOfSmallestFrom(int[] table, int startIndex){
        int smallest = table[startIndex];
        int index = startIndex;

        for (int i = startIndex; i < table.length ; i++){
            if (table[i] < smallest){
                index = i;
                smallest = table[i];
            }
        }
        return index;
    }

    public static void swap(int[] array, int index1, int index2) {
        int helper = array[index2];
        array[index2] = array[index1];
        array[index1] = helper;
    }

    public static void sort(int[] array) {
        int smallest = 0;
        for (int i = 0; i < array.length ; i++){
            smallest = indexOfSmallestFrom(array, i);
            swap(array, i, smallest);
            System.out.println(Arrays.toString(array));
        }
    }
}
