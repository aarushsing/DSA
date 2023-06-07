public class hw_c_primeornot {
    public static void main(String[] args) {
        System.out.println(isPrime(31)); 
        System.out.println(isprime_using_rec(31));
        
 
    }
    public static boolean isPrime(int n) {

        if(n == 1) {
            return false;
        }
        for(int i=2; i <= n/2; i++) {
            if(n % i == 0) {
                return false;
            }
        }

        return true;

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
