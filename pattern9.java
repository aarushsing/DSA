package Day_05.hw_patterns;

public class pattern9 {
  // (pattern name :- full pyramid pattern)
    // using loop
    public static void main(String[] args) {
        int no_of_lines = 8;
        int mid = no_of_lines/2;
        int total_spaces = mid;
        int countstar = 1;
        for(int lines =1 ; lines<= no_of_lines; lines ++){

            for (int space = 1; space<= total_spaces ; space++){
                System.out.print(" ");
            }

            for (int star = 1; star <= countstar; star++ ){
                System.out.print("x");
            }

            if(lines < mid){
                countstar+=2;
                total_spaces--;
            }
            else{
                countstar-=2;
                total_spaces++;
            }
            System.out.println();

        }


     System.out.println("===============================");
    int line= 4;
    int star = 1;
    int count = 0;
     

     printpattern(line,star,count);
    
    
    }
    public static void printpattern(int no_of_lines,int star, int countstar){
           upperpattern(no_of_lines,star);
           lowerpattern(no_of_lines,no_of_lines,star,countstar);
        }
       
        
       // lowerpattern(no_of_lines,mid,star,countstar);
     // printpattern(no_of_lines-1, star, countstar);
       
       


      public static void upperpattern(int no_of_lines,int star){
        if(no_of_lines==0){
            return;
        }        
            printspace((no_of_lines));
            printstar((star));
            
            
            System.out.print("\n");
            upperpattern(no_of_lines-1, star+=2);
      }

      public static void lowerpattern(int no_of_lines,int mid,int star, int countstar){
         if(no_of_lines==1){
            return;
        }
        printspace(countstar+2);
        
        printstar(mid+1);
        //no_of_lines--; 
        System.out.print("\n");

        
        lowerpattern(no_of_lines-1,mid-=2,star+1, countstar+1);

      }

    

        

    public static void printspace(int mid){
        if(mid==0){
            return;
        }     
        System.out.print(" ");
        printspace(mid-1);

    }

    public static void printstar(int star){
        if(star==0){
            return;
        }
        System.out.print("*");
        printstar(star-1);
    }




}
