import java.io.*;

class Main {

    public static PrintStream ps = System.out;

    public static int jump(int[] n) {
        int len = n.length - 1, curr = -1, next = 0, ans = 0;
        for (int i = 0; next < len; i++) {
            if (i > curr) {
                ans++;
                curr = next;
            }
            ;
            next = Math.max(next, n[i] + i);
        }
        ;
        return ans;
    };

    public static void main(String... s) {
        ps.println(jump(new int[] { 2, 3, 1, 1, 4 }));
    }
}