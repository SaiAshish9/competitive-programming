import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

class Main {

    static PrintStream ps = System.out;

    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new LinkedList<>();
        boolean[] visited = new boolean[nums.length];
        dfs(nums, res, new LinkedList<Integer>(), visited);
        return res;
    }

    private static void dfs(int[] nums, List<List<Integer>> res, List<Integer> curr, boolean[] visited) {
        if (curr.size() == nums.length) {
            res.add(new LinkedList<Integer>(curr));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (visited[i] == false) {
                visited[i] = true;
                curr.add(nums[i]);
                dfs(nums, res, curr, visited);
                curr.remove(curr.size() - 1);
                visited[i] = false;
            }
        }
    }

    public static void main(String... s) {
        List<List<Integer>> res = permute(new int[] { 1, 2, 3 });
        for (List<Integer> l : res) {
            ps.println(l.stream().map(n -> String.valueOf(n)).collect(Collectors.joining(",", "[", "]")));
        }
    }

}
