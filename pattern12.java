package Day_05.hw_patterns;
// (pattern name :- right pascal triangle)

public class pattern12 {
    public static void main(String[] args) {
        pattern(9, 1);
    }

    public static void pattern (int n, int star){
        if(n==0){
            return;
        }
        star(star);
        System.out.println();

        if(star<n){
            star++;
        }
        else {
            star--;
        }

        pattern(n-1, star);

    }
    
    
    public static void star(int s){
        if(s==0){
            return;
        }
        System.out.print("*");
      star(s-1);
    }
}
