public class hw_d_generateprime {
    public static void main(String[] args) {
        
        for(int i=250; i<360; i++) {
            if(isprime_using_rec(i)) {    
                System.out.println("Number " + i + " is a prime number");
                
            }
        }
        
    }
    
    
    
    public static boolean isprime_using_rec(int number){
        if (number == 1){
            return false;
        }
        else {
            for(int i=2; i <= number/2; i++) {
                if(number % i == 0) {
                    return false;
                  }
             }

         }
         return true;
    
    }
}
