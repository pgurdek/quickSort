import java.util.ArrayList;

/**
 * Created by pgurdek on 18.04.17.
 */
public class QuickSort {

    public static void sort(ArrayList<Integer> arrayToSort) {
        if (arrayToSort.size() > 1) {
            Integer pivot = arrayToSort.get(0);
            Integer left = 0;
            Integer right = arrayToSort.size() - 1;

            while (left <= right) {

                while (arrayToSort.get(left) < pivot) {
                    left++;
                }
                while (arrayToSort.get(right) > pivot) {
                    right--;
                }
                if (left <= right) {
                    Integer temp = arrayToSort.get(left);
                    arrayToSort.set(left, arrayToSort.get(right));
                    arrayToSort.set(right, temp);
                    left++;
                    right--;
                }

            }

            QuickSort.sort(new ArrayList<Integer>(arrayToSort.subList(0, right+1)));
            QuickSort.sort(new ArrayList<Integer>(arrayToSort.subList(left, arrayToSort.size())));
            System.out.println("TUtaj jestme");
        }
    }
}