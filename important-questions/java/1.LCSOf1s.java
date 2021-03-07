import java.util.*;

class Main {
    public static void main(String[] args) {
        int[] arr = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1 };

        ArrayList<Integer> zeroes = new ArrayList<>();

        zeroes.add(0);

        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i] == 0) {
                zeroes.add(i);
            }
        }

        zeroes.add(arr.length - 1);

        int[] x = zeroes.stream().mapToInt(i -> i).toArray();

        int max = 0;
        int diff = 0;
        int current = 0;

        for (int i = 0; i < x.length - 2; i++) {
            diff = x[i + 2] - x[i];
            if (diff > max) {
                max = diff;
                current = x[i + 1];
            }
        }

        if (x.length == 2 && arr[arr.length - 1] == 0) {
            current = arr.length - 1;
        }

        System.out.println(current);

    }
}