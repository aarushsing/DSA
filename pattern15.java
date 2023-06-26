package Day_05.hw_patterns;
// (pattern name :- Inverted pyramid with star pattern)
public class pattern15 {
    public static void main(String[] args) {
        int line =5;
        int count =1;
        int space = 0;
        int dummy = line;
        pattern(line, count, space, dummy);
        
    }

   public static void pattern(int line,int count, int space, int dummy){
    if (line ==0){
        return;
    }

    int formula = ((2*dummy)-(2*count-1));
    space(space);
    star(formula);
    System.out.println();
    
    pattern(line-1, count+1, space+1, dummy);

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
