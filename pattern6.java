package Day_05.hw_patterns;

public class pattern6 {
    public static void main(String[] args) {

        // (pattern name :-Mirror Inverted half pyramid pattern) ,mirror of pattern4

        //with iteration
        int no_of_lines =5;
        int total_spaces = 0;

        for (int line =no_of_lines; line>= 1;line--){

            for(int space =1 ; space <= total_spaces ; space++){
                System.out.print(" ");
            }
            
            for(int star = line; star>=1 ; star--){
                System.out.print("x");
            }
            System.out.println();
            total_spaces++;
        
        }

    }
    
}
