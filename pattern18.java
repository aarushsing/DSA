package Day_05.hw_patterns;

public class pattern18 {
    public static void main(String[] args) {
        pattern(5);
    }

    public static void pattern(int n){
        upperpattern(n);
        int space = 1;
        lowerpattern(n-1, space);

    }

    public static void upperpattern(int n){
        if(n==0){
            return;
        }
        space(n-1);
        star(n);
        System.out.println();
        upperpattern(n-1);


    }
    public static void lowerpattern(int n, int space){
        if(n==0){
            return;
        }
        space(space);
        star(space+1);
        System.out.println();

        lowerpattern(n-1, space+1);

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
