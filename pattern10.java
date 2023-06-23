package Day_05.hw_patterns;

public class pattern10 {
    public static void main(String[] args) {
        pattern(9, 1);
    }

    public static void pattern(int n, int star){
        if(n==0){
            return;
        }
     space(n-1);
     star(star);
     System.out.println();

     pattern(n-1, star);
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
