package Day_05.hw_patterns;

public class pattern3 {
    public static void main(String[] args) {
        // with iteration
        int lines = 5;
        for (int i = 1; i <= lines; i++) {
            for (int j = 1; j <= i; j++) {
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
       
        printstar(stars);
        System.out.println("");

        printpattern(no_of_lines -1, stars+1 );

    }

    public static void printstar(int stars){
        if (stars == 0){
            return;
        }       
        System.out.print("*");
        printstar(stars-1);
    }
}