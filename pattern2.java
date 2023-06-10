package Day_05.hw_patterns;

// (pattern name :-Hollow square star  pattern)
public class pattern2 {
    public static void main(String[] args) {
    int no_of_lines = 5;

    for (int line = 1;line<=no_of_lines;line++){
        for (int star =1; star <= no_of_lines; star++) {
            if (line == 1 || line == 5 || star == 1 || star == no_of_lines) {
                System.out.print("x");
            }
            else{
                System.out.print(" ");
            }
        }
        System.out.println();
    }
            System.out.println("=========================");

    printpattern(5, 5,1);

        
    }


    public static void printpattern (int no_of_lines, int stars , int count ){
        if(no_of_lines==0){
            return;
        }
       
        printstar(no_of_lines,stars, count);
        System.out.println("");

        printpattern(no_of_lines -1, stars, count);

    }

    public static void printstar(int no_of_lines,int stars, int count ){
        if (count > stars){
            return;
        }
        if (no_of_lines == 1 || no_of_lines == 5 || count == 1 || count == stars) {
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }

        printstar(no_of_lines,stars, count+1);
    }
    
}
