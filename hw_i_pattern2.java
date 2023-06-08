public class hw_i_pattern2 {
    
    static void print_row(int no, int val) {
        // base case
        if (no == 0)
        return;
        System.out.print((char) (val + 64));
        print_row(no - 1, val);
        }
        static void pattern(int n, int num) {
        // base case
        if (n == 0)
        return;
        print_row(num - n + 1, num - n + 1);
        System.out.println();
        pattern(n - 1, num);
        }
        // Driver code
        public static void main(String[] args) {
        int n = 5;
        pattern(n, n);
        }
}
