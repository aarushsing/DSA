package Day_05.hw_patterns;

public class pattern17 {
    public static void main(String[] args) {
        int n =5;
        printpattern(n);
    }

    public static void printpattern(int n){
        int count = 1;
        int space = 0;
        upperpattern(n,n,count, count, space);
        Lowerpattern(n,n,count, count, space);

    }

    public static void upperpattern(int n ,int count_for_n,int count, int count_for_zero, int space){
        if(n==0){
            return;
        }
        star1(count_for_n);
        space(space);
        star1(count_for_n);
      //  star2(count_for_zero, count);
       // star(count_for_zero, count_for_n);
        System.out.println();

        upperpattern(n-1, count_for_n-1,count+1,count_for_zero, space+2);

    }
    public static void Lowerpattern(int n ,int count_for_n,int count, int count_for_zero, int space){
         if(n==0){
            return;
        }

         star2(count_for_zero, count);
         space((2*n)-2);
         star2(count_for_zero, count);
         System.out.println();
         Lowerpattern(n-1, count_for_n-1,count+1,count_for_zero, space-2);
    }

    public static void space(int n){
    if(n==0){
        return;
    }
    System.out.print(" ");
    space(n-1);
    }
    
    public static void star1(int n){
        if(n==0){
            return;
        }
        System.out.print("*");
      star1(n-1);
    }
    public static void star2( int z ,int count){
         if(z==count+1){
            return;
        }
        System.out.print("*");
      star2(z+1, count);
    }
}
