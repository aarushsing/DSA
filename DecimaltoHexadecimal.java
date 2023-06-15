package Day_09;

import java.io.*;
import java.util.*;

class Solution {
    public String convert(int n) {
        int decimal = octalToDecimal(n);
        return decimalToHexadecimal(decimal);
    }

    private int octalToDecimal(int n) {
        int decimal = 0;
        int base = 1;
        while (n > 0) {
            int lastDigit = n % 10;
            decimal += lastDigit * base;
            base *= 8;
            n /= 10;
        }
        return decimal;
    }

    private String decimalToHexadecimal(int n) {
        StringBuilder result = new StringBuilder();
        while (n > 0) {
            int remainder = n % 16;
            char hexDigit = getHexDigit(remainder);
            result.insert(0, hexDigit);
            n /= 16;
        }
        return result.toString();
    }

    private char getHexDigit(int n) {
        if (n >= 0 && n <= 9) {
            return (char) (n + '0');
        } else {
            return (char) (n - 10 + 'A');
        }
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        // Reading N and K
        String str = bufferedReader.readLine().trim();
        int n = Integer.parseInt(str);
        Solution solution = new Solution();
        String result = solution.convert(n);
        System.out.println(result);
    }
}
