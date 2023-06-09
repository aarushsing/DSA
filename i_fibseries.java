package Day_05;
public class i_fibseries {
    static int fib (int n){
        if (n <= 1){
            return 1;
        }
        int first = fib(n-1);
        int second = fib(n-2);
        int result = first + second;
        return result;
    }

    public static void main(String[] args) {
        System.out.println(fib(5)); 
    }

}
