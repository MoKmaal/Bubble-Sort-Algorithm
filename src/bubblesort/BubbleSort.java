/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bubblesort;

import java.util.Arrays;

/**
 *
 * @author mohammed
 */
public class BubbleSort {

    int[] array;
    int length;

    public BubbleSort(int[] array) {
        this.array = array;
        length = array.length;

    }

    /**
     *
     * @param first large element
     * @param second small element
     * @return large element;
     */
    public int swap(int first, int second) {
        return first;
    }

    public void sort() {
        for (int i = 0; i < length - 1; i++) {
            bubbleSort(i);
        }
        printArray();
    }

    private void printArray() {
        for (int number : array) {
            System.out.print(number + "\t");
        }
    }

    private void bubbleSort(int i) {
        for (int index = 0; index < length - i - 1; index++) {
            if (array[index] > array[index + 1]) {

                array[index] = swap(array[index + 1], array[index + 1] = array[index]);
            }
        }
    }
}
