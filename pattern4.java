package Day_05.hw_patterns;

public class pattern4 {
    public static void main(String[] args) {
        // with iteration
        int lines = 5;
        for (int i = 1; i <= lines; i++) {
            for (int j = i; j <= lines; j++) {
                System.out.print("x");
            }
            System.out.println();
        }

        System.out.println("=========================");

        printpattern(5, 1);


    }

    public static void printpattern(int no_of_lines , int stars){
        if(no_of_lines==0){
            return;
        }
       
        printstar(no_of_lines,stars);
        System.out.println("");

        printpattern(no_of_lines -1, stars+1 );

    }

    public static void printstar(int no_of_lines,int stars){
        if (stars > no_of_lines){
            return;
        }
        
        System.out.print("*");
            

        printstar(no_of_lines,stars-1);
    }

}
    

