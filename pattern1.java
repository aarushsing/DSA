package Day_05.hw_patterns;
// (pattern name :- star square pattern)
public class pattern1 {
 
    public static void main(String[] args) {
        // with iteration
        int lines = 5;
        for (int i = 1; i <= lines; i++) {
            for (int j = 1; j <= lines; j++) {
                System.out.print("x");
            }
            System.out.println();
        }

        System.out.println("=========================");

        //with recursion

        printpattern(5, 5,0);
   
   
    }

    //with recursion
    public static void printpattern(int no_of_lines, int noOfStar, int count){
        if (no_of_lines == 0){
            return;
        }
        printstar(noOfStar,count);
        System.out.println();
        printpattern(no_of_lines - 1, noOfStar , count);


    }


    public static void printstar(int noOfStar, int count){
        if(count == noOfStar){
            return;
        }
        System.out.print("*");
        printstar(noOfStar, count+1);

    }
    
}
 