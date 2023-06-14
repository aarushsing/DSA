package Day_04;

import java.util.ArrayList;

public class hw_product {

    
    public static void prod(ArrayList<Integer> list, int i, int prod) {
        // base case
        if (i == list.size()) {
            System.out.println(prod);
             return;
        }
        prod(list, i + 1, prod * list.get(i));

    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        // list = 1 2 3 4 5
        // prod = 120
        prod(list, 0,1);
//
    }


}
