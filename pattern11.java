package Day_05.hw_patterns;

public class pattern11 {
  public static void main(String[] args) {
        pattern(5,0 );
    }

    public static void pattern(int n, int row){
        if(row == n){
            return;
        }
        star(0,row, n);
        System.out.println();
        pattern(n, row+1);

     
    }

    public static void star(int col , int row , int n){
        if(col == n){
            return;
        }
        if((col == row)|| (row+col==n-1)){
            System.out.print("*");
        }else{
            System.out.print(" ");
        }
        star(col+1, row, n);

    }

    
}
