public class hw_a_countdigit {
    public static void main(String[] args) {
        countdigit(43235);

       System.out.println(countdigit_by_rec(43235,0)); 
    }

    public static void countdigit(int number){
        int count = 0;
        while (number != 0){
            number = number / 10;
            count++;
        }
        System.out.println(count);
    }
    
    public static int countdigit_by_rec(int number , int count){
        if (number == 0){          // terminating case
            return count;
        }
        number = number / 10;   // processing logic
        count++;                 // smallproblem
        return countdigit_by_rec(number, count);
        
    }
     
}
