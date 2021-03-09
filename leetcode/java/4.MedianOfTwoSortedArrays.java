import java.util.*;

class Main {
    public static double findMedianSortedArrays(List<Integer> arr1, List<Integer> arr2) {
        List<Integer> list = new ArrayList<Integer>();
        list.addAll(arr1);
        list.addAll(arr2);
        Collections.sort(list);
        // list.stream().forEach(System.out::println);
        double median = 0;
        int mid;
        if (list.size() == 0) {
            return Double.valueOf(list.get(0));
        }
        // new Double
        mid = list.size() / 2;
        if (list.size() % 2 != 0) {
            median = list.get(mid);
        } else {
            median = (list.get(mid - 1) + list.get(mid)) / 2.0;
        }
        return median;
    }

    public static void main(String[] args) {
        System.out.println("Median : " + findMedianSortedArrays(Arrays.asList(1, 4), Arrays.asList(2, 5)));
    }
}