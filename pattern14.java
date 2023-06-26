package Day_05.hw_patterns;

public class pattern14 {
public static void main(String[] args) {
    pattern(4, 1,1);
    
}


public static void pattern( int n , int count, int start){
    if(n==0){
        return;
    }
    count = pattern(count, start);
    System.out.println();
    pattern(n-1, count, start+1);
}

public static int pattern(int count, int start){
        if(start==0){
            return count;
        }
        System.out.print(count);
       
        
      return pattern(count+1, start-1);
    }

}