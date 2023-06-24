package Day_05.hw_patterns;

public class pattern13 {
    public static void main(String[] args) {
        int n =10;
        int mid = n/2;
        int space = n/2;
        int star = 1;
        int start = 1;

        pattern(n, mid, space, star, start);
    }

    public static void pattern (int n,int mid, int space ,int star, int start){
        if(start==n){
            return;
        }
         space(space);
         star(star);
         
        
         if(start < mid){
            space--;
            star++;
         }
         if (start >= mid){
            space++;
            star--;
         }
         System.out.println();
         pattern(n, mid, space, star, start+1);
    
    }
    
       
   public static void space(int n){
    if(n==0){
        return;
    }
    System.out.print(" ");
    space(n-1);
    }
    
    public static void star(int s){
        if(s==0){
            return;
        }
        System.out.print("*");
      star(s-1);
    }
}
