public class hw_i_pattern1 {
    public static void main(String[] args) {
        int n = 5;
        printPattern(n, 1, 1);
        
    }

    static void printPattern(int rows, int count , int num) {
        if(rows == 0) {
            return;
        }
        count =  printnumber(count, num);
        System.out.println();
        
        printPattern(rows - 1, count, num+1);
    }    

    static int printnumber(int ct, int number) {
        // Base Case
        if(number == 0) 
            return ct;
        System.out.print(ct + " ");
        return printnumber(ct+1,number-1);

    }
}
