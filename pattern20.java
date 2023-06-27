package Day_05.hw_patterns;

public class pattern20 {
    public static void main(String[] args) {
        int n =5;
        int count= n-n+1;
        int space = n-1;
        pattern(n,count,space);
    }

    public static void pattern(int n, int count, int space){
         if(count==n){
            return;
         }
         int count1 = 1;
         
         count1(n, count1, count);
         space(space*2);
         count2(count);
         System.out.println();
         pattern(n, count+1, space-1);
    
         
         
    }
    public static void count1(int n, int count1, int number){
        if(count1>number){
            return;
        }
        System.out.print(count1);
        count1(n, count1+1, number);

    }
    public static void space(int n){
    if(n==0){
        return;
    }
    System.out.print(" ");
    space(n-1);
    }
    
    public static void count2(int count){
        if(count==0){
            return;
        }
        System.out.print(count);
        count2(count-1);
    
    }
}
