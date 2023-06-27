package Day_05.hw_patterns;

public class pattern19 {
    public static void main(String[] args) {
        pattern(5);
    }

    public static void pattern(int n){
        int count =5;

        upperpattern(n-2, count);

        int count2=1;
        lowerpattern(n*2+1, count2);

    }

    public static void upperpattern(int n, int count){
        if(n==0){
            return;
        }

        space(n);
        star(count);
        space(n*2-1);
        star(count);
        
        System.out.println();
        upperpattern(n-1, count+2);

    }

    public static void lowerpattern(int n, int count){
        if(n==0){
            return;
        }

        if(n==11){
            int mid = n/2;
            //space(count);
            star(mid);
            System.out.print("AarushSingh");
            star(mid);
        }
        else {
        space(count-1);
        star((n*2)-1);
        }
      
        System.out.println();
        lowerpattern(n-1, count+1);
    }



    
      public static void space(int n){
    if(n==0){
        return;
    }
    System.out.print(" ");
    space(n-1);
    }
    
    public static void star(int n){
        if(n==0){
            return;
        }
        System.out.print("*");
      star(n-1);
    }
}
