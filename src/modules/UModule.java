package modules;

import utility.List;
import utility.Comparator;

/*************************************************************
 * Update for utility package. These will be identical with
 * TModule, however you are using your implementation of
 * List and Comparator.
 *************************************************************/

public class UModule {

    // TODO : Place Generic Methods from TModule with utility package version.

    /*************************************************************
     * Recursive Implementation of QuickSort with Comparable.
     *************************************************************/
    private static <T extends Comparable<T>> int partition(List<T> data, int low, int high) {
        boolean done    = false;
        int midpoint    = (low + high) / 2;
        T pivot         = data.get(midpoint);

        while (!done) {
            while (data.get(low).compareTo(pivot) < 0) {
                ++low;
            }
            while (pivot.compareTo(data.get(high)) < 0) {
                --high;
            }
            if (low >= high) {
                done = true;
            } else {
                swap(data, low, high);
                ++low;
                --high;
            }
        }
        return high;
    }

    public static <T extends Comparable<T>> void quickSort(List<T> data) {
        int last = data.size() - 1;
        quickSort(data, 0, last);
    }

    private static <T extends Comparable<T>> void quickSort(List<T> data, int min, int max) {
        int mid;
        if (min < max) {
            mid = partition(data, min, max);
            quickSort(data, min, mid);
            quickSort(data, mid + 1, max);
        }
    }

    /*************************************************************
     * Recursive Implementation of QuickSort with Comparator.
     *************************************************************/
    private static <T> int partition(List<T> data, int low, int high, Comparator<T> comp) {
        boolean done    = false;
        int midpoint    = (low + high) / 2;
        T pivot         = data.get(midpoint);

        while (!done) {
            while (comp.compare(data.get(low), pivot) < 0) {
                ++low;
            }
            while (comp.compare(pivot, data.get(high)) < 0) {
                --high;
            }
            if (low >= high) {
                done = true;
            } else {
                swap(data, low, high);
                ++low;
                --high;
            }
        }
        return high;
    }

    public static <T> void quickSort(List<T> data, Comparator<T> comp) {
        int last = data.size() - 1;
        quickSort(data, 0, last, comp);
    }

    private static <T> void quickSort(List<T> data, int min, int max, Comparator<T> comp) {
        int mid;
        if (min < max) {
            mid = partition(data, min, max, comp);
            quickSort(data, min, mid, comp);
            quickSort(data, mid + 1, max, comp);
        }

        //Otherwise, Base Case: DO NOTHING
    }

    /*************************************************************
     * Swaps through finding indexes.
     *************************************************************/
    public static <T> void swap(List<T> data, int a, int b) {
        //TODO: COMPLETE BODY
        T _a = data.get(a);
        T _b = data.get(b);
        data.set(a, _b);
        data.set(b, _a);
    }
}
