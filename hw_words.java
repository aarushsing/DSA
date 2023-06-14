package Day_04;

import java.util.Arrays;

public class hw_words {
    public static void main(String[] args) {
        String[] arr = { "foo", "bar", "world" };
        printls(arr, 0);
    }

    public static void printls(String[] temp, int i) {
        if (i == temp.length) {
            System.out.println(Arrays.toString(temp));
            return;
        }
        String s = temp[i];
        s = s.toUpperCase();
        temp[i] = s;
        printls(temp, i + 1);
    }
}
   