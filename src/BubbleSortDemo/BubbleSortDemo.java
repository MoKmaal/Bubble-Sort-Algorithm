
package BubbleSortDemo;

import bubblesort.BubbleSort;

/**
 *
 * @author mohammed
 */
public class BubbleSortDemo {

    public static void main(String[] args) {
        int[] array = {1, 95, 42, 32, 74, 12, 10, 6, 100, 0};
        BubbleSort bubbleSort = new BubbleSort(array);

        bubbleSort.sort();

    }

}
