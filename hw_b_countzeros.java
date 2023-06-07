public class hw_b_countzeros {
    public static void main(String[] args) {
        countzeros(4006);

        System.out.println(countzeros_using_rec(430203005, 0));
        
    }

    public static void countzeros(int number){
        int countzero = 0;
        
        while (number != 0){
            
            if ( number % 10 == 0){
                countzero++;  
            }
            number = number/10;

        }
        System.out.println(countzero);
    }

    public static int countzeros_using_rec(int number, int countzero){
        if (number == 0){
            return countzero;
        }
        else if ( number % 10 == 0){
            countzero++;  
        }
        number = number/10;
        return countzeros_using_rec(number, countzero);
    }
    
}
