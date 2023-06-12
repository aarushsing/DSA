package Day_05.hw_patterns;

public class pattern7 {
    // (pattern name :-pyramid pattern)
    public static void main(String[] args) {
         //using loop 
        int no_of_lines =5;
        int total_spaces = no_of_lines-1;

        for(int lines =1; lines <= no_of_lines; lines++){

            for(int space = 1; space <= total_spaces; space++){
                System.out.print(" ");
            }
            for (int star = 1; star <= lines; star++ ){
                System.out.print("x ");
            }

            System.out.println();
            total_spaces--;
        }
        System.out.println("========================");

        //using recursion

        printpattern(5, 1);

    }

    public static void printpattern(int no_of_lines, int stars ){
        if(no_of_lines==0){
            return;
        }
        
        printspace(no_of_lines -1);
        printstar(stars);
        System.out.println();
          

        printpattern(no_of_lines-1, stars+1);
    }

    static void printspace(int total_spaces){
        if(total_spaces==0){
            return;
        }
        System.out.print(" ");
        printspace(total_spaces-1);

    }


    static void printstar(int star){
        if(star == 0){
            return;
        }
        System.out.print("* ");
        printstar(star-1);
    }
}

