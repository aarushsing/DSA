public class hw_i_pattern3 {

    // function
    static void print_space(int space) {
        // base case
        if (space == 0)
            return;
        System.out.print(" ");
        print_space(space - 1);
    }

    static void print_asterisk(int asterisk) {
        if (asterisk == 0)
            return;
        System.out.print("* ");
        print_asterisk(asterisk - 1);
    }

    static void pattern(int n, int num) {
        // base case
        if (n == 0)
            return;
        print_space(n - 1);
        print_asterisk(num - n + 1);
        System.out.println("");
        pattern(n - 1, num);
    }

    // Driver code
    public static void main(String[] args) {
        int n = 5;
        pattern(n, n);
    }
}
