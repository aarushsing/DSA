package Day_05.hw_patterns;

public class pattern8 {
      // (pattern name :- odd star pyramid pattern)
    /*   
          *
         ***
        *****
       *******  
                       */

//using loop

      public static void main(String[] args) {
            int no_of_lines=7;
            int total_spaces = no_of_lines-1;

            for (int lines =0 ; lines <= no_of_lines-1; lines++){
                  for(int space = 1; space <= total_spaces; space++){
                        System.out.print(" ");
                  }

                  int starcount = (2*lines)+1;

                  for(int star = 1; star <= starcount; star ++){
                        System.out.print("X");
                  }

                  System.out.println();
                  total_spaces--;
         }

         System.out.println("===============================");
          
         printpattern(7, 1, 0);  

      }


      
//using recursion

      public static void printpattern(int no_of_lines, int stars , int countstar){
        if(no_of_lines==0){
            return;
        }
        
        printspace(no_of_lines -1);
        printstar(stars ,countstar);
        System.out.println();
          

        printpattern(no_of_lines-1, stars+1 ,(stars*2) -1);
    }

    static void printspace(int total_spaces){
        if(total_spaces==0){
            return;
        }
        System.out.print(" ");
        printspace(total_spaces-1);

    }


    static void printstar(int star , int countstar){
        if(countstar == 0){
            return;
        }

        System.out.print("*");
        printstar(star-1, countstar-1);
    }

                       
}
