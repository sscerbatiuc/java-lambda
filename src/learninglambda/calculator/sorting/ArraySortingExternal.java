/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learninglambda.calculator.sorting;

import java.util.Arrays;

/**
 *
 * @author sscerbatiuc
 */
public class ArraySortingExternal {

    public static void main(String[] args) {
        int[] array = new int[]{5, 4, 3, 2, 1};
        System.out.println("Before sorting: ");
        printArray(array);
        sort(array);

    }

    /**
     * This method uses bubble sort to sort the array.
     * @param array 
     */
    public static void sort(int[] array) {
        int n = array.length;
        int temp;
        for (int i = 0; i < n; i++) {
            System.out.println("Повторение: " + (i + 1));
            for (int j = 1; j < (n - i); j++) {
                System.out.println("Сравниваем " + array[j - 1] + " и " + array[j]);
                if (array[j - 1] > array[j]) {
                    // Swap
                    temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                    printArray(array);
                }

            }
        }
    }
    
    static void printArray(int[] array){
        System.out.print("[ ");
        for(int number: array){
            System.out.print(number + " ");
        }
        System.out.print("]\n");
    }
}
