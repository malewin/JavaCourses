package homework;

import java.util.Arrays;

public class hw3mergeSort {
    public class Main {
        public static int[] mergeSort(int[] sortArr) {
            int[] buffer1 = Arrays.copyOf(sortArr, sortArr.length);
            int[] buffer2 = new int[sortArr.length];
            int[] result = mergeSortInner(buffer1, buffer2, 0, sortArr.length);
            return result;
        }
        
        public static int[] mergeSortInner(int[] buffer1, int[] buffer2, int startIndex, int endIndex) {
            if (startIndex >= endIndex - 1) {
                return buffer1;
            }
            
            //уже отсортирован
            int middle = startIndex + (endIndex - startIndex) / 2;
            int[] sorted1 = mergeSortInner(buffer1, buffer2, startIndex, middle);
            int[] sorted2 = mergeSortInner(buffer1, buffer2, middle, endIndex);
            
            //слияние
            int index1 = startIndex;
            int index2 = middle;
            int destIndex = startIndex;
            int[] result = sorted1 == buffer1 ? buffer2 : buffer1;
            while (index1 < middle && index2 < endIndex) {
                result[destIndex++] = sorted1[index1] < sorted2[index2]
                ? sorted1[index1++] : sorted2[index2++];
            }
            while (index1 < middle) {
                result[destIndex++] = sorted1[index1++];
            }
            while (index2 < endIndex) {
                result[destIndex++] = sorted2[index2++];
            }
            return result;
        }
        public static void main(String args[]) {
            int[] sortArr = {5, 1, 6, 2, 3, 4};
            int[] result = mergeSort(sortArr);
            System.out.println(Arrays.toString(result));
        }
}
    // public static void main(String[] args) {
        
    // }
    // public static ArrayList<Integer>[] mergeSort(Integer[] arr1, Integer[] arr2){
    //     ArrayList<Integer> res = new ArrayList<>();
    //     int i = 0, j = 0, k = 0;
    //     while (i < arr1.length && j < arr2.length) {
    //         res[k++] = arr1[i] < arr2[j] ? arr1[i++] : arr2[j++];
    //     }
    //     if (i < arr1.length) {
    //         arraycopy(arr1, i, res, k, arr1.length - i);
    //     } else if (j < a2.length) {
    //         arraycopy(arr2, j, res, k, arr2.length - j);
    //     }
    // }
}
